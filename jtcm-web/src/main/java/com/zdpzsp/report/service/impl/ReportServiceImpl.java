package com.zdpzsp.report.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.bo.SqlMapper;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.frame.vo.UserInfoVo;
import com.zdpzsp.report.ReportConst;
import com.zdpzsp.report.bo.*;
import com.zdpzsp.report.service.IReportService;
import com.zdpzsp.report.utils.ReportUtil;
import com.zdpzsp.report.vo.QueryRptQueriesVo;
import com.zdpzsp.report.vo.ReportDownVo;
import com.zdpzsp.report.vo.ReportPage;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsOneReturnVo;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsRootVo;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsTwoReturnVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsReturnVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsRootReturnVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsRootVo;
import com.zdpzsp.report.vo.rptCfgQueries.RptCfgQueriesReturnVo;
import com.zdpzsp.system.bo.SysOrganization;
import com.zdpzsp.system.exception.ServiceException;
import com.xiaxia.util.download.IExcelDownloadUtils;
import com.xiaxia.util.download.beans.ExcelMultiTitle;
import com.xiaxia.util.download.imp.ExcelDownloadUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by xiaxia on 2015/11/23 .
 */
public class ReportServiceImpl implements IReportService {
    private SqlMapper sqlMapper;
    private RptCfgMainsMapper rptCfgMainsMapper;
    private RptCfgHeadsMapper rptCfgHeadsMapper;
    private RptCfgQueriesMapper rptCfgQueriesMapper;

    @Override
    public List<RptCfgMains> getRptCfgMainsList(byte isUsed) {
        RptCfgMainsExample rptCfgMainsExample=new RptCfgMainsExample();
        rptCfgMainsExample.or().andIs_usedEqualTo(isUsed);
        rptCfgMainsExample.setOrderByClause("id");
        return rptCfgMainsMapper.selectByExample(rptCfgMainsExample);
    }

    @Override
    public List<RptCfgHeads> getRptCfgHeadsList(byte isUsed) {
        RptCfgHeadsExample rptCfgHeadsExample=new RptCfgHeadsExample();
        rptCfgHeadsExample.or().andIs_usedEqualTo(isUsed);
        rptCfgHeadsExample.setOrderByClause("order_id");
        return rptCfgHeadsMapper.selectByExample(rptCfgHeadsExample);
    }

    @Override
    public List<RptCfgQueries> getRptCfgQueriesList(byte isUsed) {
        RptCfgQueriesExample rptCfgHeadsExample=new RptCfgQueriesExample();
        rptCfgHeadsExample.or().andIs_usedEqualTo(isUsed);
        rptCfgHeadsExample.setOrderByClause("order_id");
        return rptCfgQueriesMapper.selectByExample(rptCfgHeadsExample);
    }

    @Override
    public List<RptCfgMainsRootReturnVo> getUserRptCfgMainsListByRptType(String rptType, HttpServletRequest request) throws ServiceException {
        UserInfoVo userInfoVo= WebUtils.getUserInfoVo(request);
        if(userInfoVo==null)
        {
           throw new ServiceException(ResultCode.user_no_login);
        }

        Set<Long> repIds=userInfoVo.getRepIds();
        if(repIds==null||repIds.isEmpty())
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }

