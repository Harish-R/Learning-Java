package threads;

public class ExtendThread {
	public static void main(String[] args) {
		new Mythread1("One");
		System.out.println("End of program! "); 
	}
}

class Mythread1 extends Thread {
	
	Mythread1(String s) {
		super(s);
		System.out.println("Thread " + this + "started");
		start();
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