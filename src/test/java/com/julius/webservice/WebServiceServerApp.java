/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: WebServiceServerApp.java 
 * Created: [2015年8月21日 上午10:18:54] by julius 
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: PiKaEmonBBS 
 * Description: webService启动测试
======================================*/
package com.julius.webservice;

import javax.xml.ws.Endpoint;

import com.julius.webservice.server.HelloWebService;
import com.julius.webservice.server.impl.HelloWebServiceImpl;

/** 
 * Description:webService启动测试
 * @author julius
 */

public class WebServiceServerApp {
	public static void main(String[] args) {
		 System.out.println("web service started");
		 HelloWebService webService= new HelloWebServiceImpl();
         String address="http://localhost:8080/helloWorld";
         Endpoint.publish(address, webService);
         System.out.println("web service started");
	}
}
