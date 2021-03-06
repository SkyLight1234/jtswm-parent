package com.zdpzsp.note.web;

import com.opensymphony.xwork2.ActionSupport;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.note.service.INoteService;
import com.zdpzsp.note.vo.WorkBookVo;
import com.zdpzsp.system.exception.ServiceException;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;

/**
 * Created by zhangdepeng on 16/3/11.
 */
public class NoteAction extends ActionSupport implements ServletRequestAware {
    private InputStream inputStream;

    private INoteService noteService;
    private Long userId;
    private String callback;
    private HttpServletRequest request;
    private Long resId;
    private String fileContext;

    public String getDictoriesByUserId() {
        try {
            List<WorkBookVo> workBookLabelByUserId = noteService.getWorkBookLabelByUserId(getUserId());
            inputStream = WebUtils.succee(getCallback(), workBookLabelByUserId);
        } catch (ServiceException e) {
            inputStream = WebUtils.error(callback,e);
            e.printStackTrace();
        } catch (Exception e) {
            inputStream = WebUtils.error(callback,ResultCode.sys_err);
            e.printStackTrace();
        }
        return "data";
    }

    public String getDictoriesFromCurrentUser()
    {
        try {
            List<WorkBookVo> workBookLabelByUserId = noteService.getWorkBooklabelFormCurrentUser(request);
            inputStream = WebUtils.succee(getCallback(), workBookLabelByUserId);
        } catch (ServiceException e) {
            inputStream = WebUtils.error(callback,e);
            e.printStackTrace();
        } catch (Exception e) {
            inputStream = WebUtils.error(callback,ResultCode.sys_err);
            e.printStackTrace();
        }
        return "data";
    }

    public String getFileByResId() {
        try {
            InputStream fileInputStream = noteService.getFileByResId(getResId());
            inputStream = WebUtils.succee(getCallback(), fileInputStream);
        } catch (ServiceException e) {
            inputStream = WebUtils.error(callback,e);
            e.printStackTrace();
        } catch (Exception e) {
            inputStream = WebUtils.error(callback,ResultCode.sys_err);
            e.printStackTrace();
        }
        return "data";
    }

    public String saveFile()
    {
        try {
            InputStream fileInputStream = noteService.saveFile(getResId());
            inputStream = WebUtils.succee(getCallback(), fileInputStream);
        } catch (ServiceException e) {
            inputStream = WebUtils.error(callback,e);
            e.printStackTrace();
        } catch (Exception e) {
            inputStream = WebUtils.error(callback,ResultCode.sys_err);
            e.printStackTrace();
        }
        return "data";
    }


    public INoteService getNoteService() {
        return noteService;
    }

    public void setNoteService(INoteService noteService) {
        this.noteService = noteService;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request=httpServletRequest;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFileContext() {
        return fileContext;
    }

    public void setFileContext(String fileContext) {
        this.fileContext = fileContext;
    }
}
