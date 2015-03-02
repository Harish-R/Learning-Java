package javaio;

public class Demo extends Thread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		for(int i=1;i<6;i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(i==5) i = 0; 
		}
	}
}
