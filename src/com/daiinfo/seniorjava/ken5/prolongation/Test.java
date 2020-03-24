package com.daiinfo.seniorjava.ken5.prolongation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilEncrypt des = new UtilEncrypt();
		
		//待加密内容
		String str = "测试内容";
		//密码，长度要是8的倍数
		String key = "9588028820109132570743325311898426347857298773549468758875018579537757772163084478873699447306034466200616411960574122434059469100235892702736860872901247123456";

		byte[] result = UtilEncrypt.encrypt(str.getBytes(),key);
		System.out.println("加密后："+new String(result));

		//直接将如上内容解密
		try {
		byte[] decryResult = UtilEncrypt.decrypt(result, key);
		System.out.println("解密后："+new String(decryResult));
		} catch (Exception e1) {
		e1.printStackTrace();
		}
		
		
	}

}
