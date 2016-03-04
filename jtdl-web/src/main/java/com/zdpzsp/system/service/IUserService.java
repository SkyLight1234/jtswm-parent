package com.zdpzsp.system.service;

import com.zdpzsp.system.exception.ServiceException;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public interface IUserService {

    void register();


    void login(String userName, String password, HttpSession session) throws ServiceException;


}
