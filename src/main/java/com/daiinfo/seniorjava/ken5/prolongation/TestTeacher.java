package java.com.daiinfo.seniorjava.ken5.prolongation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setName("李浩");
		teacher.setID(111111);
		String password = "123456";
		UtilEncrypt md5 = new UtilEncrypt();
		password = md5.MD5Encode(password);// 加密
		teacher.setPassword(password);
		teacher.setBirthday("19871009");
		teacher.setSalary(10000);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String currentDate =formatter.format(new Date());
		teacher.setDateAmendment(currentDate);
		System.out.println(teacher.toString());

		UtilSerializeAndDeserialize.serialize(teacher);

		Teacher teacher1 = UtilSerializeAndDeserialize.deserialize();
		System.out.println(teacher1.toString());

	}
}
