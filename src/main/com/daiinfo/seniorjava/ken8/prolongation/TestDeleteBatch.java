package com.daiinfo.seniorjava.ken8.prolongation;

import java.util.Iterator;

import com.daiinfo.seniorjava.ken8.implement.bean.BookInfo;
import com.daiinfo.seniorjava.ken8.implement.dao.BookInfoDAO;

public class TestDeleteBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "15,17,18";
		String[] s = string.split(",");

		/*
		 * for (String string2 : s) {
		 * System.out.println(Integer.parseInt(string2)); }
		 */

		BookInfoDAO bdao = new BookInfoDAO();
		BookInfo book = new BookInfo();

		if (bdao.deleteBatch(string)) {
			System.out.print("删除成功！");
		} else {
			System.out.print("删除失败！");
		}
	}
}
