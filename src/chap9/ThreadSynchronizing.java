package chap9;

public class ThreadSynchronizing {

	public static void main(String ... argv){
		ThreadSynchronizingEx tse = new ThreadSynchronizingEx();
		Thread th1 = new Thread(tse);
		Thread th2 = new Thread(tse);		
		th1.start();
		th2.start();
		
	}
}



class ThreadSynchronizingEx implements Runnable{
	private static int counter, counter2, counter3;
	
	@Override
	public void run(){
		int z = 0;
		while ( z++ < 10)
			System.out.println(Thread.currentThread().getName()+ 
					" worke done syn.: "+ synMethod() + " _ "+ synMethod2()+
					" worke done non-syn: "+ method());	
	}
	
	synchronized int synMethod(){
		int local = counter;
		for ( int i = 0 ; i < 1000000000; i++);
		counter++; 
		return local;
	}
	
	int synMethod2(){
		synchronized(this){
			int local = counter3;
			for ( int i = 0 ; i < 1000000000; i++);
			counter3++; 
			return local;
		}
	}
	
	int  method(){
		int local = counter2;
		for ( int i = 0 ; i < 1000000000; i++);
		counter2++; 
		return local;
	}
	
	
}  