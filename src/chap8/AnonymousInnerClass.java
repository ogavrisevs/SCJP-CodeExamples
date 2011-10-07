package chap8;

public class AnonymousInnerClass {
	Classicc instanceVarible = new Classicc(){
		@Override
		void method(){
			System.out.println("instanceVarible :"+ this.getClass().getName());				
		}
	};

	
	public static void main(String ... argv){
		new AnonymousInnerClass().method();
	}
	
	void method(){
		Classicc anon = new Classicc(){
			@Override
			void method(){
				System.out.println("annon : "+ this.getClass().getName());
				super.method();
				System.out.println("annon varible i from Classicc:  "+ i++);				
			}
			void method(String str){
				System.out.println("annon : "+ this.getClass().getName() +" kuku "+ str);				
			}
		};
		
		
		anon.method();
		//anon.method("say ");//The method method() in the type Classicc is not applicable for the arguments (String)

		instanceVarible.method();
	}
}



class Classicc {
	protected int i;
	void method(){
		System.out.println("classicc :"+ this.getClass().getName());
	}
}
