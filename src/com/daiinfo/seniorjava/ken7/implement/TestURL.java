package com.daiinfo.seniorjava.ken7.implement;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) {
		try {
			String s_url = "https://www.baidu.com/";
			URL url = new URL(s_url);
			System.out.println(url.getAuthority());// 获得此URL的授权部分
			System.out.println(url.getContent());// 获得此URL的内容
			System.out.println(url.getDefaultPort());// 获得与此URL关联协议的默认端口号
			System.out.println(url.getFile());// 获得此URL的文件名
			System.out.println(url.getHost());// 获得此URL的主机名（如果适用）
			System.out.println(url.getPath());// 获得此URL的路径部分
			System.out.println(url.getPort());// 获得此URL的端口号
			System.out.println(url.getProtocol());// 获得此URL的协议名称
			InputStream in = url.openStream();// 返回读入网站内容的字节输入流
			// 上一句等同于下面两句
			// URLConnection conn = url.openConnection();
			// InputStream in = conn.getInputStream();
			// 转换成带缓冲的字符输入流
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			String msg = null;
			// 读取内容，直到为空
			while ((msg = reader.readLine()) != null) {
				// 把内容输出到控制台
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
