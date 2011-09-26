package chap1;

public class Interfasee {

	public static void main(String [] argv){
		
		InterfaceImplamentation ii = new InterfaceImplamentation();
		ii.buggieMethod();
		ii.method();
		ii.method2();
		{
			ii.method3();
		}
		ii.method4();
		System.out.println(SimpleSubInterface.field);
		System.out.println(SimpleSubInterface.field2);
		System.out.println(ii.fieldM);
		
		SimpleSubInterface ssi = new InterfaceImplamentation();
		ssi.method();
		
	}

}



interface SimpleInterface{
	//String field = "static finall";
	static final String field2 = "same";
	void method(); 
	public void method2();
	abstract void method3();	
}

interface SimpleSubInterface extends SimpleInterface{
	public String field = "static finall";
	static final String field2 = "same";
	abstract void method4();	
}

abstract class AbstractClass implements SimpleSubInterface{
	public String fieldM = "abstract class field";
	
	abstract void buggieMethod(); 
	public void method(){// from interface 
		this.fieldM = "sddd";
		System.out.println("AbstractClass method() call");
	}
}


class InterfaceImplamentation extends AbstractClass /*implements SimpleSubInterface*/ {

	//@Override
	//public void method() {
	//	System.out.println("interface method implamentation");
	//}
	
	@Override
	public void method2() {
		System.out.println("interface method2 implamentation");		
	}

	@Override
	public void method3() {
		System.out.println("interface method2 implamentation");		
	}

	@Override
	public void method4() {
		System.out.println("interface method4 implamentation");
	}

	@Override
	void buggieMethod() {
		System.out.println("AbstractClass buggieMethod implamentation");
		
	}
	
}
