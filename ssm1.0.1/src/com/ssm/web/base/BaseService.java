package com.ssm.web.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class BaseService<T>{
	
	@Autowired
	private DaoBase daoBase;

	public int add(String sql, T obj)throws Exception {
		return daoBase.add(sql, obj);
	}
	
	public int delete(String sql, T obj)throws Exception {
		return daoBase.delete(sql, obj);
	}
	public int update(String sql, T obj)throws Exception {
		return daoBase.update(sql,obj);
	}
	@SuppressWarnings("unchecked")
	public T selectOne(String sql, T obj)throws Exception {
		return (T)daoBase.selectOne(sql, obj);
	}
	@SuppressWarnings("unchecked")
	public List<T> list(String sql, T obj)throws Exception {
		return (List<T>)daoBase.list(sql, obj);
	}
}
