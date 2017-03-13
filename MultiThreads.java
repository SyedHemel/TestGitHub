package practice;

public class MultiThreads {

	public static void main(String[] args) {
		
		System.out.println("Hello from the main thread!");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		new Thread() {
			public void run(){
				System.out.println("Hello from anonymous!");
			}
		}.start();
		
		System.out.println("Hello from the main thread again!");

	}

}

class AnotherThread extends Thread {
	
	@Override
	public void run(){
		System.out.println("Hello from another thread!");
	}
}
