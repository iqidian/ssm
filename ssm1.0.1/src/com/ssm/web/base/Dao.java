package com.ssm.web.base;

import java.util.List;

public interface Dao {
	int add(String sql,Object obj)throws Exception;
	int delete(String sql,Object obj)throws Exception;
	int update(String sql,Object obj)throws Exception;
	Object selectOne(String sql,Object obj)throws Exception;
	List<Object> list(String sql,Object obj)throws Exception;
}
