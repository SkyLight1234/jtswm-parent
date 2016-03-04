package com.zdpzsp.report.utils;

import com.zdpzsp.report.ReportConst;
import com.zdpzsp.report.bo.RptCfgHeads;
import com.zdpzsp.report.bo.RptCfgMains;
import com.zdpzsp.report.bo.RptCfgQueries;
import com.zdpzsp.report.service.IReportService;
import com.zdpzsp.report.vo.rptCfgHeads.RptCfgHeadsRootVo;
import com.zdpzsp.report.vo.rptCfgMains.RptCfgMainsRootVo;
import com.zdpzsp.system.utils.CommonUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class ReportUtil {
    private static Map<Long,RptCfgMains> longRptCfgMainsMap;
    private static Map<String,List<RptCfgMainsRootVo>> rptCfgMainsTypeMap;

    private static Map<Long,Map<Long,RptCfgHeads>> longRptCfgHeadsMap;
    private static Map<Long,RptCfgHeadsRootVo> rptCfgHeadsMap;


    private static Map<Long,Map<Long,RptCfgQueries>> LongRptCfgQueriesMap;
    private static Map<Long,List<RptCfgQueries>> rptCfgQueriesMap;

    public static void  init(IReportService reportService){
        List<RptCfgMains> rptCfgMainsesList=reportService.getRptCfgMainsList(ReportConst.RptCfgMainsConst.IsUsed.yes);
        List<RptCfgHeads> rptCfgHeadsList= reportService.getRptCfgHeadsList(ReportConst.RptCfgHeadsConst.IsUsed.yes);
        List<RptCfgQueries> rptCfgQueriesList=reportService.getRptCfgQueriesList(ReportConst.RptCfgQueriesConst.IsUsed.yes);

        longRptCfgMainsMap=packagelongRptCfgMainsMap(rptCfgMainsesList);
        rptCfgMainsTypeMap=packagerptCfgMainsTypeMap(rptCfgMainsesList);

        longRptCfgHeadsMap=packagelongRptCfgHeadsMap(rptCfgHeadsList);
        rptCfgHeadsMap=packagerptCfgHeadsMap(rptCfgHeadsList);

        LongRptCfgQueriesMap=packageLongRptCfgQueriesMap(rptCfgQueriesList);
        rptCfgQueriesMap=packagerptCfgQueriesMap(rptCfgQueriesList);
    }

    private static Map<Long,List<RptCfgQueries>> packagerptCfgQueriesMap(List<RptCfgQueries> rptCfgQueriesList) {
        Map<Long,List<RptCfgQueries>> longListMap=new HashMap<Long,List<RptCfgQueries>>();
        for (RptCfgQueries rptCfgQueries:rptCfgQueriesList)
        {
            List<RptCfgQueries> rptCfgQueriesList1=longListMap.get(rptCfgQueries.getRpt_cfg_main_id());
            if(rptCfgQueriesList1==null)
            {
                rptCfgQueriesList1=new ArrayList<RptCfgQueries>();
                longListMap.put(rptCfgQueries.getRpt_cfg_main_id(),rptCfgQueriesList1);
            }
            rptCfgQueriesList1.add(rptCfgQueries);
        }
        return longListMap;
    }

    private static Map<Long,Map<Long,RptCfgQueries>> packageLongRptCfgQueriesMap(List<RptCfgQueries> rptCfgQueriesList) {
        Map<Long,Map<Long,RptCfgQueries>> longMapMap=new HashMap<Long,Map<Long,RptCfgQueries>>();
        for (RptCfgQueries rptCfgQueries:rptCfgQueriesList)
        {
            Map<Long,RptCfgQueries> longRptCfgQueriesMap=longMapMap.get(rptCfgQueries.getRpt_cfg_main_id());
            if(longRptCfgQueriesMap==null)
            {
                longRptCfgQueriesMap=new HashMap<Long,RptCfgQueries>();
                longMapMap.put(rptCfgQueries.getRpt_cfg_main_id(),longRptCfgQueriesMap);
            }
            longRptCfgQueriesMap.put(rptCfgQueries.getId(),rptCfgQueries);
        }
        return longMapMap;
    }

    private static Map<Long,RptCfgHeadsRootVo> packagerptCfgHeadsMap(List<RptCfgHeads> rptCfgHeadsList) {
        Map<Long,RptCfgHeadsRootVo> longListMap=new HashMap<Long,RptCfgHeadsRootVo>();
        for (RptCfgHeads rptCfgHeads:rptCfgHeadsList)
        {
            RptCfgHeadsRootVo rptCfgHeadsRootVo= longListMap.get(rptCfgHeads.getRpt_cfg_main_id());
            if(rptCfgHeadsRootVo==null)
            {
                rptCfgHeadsRootVo=new RptCfgHeadsRootVo();
                longListMap.put(rptCfgHeads.getRpt_cfg_main_id(),rptCfgHeadsRootVo);
            }

            if(ReportConst.RptCfgHeadsConst.HeadType.one==rptCfgHeads.getHead_type())
            {
                List<RptCfgHeads> rptCfgHeadses=rptCfgHeadsRootVo.getOneRptCfgHeadsList();
                if(rptCfgHeadses==null)
                {
                    rptCfgHeadses=new ArrayList<RptCfgHeads>();
                    rptCfgHeadsRootVo.setOneRptCfgHeadsList(rptCfgHeadses);
                }
                rptCfgHeadses.add(rptCfgHeads);
            }else
            {
                List<RptCfgHeads> rptCfgHeadses=rptCfgHeadsRootVo.getTwoRptCfgHeadsList();
                if(rptCfgHeadses==null)
                {
                    rptCfgHeadses=new ArrayList<RptCfgHeads>();
                    rptCfgHeadsRootVo.setTwoRptCfgHeadsList(rptCfgHeadses);
                }
                rptCfgHeadses.add(rptCfgHeads);
            }
        }
        return longListMap;
    }

    private static Map<Long,Map<Long,RptCfgHeads>> packagelongRptCfgHeadsMap(List<RptCfgHeads> rptCfgHeadsList) {
        Map<Long,Map<Long,RptCfgHeads>> longMapMap=new HashMap<Long,Map<Long,RptCfgHeads>>();
        for (RptCfgHeads rptCfgHeads:rptCfgHeadsList)
        {
            Map<Long,RptCfgHeads> longRptCfgHeadsMap=longMapMap.get(rptCfgHeads.getRpt_cfg_main_id());
            if(longRptCfgHeadsMap==null)
            {
                longRptCfgHeadsMap=new HashMap<Long,RptCfgHeads>();
                longMapMap.put(rptCfgHeads.getRpt_cfg_main_id(),longRptCfgHeadsMap);
            }
            longRptCfgHeadsMap.put(rptCfgHeads.getId(),rptCfgHeads);

        }
        return longMapMap;
    }

    private static  Map<Long,RptCfgMains> packagelongRptCfgMainsMap(List<RptCfgMains> rptCfgMainses)
    {
        Map<Long,RptCfgMains> rptCfgMainsMap=new HashMap<Long,RptCfgMains>();
        for (RptCfgMains rptCfgMains:rptCfgMainses)
        {
            rptCfgMainsMap.put(rptCfgMains.getId(),rptCfgMains);
        }
        return rptCfgMainsMap;
    }
    private static Map<String,List<RptCfgMainsRootVo>> packagerptCfgMainsTypeMap(List<RptCfgMains> rptCfgMainses){
        Map<String,List<RptCfgMainsRootVo>> stringListMap=new HashMap<String,List<RptCfgMainsRootVo>>();
        Map<String,List<RptCfgMains>> stringRptCfgMainsMap=new HashMap<String,List<RptCfgMains>>();
        Map<Long,List<RptCfgMains>> longListMap=new HashMap<Long,List<RptCfgMains>>();
        for (RptCfgMains rptCfgMains:rptCfgMainses)
        {
            if(ReportConst.RptCfgMainsConst.DirType.one==rptCfgMains.getDir_type())
            {
                List<RptCfgMains> rptCfgMainses1=stringRptCfgMainsMap.get(rptCfgMains.getRpt_type());
                if(rptCfgMainses1==null)
                {
                    rptCfgMainses1=new ArrayList<RptCfgMains>();
                    stringRptCfgMainsMap.put(rptCfgMains.getRpt_type(),rptCfgMainses1);
                }
                rptCfgMainses1.add(rptCfgMains);
            }else
            {
                List<RptCfgMains> rptCfgMainses1= longListMap.get(rptCfgMains.getUp_rpt_id());
                if(rptCfgMainses1==null)
                {
                    rptCfgMainses1=new ArrayList<RptCfgMains>();
                    longListMap.put(rptCfgMains.getUp_rpt_id(),rptCfgMainses1);
                }
                rptCfgMainses1.add(rptCfgMains);
            }
        }
       for (String key:stringRptCfgMainsMap.keySet())
       {
           List<RptCfgMainsRootVo> rptCfgMainsRootVos=stringListMap.get(key);
           if(rptCfgMainsRootVos==null)
           {
               rptCfgMainsRootVos=new ArrayList<RptCfgMainsRootVo>();
               stringListMap.put(key,rptCfgMainsRootVos);
           }

           List<RptCfgMains> rptCfgMainses1=stringRptCfgMainsMap.get(key);
           for (RptCfgMains rptCfgMains:rptCfgMainses1)
           {
               RptCfgMainsRootVo rptCfgMainsRootVo=new RptCfgMainsRootVo();
               rptCfgMainsRootVo.setRootRptCfgMains(rptCfgMains);
               rptCfgMainsRootVo.setRptCfgMainsList(longListMap.get(rptCfgMains.getId()));
               rptCfgMainsRootVos.add(rptCfgMainsRootVo);
           }
       }
        return stringListMap;
    }

    /*private static  Map<Long,RptCfgMains> packageRptCfgMainsesMap(List<RptCfgMains> rptCfgMainsesList)
    {
        Map<Long,RptCfgMains> rptCfgMainsMap=new HashMap<Long,RptCfgMains>();
        for (RptCfgMains rptCfgMains:rptCfgMainsesList)
        {
            rptCfgMainsMap.put(rptCfgMains.getId(),rptCfgMains);
        }
        return rptCfgMainsMap;
    }

    private static  Map<Long,List<RptCfgHeads>> packageRptCfgHeadsMap(List<RptCfgHeads> rptCfgMainsesList)
    {
        Map<Long,List<RptCfgHeads>> rptCfgHeadsMap=new HashMap<Long,List<RptCfgHeads>>();
        for(RptCfgHeads rptCfgHeads:rptCfgMainsesList)
        {
            List<RptCfgHeads> rptCfgHeadses=rptCfgHeadsMap.get(rptCfgHeads.getRpt_cfg_main_id());
            if(rptCfgHeadses==null)
            {
                rptCfgHeadses=new ArrayList<RptCfgHeads>();
                rptCfgHeadsMap.put(rptCfgHeads.getRpt_cfg_main_id(),rptCfgHeadses);
            }
            rptCfgHeadses.add(rptCfgHeads);
        }
        return rptCfgHeadsMap;
    }*/


    public static List<RptCfgMainsRootVo> getRptCfgMainsListByRptType(String rptType) {
        return CommonUtil.copyObj(rptCfgMainsTypeMap.get(rptType));
    }

    public static RptCfgHeadsRootVo getRptCfgHeadsByRptId(Long rptId) {
        return CommonUtil.copyObj(rptCfgHeadsMap.get(rptId));
    }

    public static List<RptCfgQueries> getRptCfgQueriesByRptId(Long rptId) {
        return CommonUtil.copyObj(rptCfgQueriesMap.get(rptId));
    }

    public static RptCfgMains getRptCfgMainsById(Long rptId) {
        return CommonUtil.copyObj(longRptCfgMainsMap.get(rptId));
    }

    public static Map<Long,RptCfgHeads> getRptCfgHeadsMapByRptId(Long rptId) {
        return CommonUtil.copyObj(longRptCfgHeadsMap.get(rptId));
    }

    public static Map<Long,RptCfgQueries> getRptCfgQueriesMapByRptId(Long rptId) {
        return CommonUtil.copyObj(LongRptCfgQueriesMap.get(rptId));
    }
}
