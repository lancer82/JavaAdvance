package com.daiinfo.seniorjava.ken8.implement.test;

import java.awt.*;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;
import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;

public class TestShowOnTextArea {
	JFrame jf;
	JPanel jpanel;
	JTextArea jta = null;
	JScrollPane jscrollPane;
	BookInfoDAO bdao = new BookInfoDAO();
	Connection conn;
	private String m_TableName;

	public TestShowOnTextArea() {
		jf = new JFrame("显示结果");
		Container contentPane = jf.getContentPane();
		jta = new JTextArea(10, 15);
		jta.setEditable(false);
		jscrollPane = new JScrollPane(jta);
		contentPane.add(jscrollPane);
		jta.append("序号\t图书编号\t书名\t作者\t出版社\t单价\t出版日期\tISBN\t库存数量\n");

		List<BookInfo> books = bdao.getList();
		for (BookInfo book : books) {
			jta.append(Integer.toString(book.getId()));
			jta.append("\t" + book.getBookNo());
			jta.append("\t" + book.getBookname());
			jta.append("\t" + book.getAuthor());
			jta.append("\t" + book.getPublisher());
			jta.append("\t" + book.getPrice());
			jta.append("\t" + book.getPublishtime());
			jta.append("\t" + book.getISBN());
			jta.append("\t" + book.getAmount());
			jta.append("\n");

		}
		jf.setSize(500, 400);
		jf.setLocation(400, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new TestShowOnTextArea();
	}

}
