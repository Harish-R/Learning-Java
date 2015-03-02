package javaio;

import java.io.*;

public class ByteStream {
	public static void main(String[] args) { 
		File f = new File("./FileSrc", "sample.txt");
		System.out.println(f.exists());
		try {
			FileInputStream fis = new FileInputStream("sample.txt");
			System.out.println(fis.available());
			int n = fis.available();
			
			byte[] b = new byte[25];
			for(int i=0;i<30;i++)
				System.out.print((char)fis.read());
				System.out.println();
			fis.read(b);
			System.out.println(b.toString());
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("sample.txt", true);
			String s = "I have appended this string! at the end";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
