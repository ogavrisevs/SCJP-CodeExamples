package chap2.statics;

public class StaticMethods {


	static public void main(String []str ){		
		AA.method();

		
	}

	
}


/* illegal static*/ class AA {
	int inctanceVarible = 0;
	static void method(){
		System.out.println("can call static method");	
	}
	private static void method1(){
		System.out.println("you can't see mee ! :D : private static void method1()");	
	}
	
	private static void method2(){
		String str = new String[] {"a", "b", "c"}[2];
		Object obj = (Object) new String[] {"a", "b", "c"};
		
		//instanceVaribele = 0; //instanceVaribele cannot be resolved to a variable
		//inctanceMethod(); //Cannot make a static reference to the non-static method
		AA aa = new AA();
		aa.inctanceVarible++;
		aa.inctanceMethod();
	}
	
	void inctanceMethod(){
		System.out.println("this is instance varible");
	}
}