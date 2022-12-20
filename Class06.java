package Java15;

import java.io.*;

public class Class06 {

	public static void main(String[] args) throws IOException {
		Add ad1 = new Add(5);
		Add ad2 = new Add(10);
		Thread t1 = new Thread(ad1);
		Thread t2 = new Thread(ad2);
		
		t1.start();
		t2.start();
	}
}
class Add implements Runnable{
	private int n;
	private int num;

	public Add(int a) {
		n = a;
	}
	
	public void run() {
			for(int i=1;i<=n;i++) {
				num += i;
			}
			System.out.println(num);
		}
	}
