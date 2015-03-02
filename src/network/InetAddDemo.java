package network;

import java.net.*;

public class InetAddDemo {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getLocalHost();
			System.out.println(add);
			add = InetAddress.getByName("www.harishsblog.esy.es");
			System.out.println(add);
			InetAddress[] adds = InetAddress.getAllByName("www.google.com");
			for(int i=0;i<adds.length;i++)
				System.out.println(adds[i]);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
