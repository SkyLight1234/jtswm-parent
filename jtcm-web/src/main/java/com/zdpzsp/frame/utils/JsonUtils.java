package com.zdpzsp.frame.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class JsonUtils {


	public static InputStream objToInputStream(String callback,Object obj)  {
		return stringToInputStream(objToJson(callback,obj));
	}
	public static InputStream objToInputStream(Object obj) {
		return objToInputStream(null, obj);
	}

	public static InputStream stringToInputStream(String callback,String s) {
		if(callback!=null&&!"".equals(callback))
		{
			s=callback+"("+s+")";
		}
		byte[] bbb=s.getBytes();
		try {
			bbb=s.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			//e.printStackTrace();
		}
		return new ByteArrayInputStream(bbb);
	}
	public static InputStream stringToInputStream(String s) {
		return stringToInputStream(null,s);
	}
	public static String objToJson(Object obj)  {
		return JSONObject.toJSONString(obj);
	}
	
	public static String objToJson(String callback,Object obj)  {
		if(callback==null)
		{
			return  objToJson(obj);
		}
		return callback+"("+objToJson(obj)+")";
	}
}
