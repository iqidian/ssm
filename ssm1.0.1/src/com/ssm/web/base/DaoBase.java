package com.ssm.web.base;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoBase implements Dao {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public int add(String sql, Object obj)throws Exception {
		return sqlSessionTemplate.insert(sql, obj);
	}
	@Override
	public int delete(String sql, Object obj)throws Exception {
		return sqlSessionTemplate.delete(sql, obj);
	}
	@Override
	public int update(String sql, Object obj)throws Exception {
		return sqlSessionTemplate.update(sql,obj);
	}
	@Override
	public Object selectOne(String sql, Object obj) throws Exception{
		return sqlSessionTemplate.selectOne(sql, obj);
	}
	@Override
	public List<Object> list(String sql, Object obj) {
		return sqlSessionTemplate.selectList(sql, obj);
	}

}
