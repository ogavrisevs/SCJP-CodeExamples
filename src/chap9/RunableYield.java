package chap9;

import java.util.Date;

public class RunableYield {

	
	public static void main(String... argv){
		RunableYieldEx sre = new RunableYieldEx();

		Thread th1 = new Thread(new RunableYieldEx());		
		Thread th2 = new Thread(new RunableYieldEx());		
		Thread th3 = new Thread(new RunableYieldEx());
		Thread [] th = {th1, th2, th3};
		th1.start();
		th2.start();		
		th3.start();
	}
}

class RunableYieldEx implements Runnable {
	double counter, dd;
	public void run() {
		while (true){
			if (Thread.currentThread().getName().contains("Thread-0"))
				Thread.yield();
			if ( (counter += 0.0000001) > 1.0 ){
				System.out.println(Thread.currentThread().getName() +" : "+ (long)dd++);
				counter = 0;
			}
		}
	}
}