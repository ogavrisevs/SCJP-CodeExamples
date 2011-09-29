package chap2.statics;

public class StaticVarible {

	public static void main(String[] args) {
		new StaticVarible();
	}
	
	public StaticVarible() {
		System.out.println(A.i);
		A a = new A();
		// acess static varible 
		System.out.println(a.i); 
		System.out.println(A.i);
		
		new A().method();
		new A().method();		
		
	}
}


class A { 
	// default primitive val = 0;
	static int i;
	final int z; 	
	A(){
		z=i;
		i++;
	}
	
	void method(){
		System.out.println(" i : "+i +" z : "+ z);
	}
	
	
	
}
