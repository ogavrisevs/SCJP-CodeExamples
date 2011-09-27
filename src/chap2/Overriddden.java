package chap2;

public class Overriddden {

	public static void main(String[] args) {
		new Overriddden();

	}
	public Overriddden() {
	
		OverriderBaseClass o = new OverriderBaseClass();
		o.methodInBaseClass(); // method from superclass 
		o.methodOverided();  // overide method 
		//o.privateMethod();  // not visible method! 
		
		BaseClass bc = new OverriderBaseClass();
		bc.methodInBaseClass();
		bc.methodOverided(); // actual call will be from Overrider!
		
		// ClassCastException: BaseClass cannot be cast to Overrider
		//Overrider oo = (Overrider) new BaseClass();
		
	}

}


class BaseClass{
	public void methodInBaseClass(){
		System.out.println("BaseClass method0");
	}
	
	public void methodOverided(){
		System.out.println("BaseClass method");
	}
	private void privateMethod(){
		System.out.println("private method in BaseClass");
	}
}

class OverriderBaseClass extends BaseClass{
	@Override
	public void methodOverided(){
		System.out.println("Override method");
	}
	// Cannot reduce the visibility of the inherited method from BaseClass
	//private void method0(){	}
}