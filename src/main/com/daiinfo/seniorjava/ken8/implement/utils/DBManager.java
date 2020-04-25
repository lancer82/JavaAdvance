package com.daiinfo.seniorjava.ken8.implement.utils;

import java.sql.*;

/**
 * 数据库的连接和关闭等管理类
 * 
 * @author 戴远泉
 * 
 */
public class DBManager {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String USRENAME = "root";
	private static final String PASSWORD = "123456";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.print(getConn());
	}

	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USRENAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