        List<RptCfgMainsRootVo> rptCfgMainsMap=ReportUtil.getRptCfgMainsListByRptType(rptType);
        if(rptCfgMainsMap==null||rptCfgMainsMap.isEmpty())
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }
        List<RptCfgMainsRootReturnVo> rptCfgMainsRootReturnVos=new ArrayList<RptCfgMainsRootReturnVo>();

        for (RptCfgMainsRootVo rptCfgMainsRootVo:rptCfgMainsMap)
        {
            List<RptCfgMainsReturnVo> rptCfgMainsReturnVos=new ArrayList<RptCfgMainsReturnVo>();
            List<RptCfgMains> rptCfgMainses=rptCfgMainsRootVo.getRptCfgMainsList();
            for (RptCfgMains rptCfgMains:rptCfgMainses)
            {
                if(repIds.contains(rptCfgMains.getId())||repIds.contains(9999l))
                {
                    RptCfgMainsReturnVo rptCfgMainsReturnVo=new RptCfgMainsReturnVo();
                    rptCfgMainsReturnVo.setRptId(rptCfgMains.getId());
                    rptCfgMainsReturnVo.setRptName(rptCfgMains.getRpt_name());
                    rptCfgMainsReturnVos.add(rptCfgMainsReturnVo);
                }
            }
            if(!rptCfgMainsReturnVos.isEmpty())
            {
                RptCfgMainsRootReturnVo rptCfgMainsRootReturnVo=new RptCfgMainsRootReturnVo();
                rptCfgMainsRootReturnVo.setRptName(rptCfgMainsRootVo.getRootRptCfgMains().getRpt_name());
                rptCfgMainsRootReturnVo.setRptCfgMainsReturnVos(rptCfgMainsReturnVos);
                rptCfgMainsRootReturnVos.add(rptCfgMainsRootReturnVo);
            }
        }

        if(rptCfgMainsRootReturnVos.isEmpty())
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }

        return rptCfgMainsRootReturnVos;
    }

    @Override
    public RptCfgHeadsRootReturnVo getRptCfgHeadsByRptId(Long rptId, HttpServletRequest request) throws ServiceException {
        UserInfoVo userInfoVo= WebUtils.getUserInfoVo(request);
        if(userInfoVo==null)
        {
            throw new ServiceException(ResultCode.user_no_login);
        }
        Set<Long> repIds=userInfoVo.getRepIds();
        if(repIds==null||repIds.isEmpty()||(repIds.contains(9999l)?false:!repIds.contains(rptId)))
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }


        RptCfgHeadsRootReturnVo rptCfgHeadsRootReturnVos=new RptCfgHeadsRootReturnVo();
        RptCfgHeadsRootVo rptCfgHeads=ReportUtil.getRptCfgHeadsByRptId(rptId);
        if(rptCfgHeads==null)
        {
            throw new ServiceException(ResultCode.report_no_head);
        }
        List<RptCfgHeads> oneRptCfgHeadsList=rptCfgHeads.getOneRptCfgHeadsList();
        List<RptCfgHeadsOneReturnVo>  rptCfgHeadsOneReturnVos=new ArrayList<RptCfgHeadsOneReturnVo>();
        for (RptCfgHeads rptCfgHeads1:oneRptCfgHeadsList)
        {
            RptCfgHeadsOneReturnVo rptCfgHeadsOneReturnVo=new RptCfgHeadsOneReturnVo();
            rptCfgHeadsOneReturnVo.setHeadId(rptCfgHeads1.getId());
            rptCfgHeadsOneReturnVo.setHeadName(rptCfgHeads1.getHead_name());
            rptCfgHeadsOneReturnVo.setHeadCol(rptCfgHeads1.getHead_col());
            rptCfgHeadsOneReturnVo.setOrderId(rptCfgHeads1.getOrder_id());
            rptCfgHeadsOneReturnVo.setUpHeadId(rptCfgHeads1.getUp_head_id());
            rptCfgHeadsOneReturnVos.add(rptCfgHeadsOneReturnVo);
        }
        rptCfgHeadsRootReturnVos.setRptCfgHeadsOneReturnVos(rptCfgHeadsOneReturnVos);

        List<RptCfgHeads> tworptCfgHeadses=rptCfgHeads.getTwoRptCfgHeadsList();
        if(tworptCfgHeadses!=null&&!tworptCfgHeadses.isEmpty())
        {
            List<RptCfgHeadsTwoReturnVo> rptCfgHeadsTwoReturnVos=new ArrayList<RptCfgHeadsTwoReturnVo>();
            for (RptCfgHeads rptCfgHeads1:tworptCfgHeadses)
            {
                RptCfgHeadsTwoReturnVo rptCfgHeadsTwoReturnVo=new RptCfgHeadsTwoReturnVo();
                rptCfgHeadsTwoReturnVo.setHeadId(rptCfgHeads1.getId());
                rptCfgHeadsTwoReturnVo.setHeadName(rptCfgHeads1.getHead_name());
                rptCfgHeadsTwoReturnVos.add(rptCfgHeadsTwoReturnVo);
            }
            rptCfgHeadsRootReturnVos.setRptCfgHeadsTwoReturnVos(rptCfgHeadsTwoReturnVos);
        }


        return rptCfgHeadsRootReturnVos;
    }

    @Override
    public  List<RptCfgQueriesReturnVo> getRptCfgQueriesByRptId(Long rptId, HttpServletRequest request) throws ServiceException {
        UserInfoVo userInfoVo= WebUtils.getUserInfoVo(request);
        if(userInfoVo==null)
        {
            throw new ServiceException(ResultCode.user_no_login);
        }
        Set<Long> repIds=userInfoVo.getRepIds();
        if(repIds==null||repIds.isEmpty()||(repIds.contains(9999l)?false:!repIds.contains(rptId)))
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }

        List<RptCfgQueries> rptCfgQueriesList=ReportUtil.getRptCfgQueriesByRptId(rptId);
        List<RptCfgQueriesReturnVo> rptCfgQueriesRootReturnVos=new ArrayList<RptCfgQueriesReturnVo>();

        for (RptCfgQueries rptCfgQueries:rptCfgQueriesList)
        {
            RptCfgQueriesReturnVo rptCfgQueriesReturnVo=new RptCfgQueriesReturnVo();
            rptCfgQueriesReturnVo.setQueryId(rptCfgQueries.getId());
            rptCfgQueriesReturnVo.setQueryName(rptCfgQueries.getQuery_name());
            rptCfgQueriesReturnVo.setQueryType(rptCfgQueries.getQuery_type());
            rptCfgQueriesReturnVo.setQueryData(rptCfgQueries.getQuery_data());
            rptCfgQueriesReturnVo.setOrderId(rptCfgQueries.getOrder_id());
            rptCfgQueriesRootReturnVos.add(rptCfgQueriesReturnVo);
        }
        return rptCfgQueriesRootReturnVos;

    }

    @Override
    public ReportPage queryRpt(Long rptId, String headsIds, String queriesIds, Integer pageNo, Integer pageSize, HttpServletRequest request) throws ServiceException {
        UserInfoVo userInfoVo= WebUtils.getUserInfoVo(request);
        if(userInfoVo==null)
        {
            throw new ServiceException(ResultCode.user_no_login);
        }
        Set<Long> repIds=userInfoVo.getRepIds();
        if(repIds==null||repIds.isEmpty()||(repIds.contains(9999l)?false:!repIds.contains(rptId)))
        {
            throw new ServiceException(ResultCode.report_no_jurisdiction);
        }

        RptCfgMains rptCfgMains=ReportUtil.getRptCfgMainsById(rptId);
        if(rptCfgMains==null)
        {
            throw new ServiceException(ResultCode.param_err);
        }
        String sqlMain=rptCfgMains.getMain_sql();
        String[] headsIdsz=headsIds.split(",");

        if(headsIdsz.length<=0)
        {
            throw new ServiceException(ResultCode.param_err);
        }
        StringBuilder headsql=new StringBuilder("select ");

        Map<Long,RptCfgHeads> rptCfgHeadses=ReportUtil.getRptCfgHeadsMapByRptId(rptId);

        boolean headsone=false;
        for (String headsIdsStr:headsIdsz)
        {
            Long headsIdsLong=Long.parseLong(headsIdsStr);
            RptCfgHeads rptCfgHeads=rptCfgHeadses.get(headsIdsLong);
            if(rptCfgHeads==null)
            {
                throw new ServiceException(ResultCode.report_no_head_has_one);
            }
            if(headsone)
            {
                headsql.append(" , ");
            }
            headsql.append(" ").append(rptCfgHeads.getHead_col()).append(" ");
            headsone=true;
        }

        Map<Long,String> longQueryRptQueriesVoMap=new HashMap<Long, String>();
        if(queriesIds!=null&&!"".equals(queriesIds))
        {
            List<QueryRptQueriesVo> queryRptQueriesVos=JSONArray.parseArray(queriesIds, QueryRptQueriesVo.class);
            for (QueryRptQueriesVo queryRptQueriesVo:queryRptQueriesVos)
            {
                longQueryRptQueriesVoMap.put(queryRptQueriesVo.getQueryId(),queryRptQueriesVo.getQueryValue());
            }
        }

        Map<Long,RptCfgQueries> longRptCfgQueriesMap= ReportUtil.getRptCfgQueriesMapByRptId(rptId);
        boolean queriesone=false;
        String queriesSql="";
        if(!longRptCfgQueriesMap.isEmpty()) {
            List<SysOrganization> sysOrganizationList=userInfoVo.getSysOrganizations();
            if(sysOrganizationList.isEmpty())
            {
                throw new ServiceException(ResultCode.report_no_org);
            }
            Set<Long> userOrgIds=new HashSet<Long>();
            for (SysOrganization sysOrganization:sysOrganizationList)
            {
                userOrgIds.add(sysOrganization.getOrg_id());
            }

            for (Long key:longRptCfgQueriesMap.keySet())
            {
                if (queriesone) {
                    queriesSql += " and ";
                }
                RptCfgQueries rptCfgQueries=longRptCfgQueriesMap.get(key);
                String v=longQueryRptQueriesVoMap.get(key);
                if(ReportConst.RptCfgQueriesConst.QueryType.iorg.toUpperCase().equals(rptCfgQueries.getQuery_type().toUpperCase()))
                {
                    if(v==null||"9999".equals(v))
                    {
                        String uOrg="";
                        boolean isone=false;
                        for (Long aLong:userOrgIds)
                        {
                            if(isone)
                            {
                                uOrg+=" ,";
                            }
                            uOrg+=" "+aLong;
                            isone=true;
                        }
                        queriesSql += "  " + rptCfgQueries.getQuery_col() + " in (" + uOrg + ") ";
                        continue;
                    }else if(! userOrgIds.contains(Long.parseLong(v)))
                    {
                        throw new ServiceException(ResultCode.report_no_user_org);
                    }
                }
                queriesSql += "  " + rptCfgQueries.getQuery_col() + " " + rptCfgQueries.getQuery_operator() + " " + v + " ";
                queriesone = true;

            }
        }
        sqlMain=sqlMain.replace("1=1",queriesSql);

        ReportPage reportPage=new ReportPage();
        System.out.println(headsql.toString()+" "+sqlMain);
        List<Map<String, Object>>  maps=sqlMapper.selectList(headsql.toString()+" "+sqlMain);

        reportPage.setData(maps);
        reportPage.setPageNo(pageNo);
        reportPage.setPageSize(pageSize);
        if(pageSize>0)
        {
            List<Map<String, Object>>  maps2= sqlMapper.selectList("select count(1) as totalRecord"+sqlMain+" limit "+((pageNo-1)*pageSize)+","+pageSize);
            reportPage.setTotalRecord(Integer.parseInt(maps2.get(0).get("totalRecord").toString()));
            reportPage.setTotalPage((reportPage.getTotalRecord()+reportPage.getPageSize()-1)/reportPage.getPageSize());
        }else
        {
            reportPage.setTotalRecord(0);
            reportPage.setTotalPage(0);
        }


        return reportPage;
    }

    @Override
    public ReportDownVo downRpt(Long rptId, String headsIds, String queriesIds, HttpServletRequest request) throws ServiceException {

        ReportPage reportPage=this.queryRpt(rptId,headsIds,queriesIds,1,0,request);
        RptCfgMains rptCfgMains=ReportUtil.getRptCfgMainsById(rptId);
        Map<Long,RptCfgHeads>  longRptCfgHeadsMap=ReportUtil.getRptCfgHeadsMapByRptId(rptId);
        String[]headsIdsz=headsIds.split(",");
        List<RptCfgHeads> hasRptCfgHeadses=new ArrayList<RptCfgHeads>();
        Map<Long,Integer> upheadNum=new HashMap<Long, Integer>();
        for (String queriesId:headsIdsz)
        {
            RptCfgHeads rptCfgHeads= longRptCfgHeadsMap.get(Long.parseLong(queriesId));
            if(rptCfgHeads.getUp_head_id()!=null&&!"".equals( rptCfgHeads.getUp_head_id()))
            {
                Integer integer=upheadNum.get(rptCfgHeads.getUp_head_id());
                if(integer==null)
                {
                    integer=0;
                    upheadNum.put(rptCfgHeads.getUp_head_id(),integer);
                }
                upheadNum.put(rptCfgHeads.getUp_head_id(),integer+1);
            }
            hasRptCfgHeadses.add(rptCfgHeads);
        }
        Collections.sort(hasRptCfgHeadses, new Comparator<RptCfgHeads>() {
            @Override
            public int compare(RptCfgHeads o1, RptCfgHeads o2) {
                return o1.getOrder_id()>o2.getOrder_id()?1:-1;
            }
        });
        ExcelMultiTitle excelMultiTitle=new ExcelMultiTitle();
        ExcelMultiTitle excelMultiTitle2=new ExcelMultiTitle();
        Long upheadId=null;
        for (RptCfgHeads rptCfgHeads:hasRptCfgHeadses)
        {

            if(rptCfgHeads.getUp_head_id()!=null&&!"".equals( rptCfgHeads.getUp_head_id())&&!rptCfgHeads.getUp_head_id().equals(upheadId)) {
                upheadId=rptCfgHeads.getUp_head_id();
                RptCfgHeads rptCfgHeads1=longRptCfgHeadsMap.get(upheadId);
                excelMultiTitle.add(rptCfgHeads1.getHead_name(),rptCfgHeads1.getHead_col(),null,upheadNum.get(upheadId),1,null);
            }
            if((rptCfgHeads.getUp_head_id()==null||"".equals(rptCfgHeads.getUp_head_id()))&&!upheadNum.isEmpty())
            {
                excelMultiTitle.add(rptCfgHeads.getHead_name(),rptCfgHeads.getHead_col(),null,1,2,null);
            }else
            {
                excelMultiTitle2.add(rptCfgHeads.getHead_name(),rptCfgHeads.getHead_col());
            }
        }

        List<ExcelMultiTitle> excelMultiTitles=new ArrayList<ExcelMultiTitle>();
        if(excelMultiTitle.size()>0)
        {
            excelMultiTitles.add(excelMultiTitle);
        }
        excelMultiTitles.add(excelMultiTitle2);

        IExcelDownloadUtils excelDownloadUtils=new ExcelDownloadUtils<Map<String,Object>>(true,rptCfgMains.getRpt_name(),excelMultiTitles,reportPage.getData());
        ReportDownVo reportDownVo=new ReportDownVo();
        reportDownVo.setData(excelDownloadUtils.getBookInputStream());
        try {
            reportDownVo.setName(excelDownloadUtils.getFileName());
        } catch (UnsupportedEncodingException e) {
            reportDownVo.setName(rptCfgMains.getRpt_name());
        }

        return reportDownVo;
    }


    public void setSqlMapper(SqlMapper sqlMapper) {
        this.sqlMapper = sqlMapper;
    }

    public SqlMapper getSqlMapper() {
        return sqlMapper;
    }

    public RptCfgMainsMapper getRptCfgMainsMapper() {
        return rptCfgMainsMapper;
    }

    public void setRptCfgMainsMapper(RptCfgMainsMapper rptCfgMainsMapper) {
        this.rptCfgMainsMapper = rptCfgMainsMapper;
    }

    public RptCfgHeadsMapper getRptCfgHeadsMapper() {
        return rptCfgHeadsMapper;
    }

    public void setRptCfgHeadsMapper(RptCfgHeadsMapper rptCfgHeadsMapper) {
        this.rptCfgHeadsMapper = rptCfgHeadsMapper;
    }

    public RptCfgQueriesMapper getRptCfgQueriesMapper() {
        return rptCfgQueriesMapper;
    }

    public void setRptCfgQueriesMapper(RptCfgQueriesMapper rptCfgQueriesMapper) {
        this.rptCfgQueriesMapper = rptCfgQueriesMapper;
    }

}
