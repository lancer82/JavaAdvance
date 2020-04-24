package java.com.daiinfo.seniorjava.ken7.prolongation;

import java.net.*;

public class fMultiReceiver_2 {
	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket(8989);
			InetAddress address = InetAddress.getByName("228.5.6.7");
			ms.joinGroup(address);
			
			byte bs[] = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bs, bs.length);
			ms.receive(dp);
			
			bs = dp.getData();
			
			System.out.write(bs);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
