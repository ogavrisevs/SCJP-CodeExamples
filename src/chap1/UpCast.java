package chap1;

// commit from IDEA
public class UpCast {
	public static void main(String[] argv){
		ClassP cp =  new SubClass(); // UpCasst
		((SubClass)cp).method();	//DownCast!
		
		Object obj =  new SubClass(); // UpCasst
		((SubClass)obj).method();	  //DownCast!
		
	}
}
class ClassP{
	ClassP(){
		System.out.println("ClassP constructor");
	}
	
}
class SubClass extends ClassP{
	SubClass(){
		System.out.println("SubClass constructor");
	}
	void method(){
		System.out.println("method call");
	}
}

