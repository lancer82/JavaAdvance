package com.daiinfo.seniorjava.ken3.implement;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class TestReflact {

	public static void getClassName() {
		// 第一种方式 通过对象getClass方法
		Person person = new Person("张", "男", "2010-09-10");
		Class<?> class1 = person.getClass();
		// 第二种方式 通过类的class属性
		class1 = Person.class;
		try {
			// 第三种方式 通过Class类的静态方法——forName()来实现
			class1 = Class.forName("com.daiinfo.seniorjava.ken3.implement.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	static void getClassInfo() {
		Person person = new Person("张", "男", "2010-09-10");
		Class<?> class1 = person.getClass();
		 
		try {
			// 第三种方式 通过Class类的静态方法——forName()来实现
			class1 = Class.forName("com.daiinfo.seniorjava.ken3.implement.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		boolean isPrimitive = class1.isPrimitive();// 判断是否是基础类型
		boolean isArray = class1.isArray();// 判断是否是集合类
		boolean isAnnotation = class1.isAnnotation();// 判断是否是注解类
		boolean isInterface = class1.isInterface();// 判断是否是接口类
		boolean isEnum = class1.isEnum();// 判断是否是枚举类
		boolean isAnonymousClass = class1.isAnonymousClass();// 判断是否是匿名内部类
		boolean isAnnotationPresent = class1
				.isAnnotationPresent(Deprecated.class);// 判断是否被某个注解类修饰

		String className = class1.getName();// 获取class名字 包含包名路径
		Package aPackage = class1.getPackage();// 获取class的包信息
		String simpleName = class1.getSimpleName();// 获取class类名
		int modifiers = class1.getModifiers();// 获取class访问权限

		Class<?>[] declaredClasses = class1.getDeclaredClasses();// 内部类
		Class<?> declaringClass = class1.getDeclaringClass(); // 外部类
		System.out.print(aPackage + "\t" + simpleName + "\t" + modifiers);

	}
	
	
	static void getFields() {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("com.daiinfo.seniorjava.ken3.implement.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Field[] allFields = class1.getDeclaredFields();// 获取class对象的所有属性
		Field[] publicFields = class1.getFields();// 获取class对象的public属性
		try {
			Field nameField = class1.getDeclaredField("name");// 获取class指定属性
			Field sexField = class1.getField("sex");// 获取class指定的public属性
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < allFields.length; i++) {
			System.out.println(allFields[i]);
		}
	}
	
	static void getMethods() {
		Class<?> class1 = null;
		try {
			class1 = Class.forName("com.daiinfo.seniorjava.ken3.implement.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Method[] methods = class1.getDeclaredMethods();// 获取class对象的所有声明方法
		Method[] allMethods = class1.getMethods();// 获取class对象的所有方法 包括父类的方法

		for (int i = 0; i < allMethods.length; i++) {
			System.out.println(allMethods[i]);
		}
	}
	
	
	static void getConstructors(){
		
		Class<?> class1 = null;
		try {
			class1 = Class.forName("com.daiinfo.seniorjava.ken3.implement.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?>[] allConstructors = class1.getDeclaredConstructors();//获取class对象的所有声明构造函数
		Constructor<?>[] publicConstructors = class1.getConstructors();//获取class对象public构造函数
		for (int i = 0; i < allConstructors.length; i++) {
			System.out.println(allConstructors[i]);
		}
	}
	
	public static void main(String[] args) {
		getClassName();
		getConstructors();
		getClassInfo();
		getFields();
		getMethods();
	}

}
