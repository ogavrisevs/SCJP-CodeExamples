package wizLab.question;

public class Test {

	public static void main(String[] args) {
		new Test();
	}
	public Test() {
		
	}

}

class A{}
class B extends A{}
class C extends B{}

class TestC {
	public A getIt(){
		return new A();
	}
}

class TestCC extends TestC{
	//public C getIt(){
	//	return new C();
	//}
	public A getIt(){
		return new C();
	}
	
	
}