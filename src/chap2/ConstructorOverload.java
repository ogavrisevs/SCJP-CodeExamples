package chap2;

public class ConstructorOverload {

	public static void main(String argv[]){
		new ConstructorOverload();
	}
	
	ConstructorOverload(){
		new AA();
		new AA(1);
		new AA(new Integer(1)).A(1);
		
		new BB();
		new BB(1);
		new BB("");		
	}
	
	
}



class AA {
	AA(){
		super(); // call to Object constructor 
		System.out.println("default constructor : A()");
	}
	AA(String str ){
		this();   
		System.out.println("constructor : A(String str )");
	}
	AA(Integer i ){
		this("ss");   
		System.out.println("constructor : A(Integer i )");
	}
	private AA(char c ){ // only for locals use (in class) 
		this("ss");   
		System.out.println("constructor : private A(char c )");
	}
	protected AA(int i ){ // only for locals use (in class) 
		this("ss");   
		System.out.println("constructor : protected A(int i )");
	}
	
	//Constructor call must be the first statement in a constructor
	// legal but bad practise 
	void A(Integer i ){
		//this("ss");    
		System.out.println("method NOT constructor !!! ");
	}
}   
class BB extends AA{ 
	BB(){
		// super will bee inserted by compiler
		System.out.println("BB constructor : BB()");
	}
	BB(String str){
		// illegal
		//System.out.println("Constructor call must be the first statement in a constructor");
		super( method());
		System.out.println("BB constructor : BB(String str)");		
	}
	BB(Integer i){
		this("");
		System.out.println("BB constructor : BB(Integer i)");
	}
	static int method (){
		System.out.println("static method call");
		return(1);
	}
}