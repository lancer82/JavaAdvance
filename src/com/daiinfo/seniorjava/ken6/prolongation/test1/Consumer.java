package com.daiinfo.seniorjava.ken6.prolongation.test1;

public class Consumer implements Runnable {
	private ProductList pl = null;  
	  
    Consumer(ProductList pl) {  
        this.pl = pl;  
    }  
  
    @Override  
    public void run() {  
        // TODO Auto-generated method stub  
        for (int i = 0; i < 20; i++) {  
            Product p = pl.pop();  
            try {  
                Thread.sleep(2000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
  
    } 
}
