package com.zdpzsp.frame;

import java.util.HashMap;
import java.util.Map;

public enum  ResultCode{
    succee(0,"请求成功"),

    //系统错误
    sys_err(1000,"未知的系统错误"),


    //逻辑错误
    verify_err(10000,"校验失败"),
    param_err(10001,"参数解析失败"),

    //用户模块错误
    user_no_login(11001,"用户未登录"),
    user_login_no_user(11001,"用户不存在"),
    user_login_pass_encrypt_err(11002,"密码解析失败"),
    user_login_pass_no_eq(11003,"密码错误"),
    user_login_user_disable(11004,"用户不可用"),
    user_login_username_err(11005,"用户名不存在"),
    user_account_has_err(11006,"该账号已经注册过" ),
        /*  user_login_no_menu(11006,"没有可用菜单"),
      user_role_insert_err(11007,"用户角色添加失败"),
      user_station_insert_err(11008,"用户岗位添加失败"),
      //报表模块错误
      report_no_jurisdiction(12001,"无报表查看权限"),
      report_no_head(12002,"未获取到报表头"),
      report_no_head_has_one(12003,"查询时查询列至少为1"),
      report_no_org(12004,"没有组织无法查询"),
      report_no_user_org(12005,"无权限查询此组织"),
      //kpi模块错误
      kpi_no_query(13001,"未找到kpi"),*/
    user_email_valicate_err(11105, "请检查邮箱的是否正确，发送验证码失败"),
    sys_file_read_err(11201, "文件读取失败,请检查文件是否存在");



    private int code;
    private String message;

    private ResultCode( int code,String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    private static Map<Integer,ResultCode> map=new HashMap<Integer,ResultCode>();
    static{
        for (ResultCode c : ResultCode.values()) {
            map.put(c.getCode(),c);
        }
    }
    public static String getName(Integer index) {
        return  map.get(index).getMessage();
    }
    public static ResultCode getCallAction(Integer index)
    {
        return  map.get(index);
    }

}