package com.zdpzsp.frame.service;


import com.zdpzsp.frame.bo.View_param;

import java.util.List;
import java.util.Map;

public interface ICommService {

	
	public List<View_param> getViewParam()throws Exception;
	
	public Map loadCacheMap();

	
}
