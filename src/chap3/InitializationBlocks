package chap3;

public class InitializationBlocks {

	public static void main(String[] argv){
		new TestClass();
		new TestClass();		
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