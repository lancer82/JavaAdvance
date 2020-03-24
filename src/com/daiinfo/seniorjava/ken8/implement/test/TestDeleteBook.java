package com.daiinfo.seniorjava.ken8.implement.test;

import java.util.ArrayList;
import java.util.List;

import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestDeleteBook {
	public static void main(String[] args) {
		BookInfo book = new BookInfo();
		book.setBookname("Java高级程序设计");
		System.out.println("________________________");
		BookInfoDAO bookInfoDAO = new BookInfoDAO();
		List<BookInfo> books = bookInfoDAO.queryByBookName(book.getBookname());
		if (books.size() >= 1) {
			int bookid = books.get(0).getId();
			if (!bookInfoDAO.delBookById(bookid)) {
				System.out.println("删除成功！");
			} else {
				System.out.println("删除失败！");
			}
		}
	}
}
