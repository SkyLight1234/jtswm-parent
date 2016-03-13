package com.zdpzsp.system;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class SystemConst {
    public interface GobalCfg {
        public interface State{
            public static final Integer enable=1;
            public static final Integer disable=0;
        }
        public interface Paths{
            public interface Filepath{
                public static final String value="local/custom/file";
            }
            public interface ImagePath{
                public static final String value="local/custom/image";
            }
        }

    }
    public interface SYS_HOST{
        public interface HOST_TYPE{
            public static final String value="server";
        }
    }
}
