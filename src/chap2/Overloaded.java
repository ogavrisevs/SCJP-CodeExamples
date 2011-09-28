package chap2;

public class Overloaded {

	public static void main(String[] argv){
		BaseClassA bc = new BaseClassA();
		bc.method();
		bc.method(1);
		bc.method(new Integer(0));
		bc.method("");
		bc.method((short)1);
		bc.method( new Short("1"));		

		A a = new A();
		bc.method(a);
		
		BextA ba = new BextA();
		bc.method(ba);
		
		CextB cb = new CextB();
		bc.method(cb);
		
		// fun starts here! 
		A aa = new BextA(); 
		bc.method(aa);      // overload will search method based on reference type !  
		BextA baa = new CextB();		
		bc.method(baa);		
		
		A aaa = bc.method0();
		//in legal 
		//CextB cbb = bc.method0();	// cannot convert from BextA to CextB	
	}
}

class BaseClassA {
	
	//--- change paaram type (optional count)
	// default access 
	void method(){
		System.out.println("BaseClass : void method() ");
	}
	// overload method() 
	void method(String str){
		System.out.println("BaseClass : void method(String str) ");
	}
	void method(Integer i){
		System.out.println("BaseClass : void method(Integer i) ");
	}
	protected void method(int i){
		System.out.println("BaseClass : void method(int i) ");
	}
	// change overloaded method Access is legal
	void method(byte b){
		System.out.println("BaseClass : void method(byte b) ");
	}
	void method(A a){
		System.out.println("BaseClass : void method(A a) ");
	}
	void method(BextA ba){
		System.out.println("BaseClass : void method(BextA ba)");
	}
	void method(CextB cb){
		System.out.println("BaseClass : void method(CextB cb)");
	}
	
	//--- change return type 

	BextA method0(){
		System.out.println("CextA method0()");
		return new BextA(); 
	}
	
}


class A{}
class BextA extends A{}
class CextB extends BextA{}; 

