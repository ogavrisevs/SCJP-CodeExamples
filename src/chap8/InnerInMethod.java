package chap8;

public class InnerInMethod {

	public static void main (String ... argv){
		new InnerInMethod().method();
	}
	
	
	void method(){
		class ThisIsSick{
			void method(){
				System.out.println(this);
			}
		}
		ThisIsSick tis = new ThisIsSick();
		
		System.out.println(this);
		tis.method();
	}
	
	
}
