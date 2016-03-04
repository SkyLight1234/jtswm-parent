package com.zdpzsp.frame.bo;

import java.sql.Timestamp;
import java.util.Map;

public interface CommMapper {

	Timestamp getSysdate() throws Exception;

	long getNextval(Map seqName) throws Exception;
	
	long getNextvalSet(Map map) throws Exception;
	
	
}