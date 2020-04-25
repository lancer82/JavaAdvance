package com.daiinfo.seniorjava.ken8.implement.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestQueryBybookname {
	public static void main(String[] args) {
		BookInfoDAO bookInfoDAO = new BookInfoDAO();
		List<BookInfo> books = bookInfoDAO.queryByBookName("Java程序设计");

		for (BookInfo bookInfo : books) {
			System.out.println(bookInfo.getId() + "\t" + bookInfo.getBookNo()
					+ "\t" + bookInfo.getBookname() + "\t"
					+ bookInfo.getAuthor());
		}
	}
}
