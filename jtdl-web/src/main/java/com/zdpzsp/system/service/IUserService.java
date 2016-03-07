package com.zdpzsp.system.service;

import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.vo.RegisterUserVo;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public interface IUserService {

    void register(RegisterUserVo registerUserVo) throws ServiceException;
    void sendValidateCode(String valicateCode,String email, HttpSession session) throws ServiceException;
    void login(String userName, String password, HttpSession session) throws ServiceException;


}
