package J;

public class Class12 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		CTest night = new CTest("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		
		try {
			t1.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t2.start();
			t2.join();
		}
		catch(InterruptedException e) {
		}
		System.out.println("All Threads are finished");
	}
}

class CTest  implements Runnable {
	String id;
	public CTest(String str) {
		id = str;
	}
	public void run(){
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 1; j++) {
				try {
					Thread.sleep((long) (20*Math.random()));
				}
				catch(InterruptedException e) {
				}
				System.out.println(id + " " + i);
			}
		}
	}
}
