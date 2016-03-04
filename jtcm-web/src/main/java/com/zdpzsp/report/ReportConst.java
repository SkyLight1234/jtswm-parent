package com.zdpzsp.report;

/**
 * Created by xiaxia on 2015/11/30 .
 */
public class ReportConst {

    public interface RptCfgMainsConst{
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
        public interface DirType
        {
            public static final int one=1;//一级目录
            public static final int twp=2;//二级目录

        }
    }
    public interface RptCfgHeadsConst{
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
        public interface HeadType
        {
            public static final int one=1;//一级
            public static final int twp=2;//二级

        }

    }
    public interface RptCfgQueriesConst{
        public interface QueryType{
            public static final String iorg="iOrg";
        }
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }
}
