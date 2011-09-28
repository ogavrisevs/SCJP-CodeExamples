package chap2;

public class LegalReturnTypes {

	public static void main(String[] args) {
		new LegalReturnTypes();

	}
	public LegalReturnTypes() {
		SimpleB ab = method();
		ab.methodA();
		ab.methodB();
		
		SimpleB ab1 = method1();
		ab1.methodB();
		SimpleC sc = (SimpleC) ab1;//up-cast
		sc.methodA();		
		sc.methodB();
		sc.methodC();
		
		SimpleA aa2 = method();
		SimpleB ab2 =  (SimpleB)aa2; //down-cast 
		ab2.methodA();
		ab2.methodB();
		
		//SimpleB ab2 =	method2(); inlegal !!!!
		// java.lang.ClassCastException: chap2.SimpleA cannot be cast to chap2.SimpleB
		
		Object obj = method3();
		if (obj instanceof Object)
			System.out.println("this is Object");

		if (obj instanceof SimpleA)
			System.out.println("this is SimpleA");
		if (obj instanceof SimpleB)
			System.out.println("this is SimpleB");
		if (obj instanceof SimpleC)
			System.out.println("this is SimpleC");
		
		
	}

	
	/**
	 * Obj Reference SimpleB, obj type SimpleB 
	 * @return
	 */
	SimpleB method(){
		return  new SimpleB();
	}
	
	/**
	 * Obj Reference SimpleB, obj type SimpleC   
	 */
	SimpleB method1(){
		return  new SimpleC();
	}
	
	/**
	 * 
	 */
	SimpleB method2(){
		return  (SimpleB)new SimpleA();
	}

	Object method3(){
		return  new SimpleB();
	}
	
}


class SimpleA{
	void methodA(){
		System.out.println("SimpleA");
	}
}
class SimpleB extends SimpleA{
	void methodB(){
		System.out.println("SimpleB");
	}
}
class SimpleC extends SimpleB{
	void methodC(){
		System.out.println("SimpleC");
	}
}