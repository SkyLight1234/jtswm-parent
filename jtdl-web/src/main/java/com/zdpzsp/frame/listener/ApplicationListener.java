package com.zdpzsp.frame.listener;


import com.zdpzsp.frame.service.ICommService;
import com.zdpzsp.frame.task.CacheTask;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;

public class ApplicationListener implements ServletContextListener {

	private Timer timer = null;


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if(timer!=null)
			timer.cancel();

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 加载系统缓存
		ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
		ICommService commService = (ICommService)app.getBean("commService");
		arg0.getServletContext().setAttribute("viewParamMap", commService.loadCacheMap());
		//设置任务计划，启动和间隔时间 半小时
		System.out.println("ApplicationListener finish");
		timer = new Timer(true);
	    timer.scheduleAtFixedRate(new CacheTask(), 1800000, 1800000);

	}



}
