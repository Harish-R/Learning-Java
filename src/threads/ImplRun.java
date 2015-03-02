package threads;

public class ImplRun {
	public static void main(String[] args) {
		MyThread t = new MyThread("One");
		try {
			t.t.join(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of program! "); 
	}
}

class MyThread implements Runnable {
	Thread t;
	
	MyThread(String s) {
		t = new Thread(this, s);
		System.out.println("Thread " + t.getName() + " started!");
		t.start();
	}
	
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
