/**   
* @Title: BaseAction.java 
* @Package com.julius.common.action 
* @Description: Action基础类
* @author julius 
* @date 2015年8月15日 上午9:31:58 
* @version V1.0   
*/
package com.julius.common.action;

import java.util.List;

import com.julius.common.dao.BaseDao;
import com.julius.common.model.BaseModel;
import com.julius.common.service.BaseService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/** 
* @ClassName: BaseAction 
* @Description: Action基础类
* @author julius 
* @date 2015年8月15日 上午9:31:58 
*  
*/
public abstract class BaseAction<T extends BaseModel,TDao extends BaseDao<T>,TService extends BaseService<T,TDao>> extends ActionSupport implements ModelDriven<T>{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 4799535087600143591L;

	protected T model;

	protected TService service;
	
	private Integer start;//分页参数
	
	private Integer limit;//分页参数
	
	/* 
	* @see com.opensymphony.xwork2.ModelDriven#getModel() 
	*/
	@Override
	public T getModel() {
		return model;
	}
	
	/**
	 * 
	 * @Title: save 
	 * @Description: 保存 
	 * @return T 返回保存后的对象
	 * @author julius
	 * @date 2015年8月16日 上午10:58:46
	 */
	public T save(){
		return service.save(model);
	}
	
	/**
	 * 
	 * @Title: del 
	 * @Description: 删除
	 * @author julius
	 * @date 2015年8月16日 下午8:38:05
	 */
	public void del(){
		service.del(model);
	}
	
	/**
	 * 
	 * @Title: list 
	 * @Description: 查询
	 * @return List<T>  返回查询的结果
	 * @author julius
	 * @date 2015年8月16日 下午8:38:28
	 */
	public List<T> list(){
		return service.list(model, start, limit);
	}
}
