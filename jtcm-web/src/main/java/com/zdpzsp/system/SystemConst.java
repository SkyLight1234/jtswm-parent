package com.zdpzsp.system;

/**
 * Created by xiaxia on 2015/11/24 .
 */
public class SystemConst {
    /**
     * 系统用户
     */
    public interface SysUserConst
    {
        /**
         * 用户状态
         */
        public interface state{
            public static final int enabled=1;//正常
            public static final int disable=0;//禁用
        }

    }

    /**
     * 系统角色
     */
    public interface SysRolesConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }



    /**
     * 用户和角色关系
     */
    public interface SysUserRolesConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }

    /**
     * 系统岗位
     */
    public interface SysStations {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }
    /**
     * 用户岗位关系
     */
    public interface SysUserStationsConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }

    /**
     * 系统组织
     */
    public interface  SysOrganizationConst
    {
        /**
         * 组织状态
         */
        public interface state{
            public static final int enabled=1;//正常
            public static final int disable=0;//禁用
        }
    }
    /**
     * 系统菜单
     */
    public interface  SysMenuConst
    {
        /**
         * 组织状态
         */
        public interface menu_state{
            public static final int enabled=1;//正常
            public static final int disable=0;//禁用
        }
    }
    /**
     * 角色对菜单关系
     */
    public interface  SysRoleMenusConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }
    /**
     * 岗位对报表关系
     */
    public interface SysStationRptsConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }
    /**
     * 岗位对组织关系
     */
    public interface SysStationOrgsConst
    {
        public interface IsUsed{
            public static final byte yes=1;//可用
            public static final byte no=0;//不可用
        }
    }


}
