package chap1.classess;

public class PublicClass {
	
	public static void main(String[] argv){
		// access same class 
		PublicClass cp = new PublicClass();
		new PublicClass("j");
		new PublicClass("j", "f");
		new PublicClass(true);		
		
		cp.method();
		cp.method("");
		cp.method("", "");
		cp.method(true);
		
		//defualt constructor in same pack.
		new DefualtClass2();
		new PublicSubClass(true);
		new PublicSubClass();
		
			
		
		
	}
	
	// defualt constuctor, not visibe  
	PublicClass (){
		System.out.println("Chap1Pub defualt constructor");
	}
	
	public PublicClass (String boo){
		System.out.println("Chap1Pub public constructor");
	}

	private PublicClass (String... boo){
		System.out.println("Chap1Pub private constructor");
	}
	
	protected PublicClass (Boolean boo){
		System.out.println("Chap1Pub protected constructor");
	}

	// no modiefier 
	void method(){
		System.out.println("Chap1Pub no modiefier method ");
	}
	
	public void method(String publicF){
		System.out.println("Chap1Pub public method ");
	}
	
	private void method(String... privateF){
		System.out.println("Chap1Pub private method ");
	}

	protected void method(boolean protectedF){
		System.out.println("Chap1Pub protected method ");
	}
}


// same package ! 
class DefualtSublClass  extends PublicClass {
	
	public static void main(String[] argv){
		
		// access same class 
		DefualtSublClass cpsc = new DefualtSublClass();
		new DefualtSublClass("j");
		new DefualtSublClass("j", "f");
		new DefualtSublClass(true);		
		
		cpsc.method();
		cpsc.method("");
		// cant acess 
		//cpsc.method("", "");
		cpsc.method(true);
	}
	
	// defualt constuctor, not visibe  
	DefualtSublClass(){
		System.out.println(this.getClass().getName() +" defualt constructor");
	}
	
	public DefualtSublClass (String boo){
		System.out.println(this.getClass().getName() +" public constructor");
	}

	private DefualtSublClass (String... boo){
		System.out.println(this.getClass().getName() +" private constructor");
	}
	
	protected DefualtSublClass (Boolean boo){
		System.out.println(this.getClass().getName() +" protected constructor");
	}
	
	public void methodP(){
		System.out.println(" method call from DefualtSublClass ");
	}
}

class DefualtClass {
	
	public static void main(String[] argv){
		
		//--- acess same class  
		DefualtClass cnp = new DefualtClass();
		new DefualtClass("j");
		new DefualtClass("j", "f");
		new DefualtClass(true);		
		
		cnp.method();
		cnp.method("");
		cnp.method("", "");
		cnp.method(true);	
		
		//--- acess pub class in same pack 		
		PublicClass cp = new PublicClass();
		new PublicClass("j");
		// cant access private 
		//new Chap1Pub("j", "f");
		new PublicClass(true);		
		
		cp.method();
		cp.method("");
		// cant access private, -> is not visible	
		//cp.method("", "");
		cp.method(true);
		
		
	}
	
	
	// defualt constuctor, not visibe  
	DefualtClass (){
		System.out.println(this.getClass().getName() +" defualt constructor");
	}
	
	public DefualtClass (String boo){
		System.out.println(this.getClass().getName() +" public constructor");
	}

	private DefualtClass (String... boo){
		System.out.println(this.getClass().getName() +" private constructor");
	}
	
	protected DefualtClass (Boolean boo){
		System.out.println(this.getClass().getName() +" protected constructor");
	}

	// no modiefier 
	void method(){
		System.out.println(this.getClass().getName() +" no modiefier method ");
	}
	
	public void method(String boo){
		System.out.println(this.getClass().getName() +" public method ");
	}
	
	private void method(String... boo){
		System.out.println(this.getClass().getName() +" private method ");
	}

	protected void method(boolean boo){
		System.out.println(this.getClass().getName() +" protected method ");
	}

	public void accessByRef(DefualtClass dc){
		// all methods visible!!! 
		dc.method();
		dc.method("");
		dc.method("", "");
		dc.method(true);
	}
	
}


class testAccess  {
	byte a =1, b=7; 
	
	public static void main(String[] argv){
		
		//--- acess same class  
		DefualtClass cnp = new DefualtClass();
		new DefualtClass("j");
		//The constructor DefualtClass(String...) is not visible
		//new DefualtClass("j", "f");
		new DefualtClass(true);		
		
		cnp.method();
		cnp.method("");
		//The method method(String...) from the type DefualtClass is not visible
		//cnp.method("", "");
		cnp.method(true);
	}
	
}


