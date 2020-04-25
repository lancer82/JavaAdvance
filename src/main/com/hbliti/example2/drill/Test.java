package com.hbliti.example2.drill;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	static void keySetTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		map.put("04", "zhangsan4");

		// 先获取map集合中的所有键的集合keyset（）；
		Set<String> keySet = map.keySet();

		Iterator<String> iterator = keySet.iterator();
		String content = "";
		while (iterator.hasNext()) {
			String next = iterator.next();
			String string = map.get(next);
			String contents = "";
			if (iterator.hasNext()) {
				contents = next + "=" + string + "&";
			} else {
				contents = next + "=" + string;
			}
			System.out.println(contents);
			content += contents;
		}
		System.out.println(content);
	}

	static void entrySetTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		map.put("04", "zhangsan4");
		// 将map集合中的映射关系取出，存入到set集合中。
		Set<Entry<String, String>> entrySet = map.entrySet();

		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			String key = next.getKey();
			String value = next.getValue();

			System.out.println("key:" + key + "  value:" + value);
		}
	}
	
	
	static void entryTest(){
		HashMap<Student, String> map = new HashMap<Student, String>();
		map.put(new Student("张三", 21), "杭州");
		map.put(new Student("李四", 22), "北京");
		map.put(new Student("张五", 23), "广州");
		map.put(new Student("李三", 24), "上海");
		map.put(new Student("小李子", 25), "江西");

		Set<Student> keySet = map.keySet();
		Iterator<Student> iterator = keySet.iterator();
		while (iterator.hasNext()) {
		Student next = iterator.next();
		String string = map.get(next);

		System.out.println(next.getName()+"  "+next.getAge()+"  "+string);
		}
		System.out.println("***************************************");

		Set<Entry<Student, String>> entrySet = map.entrySet();
		Iterator<Entry<Student, String>> iterator2 = entrySet.iterator();

		while (iterator2.hasNext()) {
		Entry<Student, String> next = iterator2.next();
		Student key = next.getKey();
		String value = next.getValue();
		System.out.println(key.getName()+" "+key.getAge()+" "+value);
		}
	}

	public static void main(String[] args) {

		keySetTest();
		entrySetTest();
		entryTest();

	}

}
