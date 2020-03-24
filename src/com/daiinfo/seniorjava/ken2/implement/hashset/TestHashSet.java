package com.daiinfo.seniorjava.ken2.implement.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashSet{

	public static void hashSet1() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("java001");
		hashSet.add("java01");
		hashSet.add("java011");
		hashSet.add("java002");
		hashSet.add("java004");

		// 使用常用迭代器获取输出内容
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

	public static void hashSet2() {
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("zhangsan1", 21));
		hashSet.add(new Student("zhangsan1", 21));
		hashSet.add(new Student("zhangsan2", 21));
		hashSet.add(new Student("zhangsan3", 23));
		hashSet.add(new Student("zhangsan4", 24));
		// 使用常用迭代器获取值
		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Student next = (Student) iterator.next();
			System.out.println(next.getName() + " " + next.getAge());
		}
	}

	public static void main(String[] args) {
		hashSet1();
		hashSet2();
	}
}
