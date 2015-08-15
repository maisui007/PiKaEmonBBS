/**   
* @Title: BaseDao.java 
* @Package com.julius.common.dao 
* @Description: Dao基础接口
* @author julius 
* @date 2015年8月15日 上午9:30:23 
* @version V1.0   
*/
package com.julius.common.dao;

import java.util.List;

/** 
* @ClassName: BaseDao 
* @Description: Dao基础接口
* @author julius 
* @date 2015年8月15日 上午9:30:23 
*  
*/
public interface BaseDao<T> {
	/**
	 * 
	 * @Title: save 
	 * @Description: 保存
	 * @param model
	 * @return T 保存后返回的Model(含有持久化后对象的ID)
	 * @author julius
	 */
	public T save(T model);
	
	/**
	 * 
	 * @Title: del 
	 * @Description: 删除) 
	 * @param model 条件参数
	 * @author julius
	 * @date 2015年8月15日 下午1:12:58
	 */
	public void del(T model);
	
	/**
	 * 
	 * @Title: findById 
	 * @Description: 根据ID查询 
	 * @param id 要查询的Model的ID
	 * @return T  返回查询的结果
	 * @author julius
	 * @date 2015年8月15日 下午1:13:16
	 */
	public T findById(Class<T> clazz,Integer id);
	
	/**
	 * 
	 * @Title: getTotalCount 
	 * @Description: 查询总条数
	 * @return int  返回条数
	 * @author julius
	 * @date 2015年8月15日 下午1:14:10
	 */
	public int getTotalCount();
	
	/**
	 * 
	 * @Title: list 
	 * @Description: 查询结果集合 
	 * @param T 查询条件
	 * @param start 分页参数
	 * @param limit 分页参数
	 * @return List<T> 查询的结果稽核
	 * @author julius
	 * @date 2015年8月15日 下午1:14:29
	 */
	public List<T> list(T model,int start,int limit);
}
