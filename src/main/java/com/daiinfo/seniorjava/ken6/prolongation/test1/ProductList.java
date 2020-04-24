package java.com.daiinfo.seniorjava.ken6.prolongation.test1;

public class ProductList {
	int index = 0;  
    private Product[] p = new Product[6];  
  
    public synchronized void push(Product pr) {  
  
        while (index == p.length) {  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        this.notify();  
        p[index] = pr;  
        System.out.println("生产了" + p[index]);  
        index++;  
  
    }  
  
    public synchronized Product pop() {  
  
        while (index == 0) {  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        this.notify();  
        index--;  
        System.out.println("消费了" + p[index]);   
        return p[index];  
  
    } 
}
