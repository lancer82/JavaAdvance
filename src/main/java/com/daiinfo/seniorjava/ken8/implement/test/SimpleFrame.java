package java.com.daiinfo.seniorjava.ken8.implement.test;
import javax.swing.*;
public class SimpleFrame extends JFrame{
	public SimpleFrame(String title,int width,int height){
		super(title);
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
