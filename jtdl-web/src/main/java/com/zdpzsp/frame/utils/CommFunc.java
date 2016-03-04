package com.zdpzsp.frame.utils;

import com.zdpzsp.frame.bo.View_param;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommFunc {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CommFunc.class);

	// 根据code_type从application的view_param中取view_parm
	public static List<View_param> getViewParamByType(String code_type) {
		Map viewParamMap = (Map) ServletActionContext.getServletContext()
				.getAttribute("viewParamMap");
		HashMap map = (HashMap) viewParamMap.get("codeType");
		ArrayList<View_param> list = (ArrayList<View_param>) map
				.get(code_type);
		if (list == null) {
			return null;
		}
		return list;
	}

	// 根据code_type和value从application的view_param中取view_parm
	public static View_param getViewParamByType(String code_type,
			String code_value) {
		Map viewParamMap = (Map) ServletActionContext.getServletContext()
				.getAttribute("viewParamMap");
		HashMap map = (HashMap) viewParamMap.get("codeTypeValue");
		View_param view_param = (View_param) map.get(code_type + "^"
				+ code_value);
		if (view_param == null) {
			view_param = new View_param();
			view_param.setCode_type(code_type);
			view_param.setCode_value(code_value);
			view_param.setCode_name(code_value);
		}
		return view_param;
	}
	public static View_param getViewParamByTypeHasNull(String code_type,
												String code_value) {
		Map viewParamMap = (Map) ServletActionContext.getServletContext()
				.getAttribute("viewParamMap");
		HashMap map = (HashMap) viewParamMap.get("codeTypeValue");
		View_param view_param = (View_param) map.get(code_type + "^"
				+ code_value);
		return view_param;
	}

	
	public static String getNameByValue(String code_type,String code_value){
			if("".equals(code_type)||"null".equals(code_type)|| code_type==null){
				return null;
			}
			Map viewParamMap = (Map) ServletActionContext.getServletContext()
					.getAttribute("viewParamMap");
			HashMap map = (HashMap) viewParamMap.get("codeTypeValue");
			View_param view_param = (View_param) map.get(code_type + "^"
					+ code_value);
			String name = view_param.getCode_name();
			if(name==null){
				return code_value;
			}
			return name;	
	}
	
	public static String getParentByChlid(String code_type,String code_value){
		Map viewParamMap = (Map) ServletActionContext.getServletContext()
				.getAttribute("viewParamMap");
		HashMap map = (HashMap) viewParamMap.get("codeTypeValue");
		View_param view_param = (View_param) map.get(code_type + "^"
				+ code_value);
		String partent = view_param.getParent_value();
		return partent;
	}
	
	// 根据父节点code_type和value从application的view_param中取view_parm
	public static List<View_param> getViewParamByPType(String parent_type,
			String parent_value) {
		Map viewParamMap = (Map) ServletActionContext.getServletContext()
				.getAttribute("viewParamMap");
		HashMap map = (HashMap) viewParamMap.get("parentType");

		ArrayList<View_param> list = (ArrayList<View_param>) map
				.get(parent_type + "^" + parent_value);
		if (list == null) {
			return null;
		}
		return list;
	}
	
	// 根据code_type和父节点的code_type和value从application的view_param中取view_parm
		public static List<View_param> getViewParamByPType(String code_type, String parent_type,
				String parent_value) {
			Map viewParamMap = (Map) ServletActionContext.getServletContext()
					.getAttribute("viewParamMap");
			HashMap map = (HashMap) viewParamMap.get("parentType");

			ArrayList<View_param> list = (ArrayList<View_param>) map
					.get(parent_type + "^" + parent_value);
			ArrayList<View_param> vpList = null;
			if (list == null) {
				return null;
			}else{
				vpList = new ArrayList<View_param>();
				for(View_param vp : list){
					if(vp.getCode_type().equals(code_type)){
						vpList.add(vp);
					}
				}
			}
			return vpList;
		}
	
	
	
	public static void setDisplayAttr(List objList,
			String[] fieldName, String[] srcField,Class<?>[] setParamTypes) {

		for (int i = 0; i < objList.size(); i++) {
			setDisplayAttr(objList.get(i), fieldName, srcField,setParamTypes);
		}

	}

	public static void setDisplayAttr(Object obj, String[] fieldName,
			String[] srcField,Class<?>[] setParamTypes) {

		for (int i = 0; i < fieldName.length; i++) {
			
			
			
			
			
			setDisplayAttr(obj, fieldName[i], srcField[i],setParamTypes[i]);
		}

	}

	public static void setDisplayAttr(Object obj, String fieldName,
			String srcField,Class<?> setParamType) {
		String[] src = srcField.split(",");
		String codeType = src[0];
		String codeValueField = src[1];
		Class<?> demo = null;
		demo = obj.getClass().getClass();
		try {
			Method getMethod = obj.getClass().getMethod("get" + codeValueField);
			Object f = (Object) getMethod.invoke(obj, null);
			if(null==f){
				f = "";
			}
			String fieldValue = getViewParamByType(codeType,f.toString()).getCode_name();
			Method setMethod = obj.getClass().getMethod("set" +fieldName, setParamType);
			setMethod.invoke(obj, fieldValue);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
