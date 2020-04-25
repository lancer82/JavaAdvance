package com.daiinfo.seniorjava.ken8.implement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import com.daiinfo.seniorjava.ken8.implement.utils.DBManager;

/**
 * 数据访问类，封装对数据库表的增删改查操作
 * 
 * @author 戴远泉
 * @version 1.0
 */
public class BookInfoDAO {
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	private Statement st;

	/**
	 * 添加图书
	 * 
	 * @param book
	 * @return 布尔类型值
	 */
	public boolean addBook(BookInfo book) {
		boolean flag = false;
		conn = DBManager.getConn();
		String sqlString = "insert into bookinfo(bookNo,bookname,author,publisher,price,publishtime,ISBN,amount) values(?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sqlString);
			ps.setString(1, book.getBookNo());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublisher());
			ps.setDouble(5, book.getPrice());
			ps.setString(6, book.getPublishtime());
			ps.setString(7, book.getISBN());
			ps.setInt(8, book.getAmount());
			flag = ps.executeUpdate() != 0 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 根据图书名查询
	 * 
	 * @param bname
	 * @return 图书列表
	 */
	public List<BookInfo> queryByBookName(String bname) {
		List<BookInfo> books = new ArrayList<BookInfo>();
		conn = DBManager.getConn();
		String sqlString = "select * from bookinfo where bookname like ?";

		try {
			ps = conn.prepareStatement(sqlString);
			// bname = "%" + bname + "%";
			ps.setString(1, bname);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int bookId = rs.getInt("ID");
				String bookNo = rs.getString("bookNo");
				String bookname = rs.getString("bookname");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String publishtime = rs.getString("publishtime");
				double price = rs.getFloat("price");
				String ISBN = rs.getString("ISBN");
				int amount = rs.getInt("amount");

				BookInfo book = new BookInfo(bookNo, bookname, author);
				book.setId(bookId);
				book.setPublisher(publisher);
				book.setPublishtime(publishtime);
				book.setISBN(ISBN);
				book.setPrice(price);
				book.setAmount(amount);
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	/**
	 * 查询所有的数据列表
	 * 
	 * @return 图书结果集
	 */
	public List<BookInfo> getList() {
		List<BookInfo> books = new ArrayList<BookInfo>();
		conn = DBManager.getConn();
		String sql = "select * from bookinfo";
		try {

			/*
			 * st = conn.createStatement(); rs = st.executeQuery(sql);
			 */
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				BookInfo book = new BookInfo();
				book.setId(rs.getInt(1));
				book.setBookNo(rs.getString(2));
				book.setBookname(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setPublisher(rs.getString(5));
				book.setPrice(rs.getDouble(6));
				book.setPublishtime(rs.getString(7));
				book.setISBN(rs.getString(8));
				book.setAmount(rs.getInt(9));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}

	/**
	 * 根据图书的ID删除图书
	 * 
	 * @param id
	 * @return
	 */
	public boolean delBookById(int id) {
		boolean flag = false;
		conn = DBManager.getConn();
		String sql = "delete from bookinfo where ID=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			if (ps.execute()) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 根据图书进行修改其信息
	 * 
	 * @param book
	 * @return
	 */
	public boolean update(BookInfo book) {
		boolean flag = false;
		conn = DBManager.getConn();
		String sql = "update bookinfo set bookNo = ?,bookname = ?,author=?,publisher=?,price=?,publishtime=?,ISBN=?,amount=? where ID=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getBookNo());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublisher());
			ps.setDouble(5, book.getPrice());
			ps.setString(6, book.getPublishtime());
			ps.setString(7, book.getISBN());
			ps.setInt(8, book.getAmount());
			ps.setInt(9, book.getId());
			flag = ps.executeUpdate() > 0 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 批量删除 将图书的ID组合成字符串，并用“，”隔开
	 * 
	 * @param param
	 * @return
	 */
	public boolean deleteBatch(String param) {
		Boolean flag = false;
		conn = DBManager.getConn();

		String[] strings = param.split(",");

		try {
			conn.setAutoCommit(false);
			conn.commit();// 提交事务
			for (String s : strings) {
				int id = Integer.parseInt(s);
				delBookById(id);
			}
			flag = true;
		} catch (SQLException e) {
			try {
				conn.rollback(); // 进行事务回滚
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} 
		return flag;
	}

}
