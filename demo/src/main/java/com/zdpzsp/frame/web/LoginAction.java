package com.zdpzsp.frame.web;

import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class LoginAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request;
    private IUserService userService;

    private InputStream inputStream;
    private String userName;
    private String password;


    public String login(){
        try {

            userService.login(userName,password,request.getSession() );
            inputStream=WebUtils.succeeMessage("登录成功");
        }catch (ServiceException e)
        {
            inputStream=WebUtils.error(e);
        }catch (Exception e) {
            inputStream=WebUtils.error(ResultCode.sys_err);
            e.printStackTrace();
        }
        return "data";
    }

    public String register()
    {

        return "data";
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }



}
