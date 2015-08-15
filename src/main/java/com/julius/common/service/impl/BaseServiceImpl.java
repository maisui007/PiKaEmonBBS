/**   
* @Title: BaseServiceImpl.java 
* @Package com.julius.common.service.impl 
* @Description: 基础Service实现类
* @author julius 
* @date 2015年8月15日 下午6:24:17 
* @version V1.0   
*/
package com.julius.common.service.impl;

import java.util.List;

import com.julius.common.dao.BaseDao;
import com.julius.common.service.BaseService;

/** 
* @ClassName: BaseServiceImpl 
* @Description: 基础Service实现类
* @author julius 
* @date 2015年8月15日 下午6:24:17 
*  
*/
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected BaseDao<T> dao;
	
	/*
	* <p>Description:保存 </p> 
	* @param model 要保存的对象
	* @return T 返回保存后的对象
	* @see com.julius.common.service.BaseService#save(java.lang.Object) 
	*/
	@Override
	public T save(T model) {
		return dao.save(model);
	}

	/* (非 Javadoc) 
	* <p>Title: del</p> 
	* <p>Description: </p> 
	* @param model 
	* @see com.julius.common.service.BaseService#del(java.lang.Object) 
	*/
	@Override
	public void del(T model) {
		dao.del(model);
	}

	/* (非 Javadoc) 
	* <p>Title: findById</p> 
	* <p>Description: </p> 
	* @param clazz
	* @param id
	* @return 
	* @see com.julius.common.service.BaseService#findById(java.lang.Class, java.lang.Integer) 
	*/
	@Override
	public T findById(Class<T> clazz, Integer id) {
		return dao.findById(clazz, id);
	}

	/* (非 Javadoc) 
	* <p>Title: getTotalCount</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.julius.common.service.BaseService#getTotalCount() 
	*/
	@Override
	public int getTotalCount() {
		return dao.getTotalCount();
	}

	/* (非 Javadoc) 
	* <p>Title: list</p> 
	* <p>Description: </p> 
	* @param model
	* @param start
	* @param limit
	* @return 
	* @see com.julius.common.service.BaseService#list(java.lang.Object, int, int) 
	*/
	@Override
	public List<T> list(T model, int start, int limit) {
		return dao.list(model, start, limit);
	}
	
}
