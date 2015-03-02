package javaio;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File dirObj = new File("/FileSrc");
		File filObj = new File("FileSrc", "sample.txt");
		System.out.println(dirObj.isDirectory());
		System.out.println(dirObj.listFiles());
		System.out.println(dirObj.exists());
		System.out.println(dirObj.isFile());
		String[] files = dirObj.list();
		for(int i=0;i<files.length;i++)
			System.out.println(files[i]);
		System.out.println("End of Program");
	}
}
