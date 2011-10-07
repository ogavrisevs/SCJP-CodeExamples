package chap8;

public class AnonymousInnerInterface {

	InheritMe im = new InheritMe(){
		// first concrete class
		@Override
		public void methDef() {
			System.out.println("InheritMe"+ this );
		}
	};
	
	public static void main (String... argv){
		new AnonymousInnerInterface().method();
	}
	
	void method(){
		im.methDef();
	}
}

interface InheritMe{
	int i = 9;
	void methDef();
}