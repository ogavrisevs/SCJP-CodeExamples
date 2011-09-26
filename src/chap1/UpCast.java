package chap1;

public class UpCast {
	public static void main(String[] argv){
		ClassP cp =  new SubClass(); // UpCasst
		((SubClass)cp).method();	//DownCast!
		
		Object obj =  new SubClass(); // UpCasst
		((SubClass)obj).method();	  //DownCast!
		
	}
}
class ClassP{}
class SubClass extends ClassP{
	void method(){
		System.out.println("method call");
	}
}

