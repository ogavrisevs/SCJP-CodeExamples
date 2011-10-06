package chap9;

public class ThreadSafeAPI {


	public static void main(String ... str){
		
		new Thread (new ThreadSafeAPIex()).start();
		new Thread (new ThreadSafeAPIex()).start();
		new Thread (new ThreadSafeAPIex()).start();
		new Thread (new ThreadSafeAPIex()).start();
		
		new Thread (new ThreadNOTSafeAPIex()).start();		
		new Thread (new ThreadNOTSafeAPIex()).start();		
		new Thread (new ThreadNOTSafeAPIex()).start();
		new Thread (new ThreadNOTSafeAPIex()).start();
		
		try {Thread.currentThread().sleep(1000);} 
		catch (InterruptedException e) {e.printStackTrace(); }
			
		System.out.println("StringBuffer : "+ Worker.sb);
		System.out.println("StringBuilder: "+ WorkerNotSafe.sb);			
		

	}
}

class ThreadSafeAPIex extends Thread{
	@Override
	public void run(){
		for (int z = 0 ; z < 10; z++){
			try{
				int i = Worker.sb.length();
				Worker.sb.reverse();
				Worker.sb.append(i+ " ");
				Worker.sb.reverse();
				Worker.sb.replace(i, i, "+");
				Worker.sb.reverse();
				Worker.sb.deleteCharAt(i-2);
				Worker.sb.reverse();
			}catch (Exception e){
				Worker.sb.append("error");
			}
		}
	}
}  

class ThreadNOTSafeAPIex extends Thread{
	@Override
	public void run(){
		for (int z = 0 ; z < 10; z++){
			try{
				int i = WorkerNotSafe.sb.length();
				WorkerNotSafe.sb.reverse();
				WorkerNotSafe.sb.append(i + " ");
				WorkerNotSafe.sb.reverse();
				WorkerNotSafe.sb.replace(i, i, "+");
				WorkerNotSafe.sb.reverse();
				WorkerNotSafe.sb.deleteCharAt(i-2);
				WorkerNotSafe.sb.reverse();
			}catch (Exception e){
				WorkerNotSafe.sb.append("error");
			}
		}
	}
}  

class Worker{
	// Thread safe stuff !
	public static StringBuffer sb = new StringBuffer("_123");
	
}

/**
 * NOT THREAD SAFE !!!! 
 * 
 */
class WorkerNotSafe{
	public static StringBuilder sb = new StringBuilder("_123");
}