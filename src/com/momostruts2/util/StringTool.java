package com.momostruts2.util;

public class StringTool {
	
	public static boolean isNotEmpty(String target){
		if("".equals(target) || null == target) {
			return false;
		}
		return true;		
	}

	public static boolean isEmpty(String target){
		if("".equals(target) || null == target) {
			return true;
		}
		return false;		
	}
	
}
