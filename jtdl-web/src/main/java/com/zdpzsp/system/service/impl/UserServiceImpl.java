package com.zdpzsp.system.service.impl;

import com.google.common.collect.Maps;
import com.zdpzsp.frame.FrameConst;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.exception.DESDecryptException;
import com.zdpzsp.frame.utils.DES;
import com.zdpzsp.system.SystemConst;
import com.zdpzsp.system.bo.*;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.service.IUserService;
import com.zdpzsp.system.utils.IpUtil;
import com.zdpzsp.system.utils.MailUtil;
import com.zdpzsp.system.utils.UserInfoUtil;
import com.zdpzsp.system.utils.vo.EmailContent;
import com.zdpzsp.system.vo.RegisterUserVo;
import com.zdpzsp.system.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class UserServiceImpl implements IUserService {

    private SysUserMapper sysUserMapper;
    private SysRolesMapper sysRolesMapper;
    private SysHostMapper sysHostMapper;
    @Override
    public void register(RegisterUserVo registerUserVo) throws Exception {
        String sysPassword = registerUserVo.getSysPassword();
        String encrypt = DES.encrypt(sysPassword);
        registerUserVo.setSysPassword(encrypt);
        SysUser sysUser = new SysUser();
        Object convert;
        BeanUtils.copyProperties(registerUserVo, sysUser);
        sysUser.setState(SystemConst.GobalCfg.State.enable);
        sysUserMapper.insert(sysUser);
    }

//    http://localhost:8080/system/User!register?callback=jQuery214027138677798211575_1457794741861&registerUserVo%5BsysAccount%5D=123113&registerUserVo%5BsysPassword%5D=11111111&registerUserVo%5BuserEmail%5D=1032960260%40qq.com&_=1457794741863

    public void sendValidateCode(String valicateCode, String email, HttpSession session) throws ServiceException {
        EmailContent emailContent = new EmailContent();
        emailContent.setSubject("验证码");
        emailContent.setContent(valicateCode);
        emailContent.setReceice_mail(email);
        try {
            MailUtil.send_email(emailContent);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServiceException(ResultCode.user_email_valicate_err);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void login(String userName, String password, HttpSession session) throws ServiceException, Exception {

        if (!StringUtils.hasLength(userName)) {
            throw new ServiceException(ResultCode.user_login_user_disable);
        }
        if (!StringUtils.hasLength(userName)) {
            throw new ServiceException(ResultCode.user_login_pass_no_eq);
        }
        SysUserExample example = new SysUserExample();
        example.or().andSysAccountEqualTo(userName).andStateEqualTo(SystemConst.GobalCfg.State.enable);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysUsers)) {
            throw new ServiceException(ResultCode.user_login_no_user);
        } else {
            SysUser sysUser = sysUsers.get(0);
            String decrypt = null;
            try {
                decrypt = DES.decrypt(sysUser.getSysPassword());
                if (decrypt.equals(password)) {


                    session.setAttribute(FrameConst.SessionNames.userInfo, sysUser);
                }
            } catch (DESDecryptException e) {
                e.printStackTrace();
                throw new ServiceException(ResultCode.user_login_pass_no_eq);
            }

        }

       /*  try {
            if (userName == null || password == null) {
                //参数错误
                throw new ServiceException(ResultCode.param_err);
            }
            SysUser sysUser = this.getSysUserByUserName(userName);
            if (sysUser == null) //用户不存在
            {
                throw new ServiceException(ResultCode.user_login_no_user);
            } else if (SystemConst.SysUserConst.state.enabled != sysUser.getState())//账号禁用
            {
                throw new ServiceException(ResultCode.user_login_user_disable);
            } else if (!sysUser.getLogin_pwd().equals(DES.encrypt(password)))//密码错误
            {
                throw new ServiceException(ResultCode.user_login_pass_no_eq);
            }

            List<SysRoles> sysRolesList = this.getSysRolesByUserId(sysUser.getUser_id());
            if (sysRolesList.isEmpty()) {
                throw new ServiceException(ResultCode.user_login_no_role);
            }

            List<Long> sysRoleIdList = new ArrayList<Long>();
            for (SysRoles sysRoles : sysRolesList) {
                sysRoleIdList.add(sysRoles.getId());
            }
            List<SyMenu> sysMenuList = getSysMenusByRoleIds(sysRoleIdList);
            if (sysMenuList.isEmpty()) {
                throw new ServiceException(ResultCode.user_login_no_menu);
            }


            List<SysStations> sysStationsList = this.getSysStationsByUserId(sysUser.getUser_id());
            List<SysOrganization> sysOrganizationList = new ArrayList<SysOrganization>();
            Set<Long> sysOrganizationIdsSet = new HashSet<Long>();
            if (!sysStationsList.isEmpty()) {
                List<Long> stationsIdList = new ArrayList<Long>();
                for (SysStations sysStations : sysStationsList) {
                    stationsIdList.add(sysStations.getId());
                }
                sysOrganizationList = this.getSysOrganizationByStationIds(stationsIdList);
                sysOrganizationIdsSet = this.getSysRepByStationIds(stationsIdList);
            }


            UserInfoVo userInfoVo = new UserInfoVo();
            userInfoVo.setSysUser(sysUser);
            userInfoVo.setSysRolesList(sysRolesList);
            userInfoVo.setSysMenus(sysMenuList);
            userInfoVo.setSysStationsList(sysStationsList);
            userInfoVo.setSysOrganizations(sysOrganizationList);
            userInfoVo.setRepIds(sysOrganizationIdsSet);
            session.setAttribute(FrameConst.SessionNames.userInfo, userInfoVo);
        } catch (DESEncryptException e) {
            throw new ServiceException(ResultCode.user_login_pass_encrypt_err);
        } catch (ServiceException e) {
            throw e;
        }*/
    }

    @Override
    public Map<Long, SysRoles> getSysRolesMap(Integer enable) {
        SysRolesExample example = new SysRolesExample();
        example.or().andStateEqualTo(enable);
        List<SysRoles> sysRoles = sysRolesMapper.selectByExample(example);
        final Map<Long, SysRoles> map = Maps.uniqueIndex(sysRoles, c -> c.getSysRoleId());
        return map;
    }

    @Override
    public void updateUser(UserInfoVo userInfoVo) {
        SysUser sysUser=new SysUser();
        BeanUtils.copyProperties(userInfoVo, sysUser);

        sysUserMapper.updateByPrimaryKeySelective(sysUser);

    }

    @Override
    public Map<String, SysHost> getCurrentHost(Integer enable) {

        SysHost localhost = this.getLocalhost(IpUtil.getLocalHostIP());
        if (localhost == null) {
            localhost=new SysHost();
            localhost.setState(SystemConst.GobalCfg.State.enable);
            localhost.setCreate_at(System.currentTimeMillis());
            localhost.setSys_host_name(IpUtil.getLocalHostName());
            localhost.setHost_ip(IpUtil.getLocalHostIP());
            localhost.setHost_type(SystemConst.SYS_HOST.HOST_TYPE.value);
            localhost.setSys_host_head(UserInfoUtil.realPath);
            sysHostMapper.insert(localhost);
        }
        Map<String, SysHost> map = new HashMap<String, SysHost>();
        map.put(IpUtil.getLocalHostIP(), localhost);
        return map;
    }

    private SysHost getLocalhost(String hostip) {
        SysHostExample example=new SysHostExample();
        example.or().andHost_ipEqualTo(hostip);
        example.setDistinct(true);
        List<SysHost> sysHosts = sysHostMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(sysHosts)) {
            return sysHosts.get(0);
        }
        return null;
    }

    public SysUserMapper getSysUserMapper() {
        return sysUserMapper;
    }

    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    public SysRolesMapper getSysRolesMapper() {
        return sysRolesMapper;
    }

    public void setSysRolesMapper(SysRolesMapper sysRolesMapper) {
        this.sysRolesMapper = sysRolesMapper;
    }

    public SysHostMapper getSysHostMapper() {
        return sysHostMapper;
    }

    public void setSysHostMapper(SysHostMapper sysHostMapper) {
        this.sysHostMapper = sysHostMapper;
    }
}
