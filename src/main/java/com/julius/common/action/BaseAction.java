/**   
* @Title: BaseAction.java 
* @Package com.julius.common.action 
* @Description: Action基础类
* @author julius 
* @date 2015年8月15日 上午9:31:58 
* @version V1.0   
*/
package com.julius.common.action;

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
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	
}
