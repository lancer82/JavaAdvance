package cn.how2j.basic;


/*
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 1 分母和分子不能同时为偶数
 * 2 分母和分子 取值范围在[1-20]
 */
public class GoldenPoint {

	public static void main(String[] args) {
	    int numerator = 0 ;
	    int denominator = 0;
	    double goldsel = 0.618;
	    double temp = 1;
		
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
            	double ratio = (double)i / (double)j;
                if (0 == i % 2 && 0 == j % 2)
                    continue; //如果分子分母同时偶数则进行下次循环
                double dValue = Math.abs(ratio - goldsel);//与0.618进行相减
                if (dValue < temp) { //取绝对值
                    numerator = i;
                    denominator = j;  
                    temp = dValue;
                }
            }
        }
        System.out.println("0.618近似用分数表示为" + numerator + "/" + denominator + "相差" + temp);
	}

}
