package chap1.classess;

public class PrimitivesCasts {

	public static void main(String[] args) {
		new PrimitivesCasts();
	}
	
	public PrimitivesCasts() {
		method();
		casts();
	}
	
	
	void casts(){
		
		byte b = -128;
		byte b1 = 127;
		
		short s = -32768;
		short s2 = 32767;
	
		
		byte bb = (byte)s;
		System.out.println("cast from short = "+ s +" to byte results = "+ bb);
		
		short ss = (short) b;
		System.out.println("cast from byte = "+ b +" to short results = "+ ss);
		
		
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
