package com.zdpzsp.system.service;

import com.zdpzsp.system.bo.SysHost;
import com.zdpzsp.system.bo.SysRoles;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.vo.RegisterUserVo;
import com.zdpzsp.system.vo.UserInfoVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public interface IUserService {

    void register(RegisterUserVo registerUserVo) throws Exception;
    void sendValidateCode(String valicateCode,String email, HttpSession session) throws ServiceException;
    void login(String userName, String password, HttpSession session) throws  ServiceException,Exception;

    Map<Long,SysRoles> getSysRolesMap(Integer enable);

    void updateUser(UserInfoVo userInfoVo, HttpServletRequest request) throws ServiceException;

    Map<String, SysHost> getCurrentHost(Integer enable);
}
