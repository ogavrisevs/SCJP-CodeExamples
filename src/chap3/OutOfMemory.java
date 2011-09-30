package chap3;

import java.util.Random;

public class OutOfMemory {

	public static void main(String [] argv){
		new OutOfMemory();
	}
	
	/**
	 * Don't try this at home !
	 */
	OutOfMemory(){
		
		//method1();
		method2();
		
		Random randomGenerator = new Random();
		int i = 9999;
		bigObj[] objArray = new bigObj[i];
		for (int z = 0; z < i; z++){		
			objArray[z] = new bigObj();
			objArray[randomGenerator.nextInt(i)] = null;
			System.gc(); 
		}
		
		
	}
	
	/**
	 * OutOfMemoryError: Java heap space
	 */
	void method2(){
		Random randomGenerator = new Random();
		int i = 9999;
		
		bigObj[] objArray = new bigObj[i];
		for (; true;){		
			objArray[randomGenerator.nextInt(i)] = new bigObj();
			objArray[randomGenerator.nextInt(i)] = null;
			System.gc(); 
		}
		
	}
	
	void method1(){
		Random randomGenerator = new Random();
		int i = 9999;
		bigObj[] objArray = new bigObj[i];
		for (int z = 0; z < i; z++){		
			objArray[z] = new bigObj();
			objArray[randomGenerator.nextInt(i)] = null;
			System.gc(); 
		}
		
	}
	
	
}



class bigObj{
	int i = 9999;
	Double[] dArray = new Double[i]; 
	
	bigObj(){
		for (int z = 0; z < i; z++)
			dArray[z] = new Double(z);		
	}
}