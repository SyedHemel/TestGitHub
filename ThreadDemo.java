package practice;

public class ThreadDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread();
		Thread t = new Thread(r);
		
		MyThread myThread = new MyThread();
		
		t1.start();
		t.start();
		
		myThread.start();
		
		t1.run();
		t.run();
		
		myThread.run();
		
		for(int i=0; i<2; i++){
			System.out.println("Executed by 'Main Thread'");
		}

	}

}


class MyRunnable implements Runnable {
	
	public void run(){
		for(int i=0; i<2; i++){
			System.out.println("Executed by 'Child Thread' from MyRunnable");
		}
	}
}

class MyThread extends Thread {
	
	public void run(){
		System.out.println("The 'child thread' from MyThread");
	}
}
