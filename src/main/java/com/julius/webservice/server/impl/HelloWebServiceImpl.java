/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: HelloWebServiceImpl.java 
 * Created: [2015年8月21日 上午10:07:46] by julius 
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: PiKaEmonBBS 
 * Description: webServiceImpl测试程序
======================================*/
package com.julius.webservice.server.impl;

import javax.jws.WebService;

import com.julius.webservice.server.HelloWebService;

/** 
 * Description:webServiceImpl测试程序
 * @author julius
 */
@WebService(endpointInterface="com.julius.webservice.HelloWebService",serviceName="HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {

	/* (non-Javadoc)
	 * @see com.julius.webservice.HelloWebService#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String text) {
		return "Hello"+text;
	}

}
