/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: RegexUtil.java 
 * Created: [2015年6月25日 下午1:43:13] by julius 
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: YouYou 
 * Description: 正则表达式工具类
======================================*/
package com.julius.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * Description:正则表达式工具类
 * @author julius
 */

public class RegexUtil {
	
	/**
	 * 
	 * Description: 验证是否由数字组成
	 * @param  str 要校验的字符串
	 * @return 是数字 返回true  不是数字 返回false
	 * @Author julius
	 * Create Date: 2015年6月25日 下午1:51:57
	 */
	public static boolean checkNumber(String str){
		String regex = "^\\d+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 
	 * Description: 验证邮箱是否合法
	 * @param  str 要验证的字符串
	 * @return 如果合法返回true 否则返回false
	 * @Author julius
	 * Create Date: 2015年6月25日 下午1:53:23
	 */
	public static boolean checkEmail(String email){
		String regex = "w+([-+.]w+)*@w+([-.]w+)*.w+([-.]w+)*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	/**
	 * 
	 * Description: 校验手机号码是否合法
	 * @param  phoneNumber 要校验的手机号码
	 * @return boolean 当手机号码不合法时 返回false 否则返回true
	 * @Author julius
	 * Create Date: 2015年6月25日 下午6:01:56
	 */
	public static boolean checkPhone(String phoneNumber){
		String regex = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}
	
	/**
	 * 
	 * Description: 检查qq号码是否合法
	 * @param  QQ QQ号码
	 * @return boolean 当QQ号码不合法时 返回false 否则返回true
	 * @Author julius
	 * Create Date: 2015年6月25日 下午6:04:59
	 */
	public static boolean checkQQ(String QQ){
		String regex = "[1-9][0-9]{4,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(QQ);
		return matcher.matches();
	}
	
	
	public static void main(String[] args) {
		String str = "12387876542";
		System.out.println(checkPhone(str));
	}
}
