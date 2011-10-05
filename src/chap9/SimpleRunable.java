package chap9;

import java.io.Console;
import java.io.IOException;

public class SimpleRunable {

	
	public static void main(String... argv){
		SimpleRunableEx sre = new SimpleRunableEx();

		Thread th1 = new Thread(sre);		
		Thread th2 = new Thread(sre);		
		Thread th3 = new Thread(sre);
		Thread [] th = {th1, th2, th3};
		
		th1.start();
		th2.start();		
		th3.start();
		
		while(true){ 
			for(Thread tt : th){
				System.out.println(tt.getName() +" : "+ tt.getState());
				try{ Thread.sleep(1000);
				}catch(Exception e){ e.printStackTrace();}
			}
		}
	}
}

class SimpleRunableEx implements Runnable {
	public void run() {
		try{
			// infinitive loop
			while (true){
				// working
				for (int b = 0; b < 1000; b++)				
					for (int i = 0; i < 1000; i++);
				// some rest 
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
