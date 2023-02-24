package java_hjs_chatting;

import java.net.*;

public class TcpClient {
	public static void main(String[] args) {
		
		String serverIP = "127.0.0.1";			
		
		try {
			Socket socket = new Socket(serverIP,7777);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
