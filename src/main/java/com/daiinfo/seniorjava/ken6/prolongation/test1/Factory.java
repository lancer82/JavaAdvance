package java.com.daiinfo.seniorjava.ken6.prolongation.test1;

import java.com.daiinfo.seniorjava.ken6.prolongation.test1.Product;

public class Factory implements Runnable {
	private ProductList pl = null;  
	  
    Factory(ProductList pl) {  
        this.pl = pl;  
    }  
  
    @Override  
    public void run() {  
        // TODO Auto-generated method stub  
        while (true) {  
        	Product product = new Product((int) (Math.random() * 10000)); // 产生0~9999随机整数
        	 pl.push(product); 
              
            try {  
                Thread.sleep(200);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
  
    }
}
