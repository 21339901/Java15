package Java15;

import java.io.*;

public class Class07 {

	public static void main(String[] args) throws IOException {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		t1.start();
		t2.start();
		t3.start();
	}
}
class CTest implements Runnable{
	String id;
	public CTest(String str) {
		id = str;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<1000;j++) {
				System.out.println(id+" "+i);
			}
		}
	}
}
