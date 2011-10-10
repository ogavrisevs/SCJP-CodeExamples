package chap10.StaticImpPackge;

public class StaticImports {
	public static int staticVarible = 1;
	public int instanceVarible = 9; 
	
	public static void main(String [] argv){
		System.out.println("bum !");
		new StaticImports();
	}
		
	public StaticImports(){
		System.out.println("instance method");
	}
	
	static public void staticMethod(){
		System.out.println("staticMethod() from chap10.StaticImports ");
	}
}

class AnotherSimpleClass{
	AnotherSimpleClass(){
		System.out.println("AnotherSimpleClass constructor");
	}
}