package com.daiinfo.seniorjava.ken8.implement.test;

import java.util.Iterator;
import java.util.List;

import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    BookInfoDAO bookInfoDAO= new BookInfoDAO();
    List<BookInfo> books=bookInfoDAO.getList();
    for (BookInfo bookInfo : books) {
		System.out.println(bookInfo.getId()+"\t"+bookInfo.getBookNo()+"\t"+bookInfo.getBookname()+"\t"+bookInfo.getAuthor());
	}
	}

}
