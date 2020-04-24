package java.com.daiinfo.seniorjava.ken3.training;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

/*从properties配置文件中读取classname属性,显示其所有构造函数
 * 
 */

public class TestReflect {
	public static void main(String[] args) throws Exception {
		InputStream ips = new FileInputStream("./src/config.properties");
		Properties props = new Properties();
		props.load(ips);// 从配置文件中读取classname的值
		ips.close();
		String classname = props.getProperty("classname");
		Class<?> clazz = Class.forName(classname);
		Constructor<?> cons[] = clazz.getConstructors();
		// 查看每个构造方法需要的参数
		for (int i = 0; i < cons.length; i++) {
			Class<?> clazzs[] = cons[i].getParameterTypes();
			System.out.print(clazz.getName()+"[" + i + "] (");
			for (int j = 0; j < clazzs.length; j++) {
				//if (j == clazzs.length - 1)
					System.out.print(clazzs[j].getName());
					if(j!=clazzs.length-1){
						System.out.print(",");						
					}

			}
			System.out.print(")"+"\n");
		}
	}
}