package chap1.classess;

public class FinalMethods {
	public static void main(String[] args) {
		new FinalMethods();
	}
	public FinalMethods() {
		
		SimpleClass sc = new SimpleClass();
		// invoking reference
		sc.method();
		
	}

}


class SimpleClass{
	final int sk;
	SimpleClass(){
		sk = 4;
	}
	
	// final method
	public final void method(){
		System.out.println("final method from SimpleClass");
	}
}

class SimpleClassSub extends SimpleClass {
	// inlegal 
	//void method(){
	//	System.out.println("final method from SimpleClassSub");
	//}
	
}