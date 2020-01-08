package com.allenn.utils.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: 正则表达式工具类，验证数据是否符合规范
 * @Author: allen wang
 * @Date: 2016-06-22
 */
public class RegexUtils {
	
	/**
	 * @Description: 判断字符串是否符合正则表达式
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str
	 * @param regex
	 * @return
	 */
	public static boolean find(String str, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		boolean b = m.find();
		return b;
	}
	
	/**
	 * @Description: 判断输入的字符串是否符合Email格式.
	 * @autor: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param email 	传入的字符串
	 * @return 符合Email格式返回true，否则返回false
	 */
	public static boolean isEmail(String email) {
		if (email == null || email.length() < 1 || email.length() > 256) {
			return false;
		}
		Pattern pattern = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
		return pattern.matcher(email).matches();
	}
	
	/**
	 * @Description: 判断输入的字符串是否为纯汉字
	 * @autor: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		传入的字符串
	 * @return
	 */
	public static boolean isChinese(String value) {
		Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+$");
		return pattern.matcher(value).matches();
	}
	
	/**
	 * @Description: 判断是否为浮点数，包括double和float
	 * @autor: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		传入的字符串
	 * @return
	 */
	public static boolean isDouble(String value) {
		Pattern pattern = Pattern.compile("^[-\\+]?\\d+\\.\\d+$");
		return pattern.matcher(value).matches();
	}
	
	/**
	 * @Description: 判断是否为整数
	 * @autor: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		传入的字符串
	 * @return
	 */
	public static boolean isInteger(String value) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]+$");
		return pattern.matcher(value).matches();
	}
}
