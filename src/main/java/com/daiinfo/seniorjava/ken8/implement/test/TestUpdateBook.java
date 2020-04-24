package java.com.daiinfo.seniorjava.ken8.implement.test;

import java.com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import java.com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestUpdateBook {
	public static void main(String[] args) {
		BookInfoDAO bdao = new BookInfoDAO();
		BookInfo book = new BookInfo("0203", "操作系统", "戴远泉");
		java.util.List<BookInfo> books = new java.util.ArrayList<BookInfo>();
		books = bdao.queryByBookName(book.getBookname());

		for (BookInfo bookInfo : books) {
			System.out.println(bookInfo.getId() + "\t" + bookInfo.getBookNo()
					+ "\t" + bookInfo.getBookname() + "\t"
					+ bookInfo.getAuthor());
		}

		book.setId(books.get(0).getId());

		book.setBookname("操作系统原理");
		book.setAuthor("王欣");
		book.setPublisher("华中科技大学出版社");
		book.setPublishtime("10170801");

		if (bdao.update(book)) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}

	}
}
