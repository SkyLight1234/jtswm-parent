package com.zdpzsp.report.listener;

import com.zdpzsp.report.service.IReportService;
import com.zdpzsp.report.utils.ReportUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class ReportListerner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext applicationContext= WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        IReportService reportService=applicationContext.getBean("reportService",IReportService.class);
        ReportUtil.init(reportService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
