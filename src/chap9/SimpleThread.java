package chap9;

public class SimpleThread{

	public static void main(String... argv){
		SimpleThreadEx st = new SimpleThreadEx();
		st.start();
		System.out.println(Thread.currentThread().getName());		
	}
}


class SimpleThreadEx extends Thread {

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}


