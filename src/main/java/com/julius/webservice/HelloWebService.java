/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: HelloWebService.java 
 * Created: [2015年8月21日 上午10:03:42] by julius 
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: PiKaEmonBBS 
 * Description: webService测试程序
======================================*/
package com.julius.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/** 
 * Description:webService测试程序
 * @author julius
 */

@WebService
public interface HelloWebService {
	public String sayHello(@WebParam(name="text")String text);
}
