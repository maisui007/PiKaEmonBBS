/* 
 * Copyright (C) 2006-2015 
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
========================================
 * FileName: CheckParams.java 
 * Created: [2015年6月25日 下午1:58:18] by julius
 * 更新：$Date$
 * 作者：$Author$
 * 版本：$Rev$
 * ID：$Id$
========================================
 * ProjectName: PiKaEmonBBS
 * Description: 校验参数工具类
======================================*/
package com.julius.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/** 
 * Description:校验参数工具类
 * @author julius
 */

public class CheckParamsUtil {
	
	/**
	 * 
	 * Description: 根据传入的Map校验参数是否有空
	 * @param  params 要校验的参数Map
	 * @param  ignoreParams 需要忽略校验的参数
	 * @return Map<String,String> 返回校验信息
	 * @Author julius
	 * Create Date: 2015年6月25日 下午5:01:22
	 */
	public static Map<String,String> checkParamsNull(Map<String,Object> params,String... ignoreParams){
		Map<String,String> returnMap = new HashMap<String, String>();
		for(Map.Entry<String,Object> param:params.entrySet()){
			String key = param.getKey();
			Object value = params.get(key);
			if(isExistInIgnoreArray(key, ignoreParams)){
				continue;
			}
			if(value==null){
				returnMap.put("returnInfo", key+"的值不能为Null");
				break;
			}
			if(value instanceof String){
				if("".equals(value)){
					returnMap.put("returnInfo", key+"的值不能为空字符串");
					break;
				}
			}
		}
		return returnMap;
	}
	
	/**
	 * 
	 * Description: 校验bean中的参数是否存在空值
	 * @param  t 要校验的bean
	 * @param  ignoreParams 要过滤的参数
	 * @return boolean 返回校验的结果
	 * @Author julius
	 * Create Date: 2015年6月25日 下午5:22:46
	 */
	public static <T> Map<String,String> checkParamsNull(T t,String... ignoreParams){
		Map<String,Object> resultMap = bean2Map(t);
		return checkParamsNull(resultMap,ignoreParams);
	}
	
	/**
	 * 
	 * Description: 将bean转换成Map
	 * @param  t 要转换的bean
	 * @return Map<String,Object> 转换后的Map
	 * @Author julius
	 * Create Date: 2015年6月25日 下午5:18:18
	 */
	private static <T> Map<String,Object> bean2Map(T t){
		Map<String,Object> returnMap = new HashMap<String,Object>();
		try {
			Class<?> clazz = t.getClass();
			Field[] fields = clazz.getDeclaredFields();
			for(Field field:fields){
				String fieldName = field.getName();
				String getMethodName = getGetMethodName(fieldName);
				Method getMethod = clazz.getMethod(getMethodName);
				Object value = getMethod.invoke(t);
				returnMap.put(fieldName, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return returnMap;
	}
	
	/**
	 * 
	 * Description: 根据字段名获取到get方法的名称
	 * @param  fieldName bean的属性名称
	 * @return String get方法的名称
	 * @Author julius
	 * Create Date: 2015年6月25日 下午5:20:18
	 */
	private static String getGetMethodName(String fieldName){
		String suffixName = fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
		String getMethodName = "get"+suffixName;
		return getMethodName;
	}
	
	/**
	 * 
	 * Description: 判断当前参数是否在要过滤的参数中
	 * @param  fieldName 字段名
	 * @param  ignoreParams 要过滤的字段 
	 * @return boolean 当存在时返回true 不存在返回false
	 * @Author julius
	 * Create Date: 2015年6月25日 下午5:37:46
	 */
	private static boolean isExistInIgnoreArray(String fieldName,String...ignoreParams){
		boolean flag = false;
		for(String ignoreParam:ignoreParams){
			if(ignoreParam.equals(fieldName)){
				flag = true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(null);
		person.setName("");
		System.out.println(checkParamsNull(person,"name","age"));
	}
}




class Person{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}