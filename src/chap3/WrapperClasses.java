package chap3;

public class WrapperClasses {

	public static void main(String[] args) {
		new WrapperClasses();
	}
	public WrapperClasses() {
		valueOf();
		xxxValue();
		toXxxString();
		autboxing();
		
	}
	
	
	void autboxing(){
		Integer i = 1;
		Float f = 1f;
		Double d = 1d;		
	
		Integer i1 = 100;
		Integer i2 = 100;
		
		if (i1 == i2)
			System.out.println(i1 +" == "+ i2);
		
		if (i1 != i2)
			System.out.println(i1 +" != "+ i2);
		
		if (i1.equals(i1))
			System.out.println(i1 +" equals "+ i2);
		
	}

	void toXxxString(){
		int i = 999;
		System.out.println( " i : "+ i +" to hex : "+ Integer.toHexString(i));
		System.out.println( " i : "+ i +" to Bin : "+ Integer.toBinaryString(i));
		
		String str = "454sss";
		try {
			Integer.parseInt(str);
		}catch (NumberFormatException e) {
			System.out.println(str + " not int !~");
		}
	}
	
	void xxxValue(){
		Integer i = new Integer(999999999);
		byte b = i.byteValue();
		System.out.println("from Int : "+ i +" to double "+ b);
		
		double d = i.doubleValue();
		System.out.println("from Int : "+ i +" to double "+ d);
	}
	
	void valueOf(){
		Integer i = new Integer(1);
		Integer ii = new Integer("2");
		
		Integer iii = Integer.valueOf("0101", 2);
		Integer iiii = Integer.valueOf("6", 7);	

		Float f = Float.valueOf("125f");		
		
		System.out.println( i + " "+  ii +" "+ iii +" "+ iiii +" "+ f );
		
	}

}

