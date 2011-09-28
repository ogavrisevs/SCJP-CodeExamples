package chap1.classess;

public class VeferenceVaribles {

	public static void main(String[] args) {
		new VeferenceVaribles(); 

	}
	
	public VeferenceVaribles() {
		method();
		method2();
	}
	
	/**
	 * Cast Reference Varibles to Reference Varibles
	 */
	void method(){
		Integer i = new Integer(Integer.MAX_VALUE);
		Short s = new Short(Short.MAX_VALUE);
		
		System.out.println("Int max "+ Integer.MAX_VALUE + " int min "+ Integer.MIN_VALUE);
		System.out.println("Short max "+ Short.MAX_VALUE + " Short min "+ Short.MIN_VALUE);		
		
		//this is not upcast ! , this is side-cats !!-> Illegal
		//Short ss = (Short) new Integer(Integer.MAX_VALUE);
		
		//Illegal
		//Integer ii = (Integer) new Short(Short.MAX_VALUE);
		
		// real up-cast
		Number ii =  new Short(Short.MAX_VALUE);
		System.out.println((Short)ii);
		
		
		Integer iii = Integer.valueOf(s);
		
		
	}
	
	/**
	 * Cast Primitive Varibles to Reference Varibles
	 */
	void method2(){
		short s = 111;
		Short ss = s;
		System.out.println("Cast short "+ s +" to Short "+ ss);

		int i = 2147483647;
		// incorecy cast from primitive int Reference Varible Short
		//Short ii =  i;
		Short sss = (short) i;
		System.out.println("Cast int "+ i +" to Short "+ sss);
		
		
	}

}
