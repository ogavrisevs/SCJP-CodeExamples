package chap3.arrays;

public class ArraysInHardCore {
	
	static int[] array3 = new int[]{1,2,3};
	final int[] array4 = new int[]{1,2,3};
	
	//reference is finall, not object !!!! 
	static final int[] array5 = new int[]{1,2,3};
	
	public static void main (String []argv){
		new ArraysInHardCore();

		System.out.println("static contetnt :"+ ArraysInHardCore.array3[0]);
		//change static field within static method
		array3[0]=9;
		array5[0]=9;
		//The final field array5 cannot be assigned
		//array5 = new int[]{4,5,6};
		
		//array3 = {4,5,6};
		
	}
	
	ArraysInHardCore(){
		declaring();
		multidimensionalArrays();
		anonymousArray();
		objectReferences();
	}
	
	void declaring(){

		String [] arr; // reference
		arr = new String[3]; // asssig. ref to obj
		
		//ArrayIndexOutOfBoundsException: 3
		//arr[3]= "aaa"; 

		String [] arr2 = null; 
		//Array constants can only be used in initializers
		//arr2 = {"ff"};
		arr2 = new String[]{"hg"};	

		String[] arr3 = {""};

		
		//legal 
		String [][]arr4[][];
	}
	
	void multidimensionalArrays(){
		String [][] mArray = new String[5][];
		
		mArray[0] = new String[2];
		mArray[0][0] = "00";
		mArray[0][1] = "01";		
		//mArray[0][2] = "02"; // ArrayIndexOutOfBoundsException: 
		
		mArray[1] = new String[]{"11", "12", "13", "14"};
		//mArray[1] = {"11", "12", "13", "14"};
		

		
		String[] subArr = {"a", "3"};
		mArray[2] = subArr;
		System.out.println("lenght"+ mArray.length +" , hash : "+ mArray.hashCode());
		
		subArr[0]= "b";
		System.out.println("lenght"+ mArray.length +" , hash : "+ mArray.hashCode());		

		//String[][] twoDimArr = new String[2][];
		//mArray[3] = twoDimArr; // Type mismatch: cannot convert from String[][] to String[]
		
		//mArray[-1] = "h";
	}
	
	
	void anonymousArray(){
		int[] array = {1,2,3};
		int[] array2 = new int[]{1,2,3};
	
	}
	void objectReferences(){ //legal but ClassCastException: A cannot be cast to BextA
		BextA[] objArray = {new BextA(), null, /*(BextA)new A(),*/ new CextB()};
	
		Object obj = objArray;
		// cannot be cast to !
		//BextA[][] feikArray = (BextA[][])obj;  
		
	}
	
}


class A{
	static String class1 = "A";
}
class BextA extends A{
	static String class2 = "BextA";	
}
class CextB extends BextA{
	static String class3 = "CextB";
}



