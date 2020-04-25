package com.daiinfo.seniorjava.ken8.prolongation;

import java.sql.*;
import org.apache.commons.dbcp.BasicDataSource;

public class DBConnPool {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String USRENAME = "root";
	private static final String PASSWORD = "123456";
	private static BasicDataSource bds;

	static {
		bds = new BasicDataSource();
		bds.setDriverClassName(DRIVER);// 设置驱动类
		bds.setUrl(URL);// 设置连接路径
		bds.setUsername(USRENAME);// 设置连接数据库管理员账号
		bds.setPassword(PASSWORD);// 设置连接数据库密码
		bds.setMinIdle(5);// 最小连接数
		bds.setMaxActive(20);// 最大连接数
	}

	// 获取连接的方法
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = bds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
