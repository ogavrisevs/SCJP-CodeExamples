package chap2;

public class Overridde {

	public static void main(String[] argv){
		new Overridde();
	}
	
	Overridde(){
		
		BextendsA ba = new BextendsA();
		ba.method(""); 
		ClassA a = new BextendsA();
		a.method("");  // will call method from Object type
		
		
		ba.method(new Integer(1));
		ba.method((int) 1); // this method is not overridden ! 
		ba.method(new Short("1"));
		//ba.method(11.11F); //The method method(String) in the type BextendsA is not applicable for the arguments (float)
		
		A aa = new A();
		ba.method(aa);
		
		BextA baa = new CextB();
		a.method(baa);
		
		
	}
	
}

class ClassA {
	
	//--- change paaram type (optional count)
	// default access 
	void method(){
		System.out.println("ClassA : void method() ");
	}
	// overload method() 
	void method(String str){
		System.out.println("ClassA : void method(String str) ");
	}
	public void method(Integer i){
		System.out.println("ClassA : void method(Integer i) ");
	}
	private void method(int i){
		System.out.println("ClassA : void method(int i) ");
	}
	// change overloaded method Access is legal
	void method(byte b){
		System.out.println("ClassA : void method(byte b) ");
	}
	void method(A a){
		System.out.println("ClassA : void method(A a) ");
	}
	void method(BextA ba){
		System.out.println("ClassA : void method(BextA ba)");
	}
	void method(CextB cb){
		System.out.println("ClassA : void method(CextB cb)");
	}
	
	//--- change return type 

	BextA method0(){
		System.out.println("CextA method0()");
		return new BextA(); 
	}
}

class BextendsA extends ClassA {
	
	//--- change paaram type (optional count)
	// default access 
	void method(){
		System.out.println("BextendsA : void method() ");
	}
	// overload method() 
	void method(String str){
		System.out.println("BextendsA : void method(String str) ");
	}
	//void method(Integer i){
	//	System.out.println("BextendsA : void method(Integer i) ");
	//}
	protected void method(int i){
		System.out.println("BextendsA : void method(int i) ");
	}
	// change overloaded method Access is legal
	void method(byte b){
		System.out.println("BextendsA : void method(byte b) ");
	}
	//private void method(A a){ // inlegal : Cannot reduce the visibility of the inherited method from BaseClassAA
	void method(A a){  	
		System.out.println("BextendsA : void method(A a) ");
	}
	
	public void method(BextA ba){
		System.out.println("BextendsA : void method(BextA ba)");
	}
	protected void method(CextB cb){
		System.out.println("BextendsA : void method(CextB cb)");
	}
	
	//--- change return type 

	BextA method0(){
		System.out.println("CextA method0()");
		return new BextA(); 
	}
	
}


