package java.com.hbliti.example5.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {
	public static void main(String[] args) {

		// 创建一个员工对象
		Address address = new Address("中国", "吉林", "长春");// 创建address对象
		Employee employee = new Employee("张XX", 30, address);// 创建employee1对象

		// 将该对象写入到文件中，序列化该对象
		File file = new File("d:\\employee.dat");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);

			oos.flush();
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 从文件中读取对象，反序列化该对象
		Employee employee1 = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee1 = (Employee) ois.readObject();

			System.out.println("修改前员工的信息：");
			System.out.println(employee1);// 输出employee对象

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//修改该员工的相关信息
		employee1.getAddress().setState("中国");
		employee1.getAddress().setProvince("湖北省");
		employee1.getAddress().setCity("武汉市");

		employee1.setAge(21);

		//将该员工对象再次写入文件中，进行序列化
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee1);

			oos.flush();
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 再次从文件中读取对象，进行反序列化
		Employee employee2 = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee2 = (Employee) ois.readObject();

			System.out.println("修改后员工的信息：");
			System.out.println(employee2);// 输出employee对象

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
