package com.zdpzsp.frame.service;


import com.zdpzsp.frame.bo.View_param;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface ICommService {

	public Timestamp getSysdate() throws Exception;

	public int getNextval(String seqName) throws Exception;
	
	public int getNextvalSet(String seqName, int val) throws Exception;
	
	public List<View_param> getViewParam()throws Exception;
	
	public Map loadCacheMap();

	
}
