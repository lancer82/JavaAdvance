package java.com.daiinfo.seniorjava.ken8.implement.bean;

import java.io.Serializable;

/**
 * 图书信息类，实体类，存放图书的基本信息及基本操作
 * 
 * @author 戴远泉
 * @version 1.0
 */
public class BookInfo implements Serializable {
	int id;
	String bookNo;
	String bookname;
	String author;
	String publisher;
	double price;
	String publishtime;
	String ISBN;
	int amount;

	public BookInfo() {

	}

	public BookInfo(String bookNo, String bookname, String author) {
		this.bookNo = bookNo;
		this.bookname = bookname;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public String getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return bookNo + bookname + author;
	}

}
