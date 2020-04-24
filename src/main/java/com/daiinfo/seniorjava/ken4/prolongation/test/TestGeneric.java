package java.com.daiinfo.seniorjava.ken4.prolongation.test;

import java.com.daiinfo.seniorjava.ken4.prolongation.bean.User;
import java.com.daiinfo.seniorjava.ken4.prolongation.daoimpl.UserDaoImpl;
import java.util.List;

public class TestGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<java.com.daiinfo.seniorjava.ken4.prolongation.bean.User> list = null;
		UserDaoImpl imp = new UserDaoImpl();
		list = imp.findAll();
		for (User user : list) {
			System.out.println(user.getId() + " " + user.getUsername() + " "
					+ user.getPassword() + " " + user.getEmail() + " "
					+ user.getGrade());
		}
		// insert操作.
		User user = new User();
		user.setId(2);
		user.setUsername("张e");
		user.setPassword("123456");
		user.setEmail("zhangsan@sina.com");
		user.setGrade(5);
		imp.add(user);
		// update操作.
	    User user_1= new User();
		user.setId(2);
		user.setUsername("李w");
		user.setPassword("123456");
		user.setEmail("lisi@qq.com");
		user.setGrade(4);
		imp.update(user_1);
	}

}
