package com.zdpzsp.note.service.impl;

import com.google.common.collect.Maps;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.frame.vo.UserInfoVo;
import com.zdpzsp.note.bo.*;
import com.zdpzsp.note.service.INoteService;
import com.zdpzsp.note.vo.WorkBookVo;
import com.zdpzsp.system.SystemConst;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.utils.UserInfoUtil;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangdepeng on 16/3/12.
 */
public class NoteServiceImpl implements INoteService {

    private WorkBookLabelMapper workBookLabelMapper;
    private ResFileMapper resFileMapper;
    @Override
    public List<WorkBookVo> getWorkBookLabelByUserId(Long userId) throws InvocationTargetException, IllegalAccessException, ServiceException {
        if (userId == null) {
            throw new ServiceException(ResultCode.param_err);
        }
        ResFileExample resFileExample = new ResFileExample();
        resFileExample.isDistinct();
        resFileExample.or();
        Map<Long, ResFile> resFileMap = Maps.uniqueIndex(resFileMapper.selectByExample(resFileExample), a -> a.getRes_id());
        WorkBookLabelExample example=new WorkBookLabelExample();
        example.or().andUser_idEqualTo(userId);
        List<WorkBookLabel> workBookLabels = workBookLabelMapper.selectByExample(example);
        List<WorkBookVo> workBookVoList = new ArrayList<WorkBookVo>(workBookLabels.size());
        WorkBookVo workBookVo=null;

        for (int i=0;i<workBookLabels.size();i++)
        {
            workBookVo=new WorkBookVo();
            BeanUtils.copyProperties(workBookLabels.get(i),workBookVo);
            if (workBookVo.getIs_file()>0) {
                workBookVo.setResFile(resFileMap.get(workBookVo.getRes_id()));
            }
        }
        return workBookVoList;
    }

    @Override
    public List<WorkBookVo> getWorkBooklabelFormCurrentUser(HttpServletRequest req) throws InvocationTargetException, IllegalAccessException, ServiceException {
        UserInfoVo userInfo= WebUtils.getUserInfoVo(req);
        if (userInfo==null)
        {
            throw new ServiceException(ResultCode.user_login_no_user);
        }
        Long userId = userInfo.getSysUser().getSysUserId();
        ResFileExample resFileExample = new ResFileExample();
        resFileExample.isDistinct();
        resFileExample.or();
        Map<Long, ResFile> resFileMap = Maps.uniqueIndex(resFileMapper.selectByExample(resFileExample), a -> a.getRes_id());
        WorkBookLabelExample example=new WorkBookLabelExample();

        example.or().andUser_idEqualTo(userId);
        List<WorkBookLabel> workBookLabels = workBookLabelMapper.selectByExample(example);
        List<WorkBookVo> workBookVoList = new ArrayList<WorkBookVo>(workBookLabels.size());
        WorkBookVo workBookVo=null;

        for (int i=0;i<workBookLabels.size();i++)
        {
            workBookVo=new WorkBookVo();
            BeanUtils.copyProperties(workBookLabels.get(i),workBookVo);
            if (workBookVo.getIs_file()>0) {
                workBookVo.setResFile(resFileMap.get(workBookVo.getRes_id()));
            }
        }
        return workBookVoList;
    }

    @Override
    public InputStream getFileByResId(Long resId) throws ServiceException {
        ResFile resFile = resFileMapper.selectByPrimaryKey(resId);
        String path = UserInfoUtil.realPath +SystemConst.GobalCfg.Paths.Filepath.value+ "/"+resFile.getFile_code()+resFile.getRes_file_suffix();
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ServiceException(ResultCode.sys_file_read_err);
        }
        return inputStream;
    }


    public WorkBookLabelMapper getWorkBookLabelMapper() {
        return workBookLabelMapper;
    }

    public void setWorkBookLabelMapper(WorkBookLabelMapper workBookLabelMapper) {
        this.workBookLabelMapper = workBookLabelMapper;
    }

    public ResFileMapper getResFileMapper() {
        return resFileMapper;
    }

    public void setResFileMapper(ResFileMapper resFileMapper) {
        this.resFileMapper = resFileMapper;
    }

    public static void main(String[] args) {
//        Function<String, Integer> strlen = new Function<String, Integer>() {
//            public Integer apply(String from) {
//                Preconditions.checkNotNull(from);
//                return from.length();
//            }
//        };
//        List<String> from = Lists.newArrayList("abc", "defg", "hijkl");
//        List<Integer> to = Lists.transform(from, strlen);
//        for (int i = 0; i < from.size(); i++) {
//            System.out.printf("%s has length %d\n", from.get(i), to.get(i));
//        }
        System.out.println(SystemConst.GobalCfg.Paths.Filepath.value);
    }
}
