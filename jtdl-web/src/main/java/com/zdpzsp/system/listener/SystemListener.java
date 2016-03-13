package com.zdpzsp.system.listener;

import com.zdpzsp.system.service.IUserService;
import com.zdpzsp.system.utils.UserInfoUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by xiaxia on 2015/11/26 .
 */
public class SystemListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext applicationContext= WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
//        applicationContext.getServletContext().getRealPath(/)
        IUserService userService=applicationContext.getBean("userService",IUserService.class);
        UserInfoUtil.init(userService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
