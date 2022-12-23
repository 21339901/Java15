package Java15;

public class Class14 {

	public static void main(String[] args) {
		 PrePaid pp1=new PrePaid();
		 PrePaid pp2=new PrePaid();
		 PrePaid pp3=new PrePaid();
	     pp1.start();
	    	 pp2.start();
		     pp3.start();    
	}
}

class PrePaid extends Thread {
   private static int sum=200;
   int fee;
   
   public void run() {
	   while(true) {
		   if(sum<=10) 
			   break;
			   fee = (int)(100*Math.random());
			   talk(fee);
		   
	 }
   }
   public synchronized static void talk(int d) {
	 
	  int tmp=sum;
      tmp=tmp-d;    
      if(sum>10) {
      try{
         Thread.sleep((int)(1000*Math.random()));  
      }
      catch(InterruptedException e){
      }

      sum=tmp;
      System.out.println("通話費: "+d+" 餘額: "+sum);
      }
	   }
}
