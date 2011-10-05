package chap3;

public class InitializationBlocks {

	public static void main(String[] argv){
		new TestClass();
		new TestClass();
		System.out.println("-----------");
		new T2();
		new T2();		
		
	}
}

class TestClass{
	int i; 
	static int ii;
	int iii=8;
	
	TestClass(){
		System.out.println("constructor");
	}
	
	// run once per class init !
	static{
		ii= 1;
		System.out.println("static ii = "+ ii );
	}
	
	// run on every instance init. 
	{
		i = 9;
		System.out.println("inxtance i = "+ i);
	}
	
	static{
		ii= 99;
		System.out.println("static ii = "+ ii );
	}
	
}


class T1 {
	T1(){
		System.out.println("constructor T1");
	}

	static{
		System.out.println("T1 static");
	}
	{
		System.out.println("T1 instance");
	}
	
}

class T2 extends T1{
	T2(){
		//super();		
		this(f1());
		System.out.println("T2 construcotr");
	}
	T2(boolean b){
		System.out.println("T2 construcotr 2 !");
	}
	
	static{
		System.out.println("T2 static");
	}
	{
		System.out.println("T2 instance");
	}
	
	static boolean f1(){
		System.out.println("func1");
		return true;
	}
} 


