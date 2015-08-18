/**   
* @Title: BaseDaoImpl.java 
* @Package com.julius.common 
* @Description: 基础Dao接口的实现类
* @author julius 
* @date 2015年8月15日 下午6:08:15 
* @version V1.0   
*/
package com.julius.common.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.julius.common.dao.BaseDao;
import com.julius.common.model.BaseModel;

/** 
* @ClassName: BaseDaoImpl 
* @Description: 基础Dao接口的实现类 
* @author julius 
* @date 2015年8月15日 下午6:08:15 
*  
*/
public abstract class BaseDaoImpl<T extends BaseModel> extends HibernateDaoSupport implements BaseDao<T> {

	/* 
	* <p>Description:保存 </p> 
	* @param model
	* @return 
	* @see com.julius.common.dao.BaseDao#save(java.lang.Object) 
	*/
	@Override
	public T save(T model) {
		this.getHibernateTemplate().persist(model);
		return model;
	}

	/*
	* <p>Description:删除 </p> 
	* @param model 
	* @see com.julius.common.dao.BaseDao#del(java.lang.Object) 
	*/
	@Override
	public void del(T model) {
		this.getHibernateTemplate().delete(model);
	}

	/* 
	* <p>Description:根据ID查询 </p> 
	* @param id
	* @return 返回查询出的结果
	* @see com.julius.common.dao.BaseDao#findById(java.lang.Integer) 
	*/
	@Override
	public T findById(Class<T> clazz,Integer id) {
		return this.getHibernateTemplate().get(clazz, id);
	}

	/*  
	* <p>Description:查询条数 </p> 
	* @return 返回条数信息i
	* @see com.julius.common.dao.BaseDao#getTotalCount() 
	*/
	@Override
	public int getTotalCount() {
		return 0;
	}

	/* 
	* <p>Description:查询结果集 </p> 
	* @param model 条件
	* @param start 分页参数
	* @param limit 分页参数
	* @return 查询出的结果集
	* @see com.julius.common.dao.BaseDao#list(java.lang.Object, int, int) 
	*/
	@Override
	public List<T> list(T model, int start, int limit) {
//		this.getHibernateTemplate().find(queryString, values);
		return null;
	}
	
}
