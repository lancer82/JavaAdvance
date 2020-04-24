package java.com.daiinfo.seniorjava.ken2.prolongation;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class TestInputFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					InputFrame frame = new InputFrame("信息录入界面");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
}
