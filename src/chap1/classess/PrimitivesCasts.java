package chap1.classess;

public class PrimitivesCasts {

	public static void main(String[] args) {
		new PrimitivesCasts();
	}

	private boolean bbbb;
	
	public PrimitivesCasts() {
		//method();
		casts();
	}
	
	
	void casts(){
		
		byte b = -128;
		byte b1 = 127;
		
		short s = -32768;
		short s2 = 32767;
	
		int i = 9999999;
		int i2 = 9999999;		
		
		//up cats
		byte bb = (byte)s;
		System.out.println("cast from short = "+ s +" to byte results = "+ bb);
		
		// downcats
		short ss = (short) b;
		System.out.println("cast from byte = "+ b +" to short results = "+ ss);
		
		int iii =11;
		boolean bbb = iii < 22; 
		System.out.println( "boolean bbb = 11 < 22 = "+ bbb);
		
		if ( bbbb = false)
			System.out.println("if (bbb= false) = true");
		else 
			System.out.println("if (bbb= false) = false");
		
		double d = 1.1;
		int ii = (int) d;
		System.out.println("cast double : "+ d +" to int : "+ ii);
		
		float f = (float) d;
		System.out.println("cast double : "+ d +" to float : "+ f);		
		
		char c = 32767;
		short sss = (short) c; 
		System.out.println("cast char : "+ c +" to short : "+ sss);
		
		
	}
	

	void method(){
		//char, boolean, byte, 	short, int, long, double, or float
		long memStart = getMemory();
		for (int i = 0; i < 1000000000; i++) {
			byte b = (byte)i;
		}
		long memEnd = getMemory();		
		//nead biger varibles 
		System.out.println("mem used : "+ (memEnd - memStart));
	}
	
    private static long getMemory()  {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }	
}
