class myRunnable implements Runnable {
	public void run() {
		try {
			for(int i = 1; i<=5; i++) {
				System.out.println("child thread class");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i) {
			System.out.println(i);
		}
	}
}
public class Main {
	public static void main(String[] args)throws InterruptedException {

		myRunnable r = new myRunnable();
		Thread t = new Thread(r);

		t.start();
		for(int i = 1; i<=10; i++) {
			System.out.println("main class thread");
			Thread.sleep(1000);
		}
	}
}