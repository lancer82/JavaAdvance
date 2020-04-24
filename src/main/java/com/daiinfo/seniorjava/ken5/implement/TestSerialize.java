package java.com.daiinfo.seniorjava.ken5.implement;

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
		File file = new File("d:\\employee23.dat");
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
	}
}
