package com.allenn.utils.encrypt;


/**
 * 加解密工具类<br>
 * 工具类包括：MD5加密、SHA加密、Base64加解密、DES加解密、AES加解密<br>
 *
 * @Author: allen wang
 * @Date: 2016-06-22
 *
 */
public class EncryptAndDecryptUtils {
	
	/**
	 * @Description: MD5 加密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value	待加密字符
	 * @return
	 */
	public static String md5Encrypt(String value){
		String result = null;
		if(value != null && !"".equals(value.trim())){
			result =  MD5Utils.encrypt(value,MD5Utils.MD5_KEY);
		}
		return result;
	}
	
	/**
	 * @Description: SHA加密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待加密字符
	 * @return	密文
	 */
	public static String shaEncrypt(String value){
		String result = null;
		if(value != null && !"".equals(value.trim())){
			result =  MD5Utils.encrypt(value,MD5Utils.SHA_KEY);
		}
		return result;
	}
	
	/**
	 * @Description: BASE64 加密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待加密字符串
	 * @return
	 */
	public static String base64Encrypt(String value){
		String result = null;
		if(value != null && !"".equals(value.trim())){
			result =  Base64Utils.encrypt(value.getBytes());
		}
		return result;
		
	}
	
	/**
	 * @Description: BASE64 解密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待解密字符串
	 * @return
	 */
	public static String base64Decrypt(String value){
		String result = null;
		try {
			if(value != null && !"".equals(value.trim())){
				byte[] bytes = Base64Utils.decrypt(value);
				result = new String(bytes);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @Description: DES加密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待加密字符
	 * @param key		若key为空，则使用默认key
	 * @return			加密成功返回密文，否则返回null
	 */
	public static String desEncrypt(String value,String key){
		key = key == null ? DESUtils.KEY : key;
		String result = null;
		
		try {
			if(value != null && !"".equals(value.trim())){
				result = DESUtils.encrypt(value, key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @Description: DES解密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待解密字符
	 * @param key		若key为空，则使用默认key
	 * @return
	 */
	public static String desDecrypt(String value,String key){
		key = key == null ? DESUtils.KEY : key;
		String result = null;
		
		try {
			if(value != null && !"".equals(value.trim())){
				result =  DESUtils.decrypt(value, key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @Description: AES加密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待加密内容
	 * @param key		秘钥
	 * @return
	 */
	public static String aesEncrypt(String value,String key ){
		key = key == null ? AESUtils.KEY : key;
		String result = null;
		try {
			if(value != null && !"".equals(value.trim())){		//value is not null
				result = AESUtils.encrypt(value,key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * @Description: AES解密
	 * @Author: allen wang
	 * @Date: 2016-06-22
	 *
	 * @param value		待解密内容
	 * @param key		秘钥
	 * @return
	 */
	public static String aesDecrypt(String value , String key){
		key = key == null ? AESUtils.KEY : key;
		String result = null;
		try {
			if(value != null && !"".equals(value.trim())){		//value is not null
				result = AESUtils.decrypt(value,key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
