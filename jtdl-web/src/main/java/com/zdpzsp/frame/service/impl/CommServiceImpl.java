package com.zdpzsp.frame.service.impl;


import com.zdpzsp.frame.bo.CommMapper;
import com.zdpzsp.frame.bo.View_param;
import com.zdpzsp.frame.bo.View_paramExample;
import com.zdpzsp.frame.bo.View_paramMapper;
import com.zdpzsp.frame.service.ICommService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommServiceImpl implements ICommService {

	private CommMapper commMapper = null;
	private View_paramMapper view_paramMapper = null;


	@Override
	public Timestamp getSysdate() throws Exception {
		return commMapper.getSysdate();
	}

	@Override
	public int getNextval(String seqName) throws Exception {
		Map condition = new HashMap();
		condition.put("seqName", seqName);
		return (int)commMapper.getNextval(condition);
	}
	
	@Override
	public int getNextvalSet(String seqName,int val) throws Exception {
		Map condition = new HashMap();
		condition.put("seqName", seqName);
		condition.put("val", val);
		return (int)commMapper.getNextvalSet(condition);
	}
	
	public List<View_param> getViewParam() {
		View_paramExample e = new View_paramExample();
		e.setOrderByClause("code_type,sort_id asc");
		List<View_param> list = view_paramMapper.selectByExample(e);
		return list;
	}
	
	
	public Map loadCacheMap() {
		List<View_param> viewParam = getViewParam();
		HashMap map = new HashMap();
		HashMap<String, ArrayList<View_param>> codeTypeMap = new HashMap<String, ArrayList<View_param>>();
		HashMap<String, ArrayList<View_param>> parentTypeMap = new HashMap<String, ArrayList<View_param>>();
		HashMap<String, View_param> codeTypeValueMap = new HashMap<String, View_param>();
		if (viewParam != null) {
			ArrayList<View_param> list = new ArrayList<View_param>();
			for (int i = 0; i < viewParam.size(); i++) {
				if (codeTypeMap
						.containsKey(viewParam.get(i).getCode_type())) {
					list = (ArrayList<View_param>) codeTypeMap
							.get(viewParam.get(i).getCode_type());
				} else {
					list = new ArrayList<View_param>();
					codeTypeMap.put(viewParam.get(i).getCode_type(), list);
				}
				list.add(viewParam.get(i));

				String parentTypeValue = viewParam.get(i).getParent_type()
						+ "^" + viewParam.get(i).getParent_value();
				if (parentTypeMap.containsKey(parentTypeValue)) {
					list = (ArrayList<View_param>) parentTypeMap
							.get(parentTypeValue);
				} else {
					list = new ArrayList<View_param>();
					parentTypeMap.put(parentTypeValue, list);
				}
				list.add(viewParam.get(i));

				String codeTypeValue = viewParam.get(i).getCode_type()
						+ "^" + viewParam.get(i).getCode_value();
				codeTypeValueMap.put(codeTypeValue, viewParam.get(i));
			}
		}
		map.put("codeType", codeTypeMap);
		map.put("parentType", parentTypeMap);
		map.put("codeTypeValue", codeTypeValueMap);
		return map;
	}

	
	
	

	public CommMapper getCommMapper() {
		return commMapper;
	}
	
	public void setCommMapper(CommMapper dbMapper) {
		this.commMapper = dbMapper;
	}
	
	public View_paramMapper getView_paramMapper() {
		return view_paramMapper;
	}

	public void setView_paramMapper(View_paramMapper view_paramMapper) {
		this.view_paramMapper = view_paramMapper;
	}

	
	
}
