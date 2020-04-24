package java.com.daiinfo.seniorjava.ken8.implement.test;

import java.com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import java.com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestAddBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInfoDAO bookInfoDAO = new BookInfoDAO();
		BookInfo book = new BookInfo(null, null, null);
		book.setBookNo("08803");
		book.setBookname("Java高级程序设计");
		book.setAuthor("戴远泉");
		book.setPublisher("高等教育出版社");
		book.setPublishtime("20170809");
		book.setAmount(4);
		book.setPrice(45.05);
		book.setISBN("98745372123");
		if(bookInfoDAO.addBook(book))
		   System.out.println("添加成功！");
		else {
			System.out.println("添加失败！");
		}
	}
}
