package chap3;

public class PrimitiveLiterals {
	public static void main(String[] args) {
		new PrimitiveLiterals();
	}

	PrimitiveLiterals(){
		octalLiterals();
		hexadecimalLiterals();
		floatingPointLiterals();
		characterLiterals();
	}
	
	void octalLiterals(){
		// 0 ..7
		int a0 = 00; 
		int a7 = 07;		
		//int a3 = 09;	//The literal 09 of type int is out of range
		int a8 = 010;		
		int a9 = 011;
		System.out.println(a0 +" "+ a7 +" "+a8 +" "+a9 );
	}

	void hexadecimalLiterals(){
		// 0.. 9..A..F 
		int a0 = 0x0; 
		int a9 = 0x9;		
		int a10 = 0xA; 		
		int a15 = 0XF;
		int a16 = 0X10;		
		int a17 = 0X1f;		
		//int aD = 0Xdummy;//Syntax error on token "ummy", delete this token
		System.out.println(a0 +" "+ a9 +" "+a10 +" "+a15+ " "+a16+" "+a17 );		
	}
	
	void floatingPointLiterals(){
		double d = 123456789.123456789;
		//float fff = 123456789.123456789; //Type mismatch: cannot convert from double to float
		long l = 10L;
		long ll = 10l;		
		float f = 10F;
		float ff = 10f;
		double dD = 10D;
		double dDD = 10d;		
		System.out.println(d +" "+ l +" "+ f +" "+ dD );
	}
	
	void characterLiterals(){
		char c = 'a';
		char cF = ' ';
		char cD = '\u004E';
		char cE = '\uEEEE';
		char cX = 0X00FF;
		
		System.out.println(c +" "+ cF +" "+ cD +" "+ cE +" "+ cX );
		for (int i=0; i < 535; i++  ){
			System.out.print( (char)i + " ");
			if ((byte)(i) == 1)
				System.out.println();
				
		}
	}			
		
	void booleanLiterals(){
		//boolean b = 0; //Type mismatch: cannot convert from int to boolean
		//boolean b = "true";	//Type mismatch: cannot convert from String to boolean	
		boolean b = true;			
		//boolean bb = tRUe; //tRUe cannot be resolved to a variable
		//boolean bb = (boolean) 1; //Cannot cast from int to boolean
		boolean bb = Boolean.TRUE;
		
		
	}
		
		
		
	
	
}
