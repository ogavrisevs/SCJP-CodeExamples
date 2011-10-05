package chap1.classess;

public class VarArgs {

	public static void main(String[] args) {
		new VarArgs();
	}

	VarArgs(){
		method();
		method("a");
		method("a", "b", "c");
		// inelegal method("a", "b", 1);		
		method2(1);
		String [] argv = new String[] {"a", "b"};

		// The method method3(String[]) is not applicable for the arguments
		//method3("a", "b", "c");
		
		method(argv);
		method3(argv);		
		
	}
	
	void method(String... vararg ){
		for (int i = 0; i < vararg.length; i++){
			String st = vararg[i];
			System.out.print(st+ " ");
		}
		System.out.println();
	}
	//inlegal 
	//void method2(String... vararg, int ii ){
	void method2(int ii, String... vararg){	
		for (String str : vararg)
			System.out.print(str + " ");
		System.out.println();
	}

	void method3(String[] vararg){	
		for (String str : vararg)
			System.out.print(str+ " ");
		System.out.println();
	}

}
