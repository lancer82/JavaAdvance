package com.daiinfo.seniorjava.ken7.implement;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestUDPSender {
	public static void main(String[] args) {
		// 1、定义服务器的地址、端口号、数据
		InetAddress address = null;
		try {
			address = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int port = 10010;
		byte[] data = "用户名：admin;密码：123".getBytes();

		// 2、创建数据报，包含发送的数据信息
		DatagramPacket packet = new DatagramPacket(data, data.length, address,
				port);

		// 3、创建DatagramSocket对象
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4、向服务器发送数据
		try {
			socket.send(packet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 接受服务器端响应数据
		// ======================================
		// 1、创建数据报，用于接受服务器端响应数据
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);

		// 2、接受服务器响应的数据
		try {
			socket.receive(packet2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String raply = new String(data2, 0, packet2.getLength());
		System.out.println("我是客户端，服务器说：" + raply);

		// 3、关闭资源
		socket.close();
	}
}
