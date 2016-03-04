package com.zdpzsp.report.service;

import com.zdpzsp.report.bo.RptCfgHeads;
import com.zdpzsp.report.bo.RptCfgMains;
import com.zdpzsp.report.bo.RptCfgQueries;
import com.zdpzsp.report.vo.ReportDownVo;
import com.zdpzsp.report.vo.ReportPage;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgQueries.RptCfgQueriesReturnVo;
import com.zdpzsp.system.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xiaxia on 2015/11/23 .
 */
public interface IReportService {
    List<RptCfgMains> getRptCfgMainsList(byte isUsed);

    List<RptCfgHeads> getRptCfgHeadsList(byte isUsed);

    List<RptCfgQueries> getRptCfgQueriesList(byte isUsed);

    List<RptCfgMainsRootReturnVo> getUserRptCfgMainsListByRptType(String rptType, HttpServletRequest request) throws ServiceException;

    RptCfgHeadsRootReturnVo getRptCfgHeadsByRptId(Long rptId, HttpServletRequest request) throws  ServiceException;

    List<RptCfgQueriesReturnVo> getRptCfgQueriesByRptId(Long rptId, HttpServletRequest request) throws ServiceException;

    ReportPage queryRpt(Long rptId, String headsIds, String queriesIds, Integer pageNo, Integer numSize, HttpServletRequest request) throws ServiceException;

    ReportDownVo downRpt(Long rptId, String headsIds, String queriesIds, HttpServletRequest request) throws ServiceException;
}
