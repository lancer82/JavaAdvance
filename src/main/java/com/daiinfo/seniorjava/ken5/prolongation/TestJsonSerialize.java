package java.com.daiinfo.seniorjava.ken5.prolongation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author daiyuanquan
 * 
 */
public class TestJsonSerialize {
	public static void main(String[] args) throws IOException {
		try {
			new TestJsonSerialize().start();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() throws IOException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		
		//构建用户
		User u = new User();
		List<User> friends = new ArrayList<>();
		u.setName("张三");
		u.setPassword("123456");
		u.setBirthday(formatter.parse("19901009"));
		u.setEmail("zhangsan@qq.com");
		u.setFriends(friends);

		User f1 = new User();
		f1.setName("李四");
		f1.setPassword("123456");
		f1.setBirthday(formatter.parse("19891009"));
		f1.setEmail("lisi@qq.com");

		User f2 = new User();
		f2.setName("王五");
		f2.setPassword("123456");
		f2.setBirthday(formatter.parse("19881009"));
		f2.setEmail("wangwu@qq.com");
		
        /**
        * JSON序列化
        * Java对象转JSON
        */
		ObjectMapper mapper = new ObjectMapper();
		String jsonObject = mapper.writeValueAsString(u);
		System.out.println("--------------------------------------------");
		System.out.println("Java对象转JSON");
		System.out.println(jsonObject);
		System.out.println("--------------------------------------------");

		/**
		 * JSON序列化
		 * Java集合转JSON
		 */
		List<User> users = new ArrayList<User>();
		users.add(u);
		users.add(f1);
		users.add(f2);
		System.out.println("--------------------------------------------");
		System.out.println("Java集合转JSON");
		String jsonlist = mapper.writeValueAsString(users);
		System.out.println(jsonlist);
		System.out.println("--------------------------------------------");

		/**
		 * JSON序列化
		 * Java数组对象混合转JSON
		 * u有好友f1,f2
		 * friends.add(f1); friends.add(f2);
		 */
		friends.add(f1);
		friends.add(f2);
		String json = mapper.writeValueAsString(u);
		System.out.println("--------------------------------------------");
		System.out.println("Java数组对象混合转JSON");
		System.out.println(json);
		System.out.println("--------------------------------------------");
				
		/**
		 * JSON反序列化
		 * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
		 */
		String jsonString = "{\"name\": \"张三\",\"password\": \"123456\",\"birthday\": 655401600000,\"email\": \"zhangsan@qq.com\",\"friends\": [    ]}";
		ObjectMapper mapper2 = new ObjectMapper();
		User user = mapper2.readValue(jsonString, User.class);
		System.out.println(user.toString());
	}
}