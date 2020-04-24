package java.com.hbliti.example4.generic.test;

import java.com.hbliti.example4.generic.bean.User;
import java.com.hbliti.example4.generic.daoimpl.UserDaoImpl;
import java.util.List;

public class TestGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<java.com.hbliti.example4.generic.bean.User> list = null;
		UserDaoImpl imp = new UserDaoImpl();
		list = imp.findAll();
		for (User user : list) {
			System.out.println(user.getId() + " " + user.getUsername() + " "
					+ user.getPassword() + " " + user.getEmail() + " "
					+ user.getGrade());
		}
		// insert操作.
		User user = new User();
		user.setId(1);
		user.setUsername("张三");
		user.setPassword("123456");
		user.setEmail("zhangsan@sina.com");
		user.setGrade(5);
		imp.add(user);
		// update操作.
	    User user_1= new User();
		user.setId(1);
		user.setUsername("李四");
		user.setPassword("123456");
		user.setEmail("lisi@qq.com");
		user.setGrade(4);
		imp.update(user_1);
	}

}
