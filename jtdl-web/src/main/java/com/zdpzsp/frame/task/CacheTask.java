package com.zdpzsp.frame.task;


import com.zdpzsp.frame.bo.View_param;
import com.zdpzsp.frame.service.ICommService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.TimerTask;

public class CacheTask extends TimerTask {

	@Override
	public void run() {
		// 加载系统缓存
				List<View_param> viewParam;
				ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
				ICommService commService = (ICommService)app.getBean("commService");
				/*Date date = new Date();
				Timestamp t = new Timestamp(date.getTime());
				System.out.println("重新加载缓存开始"+ TimeUtil.dateToStrSimpleYMDHMS(t));*/
				try {
					WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
					ServletContext servletContext = webApplicationContext.getServletContext();
					servletContext.setAttribute("viewParamMap", commService.loadCacheMap());
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
