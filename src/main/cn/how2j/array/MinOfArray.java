package cn.how2j.array;

/**
 * 输出数组中的最小数
 * 
 *
 */
public class MinOfArray {

	public static void main(String[] args) {
		//首先创建一个长度是5的数组
		int[] a = new int[5];
		
        //然后给数组的每一位赋予随机整数
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);

		System.out.println("数组中的各个随机数是:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		int temp = a[0];
		for(int i : a ) {
			 if(i<temp)
				 temp=i;			
		}
			
		System.out.print("数组中的最小数是：" + temp);
		
	}
}
