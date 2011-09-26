package chap1.classess;

public class AbstractC {

	public static void main(String[] argv){
		ClassImplClas cic = new ClassImplClas();
		cic.metodImp();
		cic.method();
		cic.method1();
		cic.method2();
		System.out.println(cic.fieldDefualt);
		cic.setField();
		System.out.println(cic.fieldDefualt);		
		
	}
}


//only in new file *.java
//public abstract class ClasName2{}

abstract class Clas{
	String fieldDefualt;
	private String fieldPrivate;
	protected String fieldProtected;	
	abstract void method();
	abstract String method1();
	public void metodImp(){
		System.out.println("metodImp");
	}
	public void setField(){
		fieldDefualt = "Set";
	}
}

abstract class ClasName4 extends Clas {
	String field3;
	abstract String method2();
	String method1(){
		System.out.println("method1");
		return "";
	}
}

class ClassImplClas extends ClasName4{

	@Override
	void method() {
		System.out.println("method");
	}

	@Override
	String method2() {
		System.out.println("method2");
		return null;
	}
}

