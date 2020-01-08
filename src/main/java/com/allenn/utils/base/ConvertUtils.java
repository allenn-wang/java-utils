package com.allenn.utils.base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 转换工具类 若待转换值为null或者出现异常，则使用默认值
 * @Author: allen wang
 * @Date: 2016-06-22
 */
public class ConvertUtils {
	
	/**
	 * @Description: 字符串转换为int
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param defaultValue	默认值
	 * @return
	 */
	public static int strToInt(String str, int defaultValue) {
		try {
			defaultValue = Integer.parseInt(str);
		} catch (Exception localException) {
		}
		return defaultValue;
	}

	/**
	 * @Description: String转换为long
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param defaultValue	默认值
	 * @return
	 */
	public static long strToLong(String str, long defaultValue) {
		try {
			defaultValue = Long.parseLong(str);
		} catch (Exception localException) {
		}
		return defaultValue;
	}
	
	/**
	 * @Description: 字符串转换为float
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param defaultValue	默认值
	 * @return
	 */
	public static float strToFloat(String str, float defaultValue) {
		try {
			defaultValue = Float.parseFloat(str);
		} catch (Exception localException) {
		}
		return defaultValue;
	}

	/**
	 * @Description: String转换为Double
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param defaultValue	默认值
	 * @return
	 */
	public static double strToDouble(String str, double defaultValue) {
		try {
			defaultValue = Double.parseDouble(str);
		} catch (Exception localException) {
		}
		return defaultValue;
	}

	/**
	 * @Description: 字符串转换日期
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param defaultValue	默认值
	 * @return
	 */
	public static Date strToDate(String str, Date defaultValue) {
		return strToDate(str, "yyyy-MM-dd HH:mm:ss", defaultValue);
	}

	/**
	 * @Description: 字符串转换为指定格式的日期
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str			待转换的字符串
	 * @param format		指定格式
	 * @param defaultValue	默认值
	 * @return
	 */
	public static Date strToDate(String str, String format, Date defaultValue) {
		SimpleDateFormat fmt = new SimpleDateFormat(format);
		try {
			defaultValue = fmt.parse(str);
		} catch (Exception localException) {
		}
		return defaultValue;
	}

	/**
	 * @Description: 字符串转换为指定格式的日期
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date			待转换的日期
	 * @param defaultValue	默认值
	 * @return
	 */
	public static String dateToStr(Date date, String defaultValue) {
		return dateToStr(date, "yyyy-MM-dd HH:mm:ss", defaultValue);
	}

	/**
	 * @Description: 日期转换为指定格式的字符串
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date			待转换的日期
	 * @param format		指定格式
	 * @param defaultValue	默认值
	 * @return
	 */
	public static String dateToStr(Date date, String format, String defaultValue) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			defaultValue = sdf.format(date);
		} catch (Exception localException) {
		}
		return defaultValue;
	}

	/**
	 * @Description: 如果字符串为空则使用默认字符串
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param str				字符串
	 * @param defaultValue		默认值
	 * @return
	 */
	public static String strToStr(String str, String defaultValue) {
		if ((str != null) && (!(str.isEmpty())))
			defaultValue = str;
		return defaultValue;
	}

	/**
	 * @Description:  util date 转换为 sql date
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date
	 * @return
	 */
	public static java.sql.Date dateToSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	/**
	 * @Description:  sql date 转换为 util date
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date
	 * @return
	 */
	public static Date sqlDateToDate(java.sql.Date date) {
		return new Date(date.getTime());
	}

	/**
	 * @Description: date 转换为 timestamp
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp dateToSqlTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	/**
	 * @Description: timestamp 转换为date
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param date
	 * @return
	 */
	public static Date sqlTimestampToDate(Timestamp date) {
		return new Date(date.getTime());
	}
}
