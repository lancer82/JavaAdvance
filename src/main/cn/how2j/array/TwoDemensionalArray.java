package cn.how2j.array;

/*
 * 找出二维数组中的最大值
 */
public class TwoDemensionalArray {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int b=0,c=0,max;
		for(int i = 0 ; i<5; i++) {
			for(int j = 0; j<5; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		max = a[0][0];
		for(int i = 0 ; i<5; i++) {
			for(int j = 0; j<5; j++) {				
				if(max< a[i][j]) {
					max = a[i][j];
					b=i+1;
					c=j+1;
				}
			}
		}

		System.out.println("这个二维数组中的最大值是："+max);
		System.out.println("这个元素的位置是：第"+b+"行,第"+c+"列");

	}

}
