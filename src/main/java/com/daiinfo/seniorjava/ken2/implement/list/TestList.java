package java.com.daiinfo.seniorjava.ken2.implement.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList {

	public static void main(String[] args) {
		List<User> list=new  ArrayList<User>();
		list.add(new User("小明", "xiaoming@qq.com"));
		
		User xiaozhang=new User("小张","xiaozhang@qq.com");
		User xiaohu=new User("小胡", "xiaohu@qq.com");
		list.add(xiaozhang);
		list.add(xiaohu);
			
		//遍历
		//方法1  
		ListIterator<User> it1 = list.listIterator();
		System.out.println("方法1 ");
        while(it1.hasNext()){
           User user=it1.next();
           System.out.println(user.getName()+user.getEmail());
        }

      //方法2
        System.out.println("方法2 ");
        for(Iterator<User> it2 = list.iterator();it2.hasNext();){
        	User user=it2.next();
        	System.out.println(user.getName()+user.getEmail());
        }
		
      //方法3
        System.out.println("方法3 ");
        for(User tmp:list){
            System.out.println(tmp.getName()+tmp.getEmail());
        }

        //方法4
        System.out.println("方法4 ");
        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i).getName()+list.get(i).getEmail());
        }
		
        //移除列表中的元素
        list.remove(1);
        
        System.out.println("方法3 ");
        for(User tmp:list){
            System.out.println(tmp.getName()+tmp.getEmail());
        }
	}
}
