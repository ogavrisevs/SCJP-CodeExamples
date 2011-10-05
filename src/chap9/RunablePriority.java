package chap9;

import java.util.Date;

public class RunablePriority {

	
	public static void main(String... argv){
		PriorityRunableEx sre = new PriorityRunableEx();

		Thread th1 = new Thread(new PriorityRunableEx());		
		Thread th2 = new Thread(new PriorityRunableEx());		
		Thread th3 = new Thread(new PriorityRunableEx());
		Thread [] th = {th1, th2, th3};
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.NORM_PRIORITY);		
		th1.start();
		th2.start();		
		th3.start();
	}
}

class PriorityRunableEx implements Runnable {
	double counter;
	int nn;
	public void run() {
		try{
			while (true){
				counter += 0.00001 ;
				if (  nn != new Date().getSeconds() ){
					nn = new Date().getSeconds();
					System.out.println(Thread.currentThread().getName() +" : "+ (long)counter);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
