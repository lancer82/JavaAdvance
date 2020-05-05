package cn.how2j.digit;

// JAVA中把数字转换为字符串，字符串转换为数字
public class NumberString {

	public static void main(String[] args) {
        int i = 5;
        double f = 3.14;
        String t = "3.1e4";
        
        //方法1
        String str = String.valueOf(i);
        String str1 = String.valueOf(f);
        System.out.println(str1); 
        
        //方法2
        Integer it = i;
        String str2 = it.toString();
        
        int j = Integer.valueOf(str);
        double d = Double.valueOf(str1);
        float tt = Float.valueOf(t);
        
        System.out.println(j);
        System.out.println(d);
       //如果字符串内容不是合法的数字表达，那么转换就会报错(抛出异常)
        System.out.println(tt);
        
	}

}
