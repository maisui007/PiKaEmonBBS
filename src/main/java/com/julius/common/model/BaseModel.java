/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: BaseModel.java 
 * Created: [2015年8月13日 下午3:48:52] by julius
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: PiKaEmonBBS 
 * Description: 基础Model类
======================================*/
package com.julius.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/** 
 * Description:基础Model类
 * @author julius
 */
@MappedSuperclass
public abstract class BaseModel implements Serializable{
	/** 
	* UID
	*/ 
	
	private static final long serialVersionUID = -4212891870350291658L;
	@Id
	@Column(length=36,updatable=false)
	private String id;//主键

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
