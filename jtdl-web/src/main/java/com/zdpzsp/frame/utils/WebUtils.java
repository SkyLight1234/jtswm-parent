package com.zdpzsp.frame.utils;

import com.zdpzsp.frame.FrameConst;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.vo.UserInfoVo;
import com.zdpzsp.system.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class WebUtils {
	public static InputStream succee(Object o) {
		Map map=new HashMap<String,Object>();
		map.put("state", true);
		map.put("message", "调用成功");
		map.put("code",0);
		map.put("data",o);
		return JsonUtils.objToInputStream(null,map);
	}
	public static InputStream succee(String callback,Object o) {
		Map map=new HashMap<String,Object>();
		map.put("state", true);
		map.put("message", "调用成功");
		map.put("code",0);
		map.put("data",o);
		return JsonUtils.objToInputStream(callback,map);
	}
	public static InputStream succeeMessage(String message) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("message",message);
		map.put("code",0);
		map.put("state", true);
		return JsonUtils.objToInputStream(null,map);
	}
	public static InputStream succeeMessage(String callback,String message) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("message",message);
		map.put("state", true);
		map.put("code",0);
		return JsonUtils.objToInputStream(null,map);
	}

	public static InputStream error(ServiceException e) {
		return error(null,e);
	}
	public static InputStream error(String callbact,ServiceException e) {
		return error(callbact,e.getCode(),e.getMessage());
	}
	public static InputStream error(ResultCode sys_err) {
		return error(null,sys_err);
	}
	public static InputStream error(String callback,ResultCode resultCode) {
		return error(callback,resultCode.getCode(),resultCode.getMessage());
	}

	public static InputStream error(int code,String message) {
		return error(null,code,message);
	}
	public static InputStream error(String callback,int code,String message) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code",code);
		map.put("message",message);
		map.put("state", false);
		return JsonUtils.objToInputStream(callback,map);
	}



	public static UserInfoVo getUserInfoVo(HttpServletRequest request)
	{
		Object userInfoObj=request.getSession().getAttribute(FrameConst.SessionNames.userInfo);
		return  userInfoObj==null?null:(UserInfoVo)userInfoObj;
	}

	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}


}
