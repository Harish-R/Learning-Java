package network;

import java.net.*;

public class Url {
	public static void main(String[] args) {
		try { 
			URL url = new URL("http://www.harishsblog.esy.es/index.html");
			System.out.println(url.getHost());
			System.out.println(url.getProtocol());
			System.out.println(url.getFile());
			URL url2 = new URL("http://www.w3schools.com/");
			//URL url3 = new URL("");
			URLConnection urlc = url2.openConnection();
			System.out.println("Content: " + urlc.getContent());
			System.out.println("Type: " + urlc.getContentType());
			System.out.println("Length: " +urlc.getContentLength());
			System.out.println("Expiration: " + urlc.getExpiration());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
