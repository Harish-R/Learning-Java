package threads;

public class SyncThread {
	public static void main(String[] args) {
		PrintMsg target = new PrintMsg();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		// wait for threads to end
		try {
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
		} catch(InterruptedException e) {
		System.out.println("Interrupted");
		}
	}
}

class PrintMsg {
	
	PrintMsg() {
		
	}
	
	void print(String msg) {
		System.out.print("[ " + msg);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print(" ]");
	}
}

class Caller implements Runnable {
	PrintMsg target;
	String msg ;
	Thread t;
	Caller(PrintMsg target, String msg) {
		this.target = target;
		this.msg = msg;
		t = new Thread(this, msg);
		t.start();
	}
	
	public void run() {
		synchronized(target) {
			target.print(msg);
		}
	}
}
