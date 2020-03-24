package com.test;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey())&&p1.getValue().equals(p2.getValue());
	}
	
	public static void main(String[] args) {
		Pair<String, String> p1=new Pair<String, String>("name", "zhang");
		Pair<String, String> p2=new Pair<String, String>("name", "liu");
		System.out.println("比较结果："+Util.compare(p1, p2));
		
		Pair<String, Integer> p3=new Pair<String, Integer>("age", 67);
		Pair<String, Integer> p4=new Pair<String, Integer>("age", 67);
		System.out.println("比较结果：p3=p4\t"+Util.compare(p3, p4));
		
		Pair<Integer, String> p5 = new Pair<Integer, String>(1, "apple");
		Pair<Integer, String> p6 = new Pair<Integer, String>(2, "pear");
		boolean same = Util.compare(p1, p2);
		System.out.print("比较结果:"+same);
	}
}

