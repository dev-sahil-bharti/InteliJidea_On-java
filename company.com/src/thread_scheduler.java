class myScheduler extends Thread {
	public void run(){
		String n = Thread.currentThread().getName();
		for(int i = 1; i <= 3; i++) {
			System.out.println(n);
		}
	}
}
public class Main {
	public static void main(String[]args) {
		myScheduler t1 = new myScheduler();
		myScheduler t2 = new myScheduler();
		myScheduler t3 = new myScheduler();

		t1.setName("thread 1");
		t1.setName("thread 2");
		t1.setName("thread 3");

		t1.start();
		t2.start();
		t3.start();
	}
}