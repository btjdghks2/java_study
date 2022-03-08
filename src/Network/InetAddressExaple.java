package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터　IP주소："+ local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소：" + remote.getHostAddress());
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
