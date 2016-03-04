package com.zdpzsp.report.web;

import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.report.service.IReportService;
import com.zdpzsp.report.vo.ReportDownVo;
import com.zdpzsp.report.vo.ReportPage;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgQueries.RptCfgQueriesReturnVo;
import com.zdpzsp.system.exception.ServiceException;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;


/**
 * Created by xiaxia on 2015/11/23 .
 */
public class ReportAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request;
    private IReportService reportService;
    private String downloadChineseFileName;

    private String rptType;
    private Long rptId;
    private String headsIds;
    private String queriesIds;
    private Integer pageNo = 1;
    private Integer pageSize = 0;


    private InputStream inputStream;

    public String getUserRptCfgMainsList() throws Exception {

        try {
            List<RptCfgMainsRootReturnVo> rptCfgMainsesList=reportService.getUserRptCfgMainsListByRptType(rptType,request);
            inputStream= WebUtils.succee(rptCfgMainsesList);
        } catch (ServiceException e) {
            inputStream=WebUtils.error(e);
        }catch (Exception e)
        {
            e.printStackTrace();
            inputStream=WebUtils.error(ResultCode.sys_err);
        }

        return "data";
    }

    public String getRptCfgHeadsByRptId() throws Exception {
        try {
            RptCfgHeadsRootReturnVo rptCfgHeadsRootReturnVo=reportService.getRptCfgHeadsByRptId(rptId,request);
            inputStream=WebUtils.succee(rptCfgHeadsRootReturnVo);
        } catch (ServiceException e) {
            inputStream=WebUtils.error(e);
        }catch (Exception e)
        {
            e.printStackTrace();
            inputStream=WebUtils.error(ResultCode.sys_err);
        }

        return "data";
    }

    public String getRptCfgQueriesByRptId() throws Exception {
        try {
            List<RptCfgQueriesReturnVo> rptCfgQueriesReturnVos= reportService.getRptCfgQueriesByRptId(rptId,request);
            inputStream=WebUtils.succee(rptCfgQueriesReturnVos);
        } catch (ServiceException e) {
            inputStream=WebUtils.error(e);
        }catch (Exception e)
        {
            e.printStackTrace();
            inputStream=WebUtils.error(ResultCode.sys_err);
        }

        return "data";
    }
    public String queryRpt() throws Exception {
        try {
            ReportPage reportPage=reportService.queryRpt(rptId,headsIds,queriesIds,pageNo,pageSize,request);
            inputStream=WebUtils.succee(reportPage);
        } catch (ServiceException e) {
            inputStream=WebUtils.error(e);
        }catch (Exception e)
        {
            e.printStackTrace();
            inputStream=WebUtils.error(ResultCode.sys_err);
        }

        return "data";
    }

    public String downRpt()
    {
        try {
            ReportDownVo downRpt=reportService.downRpt(rptId,headsIds,queriesIds,request);
            inputStream=downRpt.getData();
            downloadChineseFileName=downRpt.getName();
        } catch (ServiceException e) {
            e.printStackTrace();
            inputStream=WebUtils.error(e);
            return "data";
        }catch (Exception e)
        {
            e.printStackTrace();
            inputStream=WebUtils.error(ResultCode.sys_err);
            return "data";
        }
        return "down";
    }



    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;
    }

    public IReportService getReportService() {
        return reportService;
    }

    public void setReportService(IReportService reportService) {
        this.reportService = reportService;
    }

    public String getRptType() {
        return rptType;
    }

    public void setRptType(String rptType) {
        this.rptType = rptType;
    }

    public Long getRptId() {
        return rptId;
    }

    public void setRptId(Long rptId) {
        this.rptId = rptId;
    }

    public String getHeadsIds() {
        return headsIds;
    }

    public void setHeadsIds(String headsIds) {
        this.headsIds = headsIds;
    }

    public String getQueriesIds() {
        return queriesIds;
    }

    public void setQueriesIds(String queriesIds) {
        this.queriesIds = queriesIds;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getDownloadChineseFileName() {
        return downloadChineseFileName;
    }

    public void setDownloadChineseFileName(String downloadChineseFileName) {
        this.downloadChineseFileName = downloadChineseFileName;
    }
}
