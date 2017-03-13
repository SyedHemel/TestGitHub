package practice;

public class Concurrency {

	public static void main(String[] args) {
		
		TestThread t = new TestThread();
		t.start();
		
		System.out.println("Executed from the thread named: " + Thread.currentThread().getName());
		
		TestRunnable r = new TestRunnable();
		//r.run();
		Thread x = new Thread(r);
		x.start();

	}

}


class TestThread extends Thread {
	
	public void run(){
		System.out.println("The 'child thread' from TestThread named: "+ Thread.currentThread().getName());
	}
}


class TestRunnable implements Runnable {
	
	public void run(){		
			System.out.println("Executed by 'Child Thread' from TestRunnable named: " + Thread.currentThread().getName());		
	}
}