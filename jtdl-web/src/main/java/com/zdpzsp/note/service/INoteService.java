package com.zdpzsp.note.service;

import com.zdpzsp.note.vo.WorkBookVo;
import com.zdpzsp.system.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by zhangdepeng on 16/3/12.
 */
public interface INoteService {
    public List<WorkBookVo> getWorkBookLabelByUserId(Long userId) throws InvocationTargetException, IllegalAccessException;

    public List<WorkBookVo> getWorkBooklabelFormCurrentUser(HttpServletRequest req) throws InvocationTargetException, IllegalAccessException, ServiceException;
    public InputStream getFileByResId(Long resId);
}
