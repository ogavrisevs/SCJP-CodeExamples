package chap1.classess;

public class FinallInstance {
	//Instance Variables
	final int sk3;
	
	public static void main(String[] args) {
		new FinallInstance().print();
		new FinallInstance(true).print();
	}
	
	FinallInstance(){
		this.sk3 =3;
		//method();
		method2();
	}
	
	private void method2() {
		
		int size = 10;  
		int[] intArray = new int [size];
		Integer [] intArrayI = new Integer [size];		
		for (int i = 0; i < size; i++) {
			final int sk = i;
			intArray[i] = sk;
			
			final Integer skI = i;
			intArrayI[i] = skI;
			System.out.println( skI +" , "+ skI.hashCode());
		}
		
		for (int i : intArray)
			System.out.println( i +" , "+ i);
		
		for (Integer ii : intArrayI)
			System.out.println( ii +" , "+ ii.hashCode());
		
		
	}
	
	
	private void method() {
		// local varible 
		final int sk = 1;  
	
		//sk = 2; // inlegall
		final int sk2;
		sk2=3; 
		//sk2=4; // inlegall
		
		// local varible 
		final int sk3;
		sk3 = 4;
		
	}

	FinallInstance(boolean boo){
		sk3 = 5;
	}
	
	void print(){
		System.out.println("sk : "+ sk3);
	}
	

}
