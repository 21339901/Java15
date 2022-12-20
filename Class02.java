package Java14;

import java.io.*;

public class Class02 {

	public static void main(String[] args) throws IOException {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		
		hi.run();
		bye.run();
//		在程式中 Hello 1~5會先跑完再跑 Good bye 1~5 因為只有單個執行緒
	}
}
class CTest{
	String id;
	public CTest(String str) {
		id = str;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<1;j++) {
				System.out.println(id+" "+i);
			}
		}
	}
}