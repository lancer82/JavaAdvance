package java.com.daiinfo.seniorjava.ken6.prolongation.test1;

public class SX {
	public static void main(String[] args) {  
        ProductList pl = new ProductList();  
        Factory f = new Factory(pl);  
        Consumer c = new Consumer(pl);  
  
        Thread t1 = new Thread(f);  
        Thread t2 = new Thread(c);  
  
        t1.start();  
        t2.start();  
  
    }
}
