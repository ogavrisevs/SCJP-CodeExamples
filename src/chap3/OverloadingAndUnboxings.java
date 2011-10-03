package chap3;

public class OverloadingAndUnboxings {

	public static void main(String [] argv){
		Ovr ov = new Ovr();
		
		int i = 1;
		ov.method(i);
		
		Integer iI = 2;
		ov.method(iI);
		Double d = 1.2;
		ov.method(d);
		
		Ovr2 ov2 = new Ovr2();
		//int try -> float -> double -> Integer -> Object  
		ov2.method(i); // compiler will choose widening over boxing 
		ov2.method(iI); // 		
		
		// Integer try Integer - > Object 
		Ovr3 ov3 = new Ovr3();
		ov3.method(iI);
		
		// up-cast
		//from  Integer try Integer -> integer -> float  
		Ovr4 ov4 = new Ovr4();		
		ov4.method(i);
		
	}
	
}



class Ovr {
	void method(int i ){
		System.out.println("int : "+ i);
	}
	void method(short i ){
		System.out.println("short : "+ i);
	}
	void method(float i ){
		System.out.println("float : "+ i);
	}
	void method(char i ){
		System.out.println("char : "+ i);
	}
	void method(String i ){
		System.out.println("String : "+ i);
	}
	void method(Integer i ){
		System.out.println("Integer : "+ i);
	}
	void method(Float i ){
		System.out.println("Float : "+ i);
	}
	void method(int... i ){
		System.out.println("int... : "+ i.toString());
	}
	void method(Object obj ){ 
		System.out.println("Object : "+ obj.toString());
	}
}

class Ovr2 {
	
	void method(short i ){
		System.out.println("short : "+ i);
	}

	void method(float i ){
		System.out.println("float : "+ i);
	}
	void method(double i ){
		System.out.println("double : "+ i);
	}

	void method(Float i ){
		System.out.println("Float : "+ i);
	}
	
	void method(Integer i ){
		System.out.println("Integer : "+ i);
	}

	void method(Short i ){
		System.out.println("Short : "+ i.toString());
	}
	void method(Object obj ){ 
		System.out.println("Object : "+ obj.toString());
	}
}


class Ovr3 {
	void method(Short i ){
		System.out.println("Short : "+ i);
	}
	//void method(Integer i ){
	//	System.out.println("Integer : "+ i);
	//}
	
	void method(Float i ){
		System.out.println("Float : "+ i);
	}
	void method(Object obj ){ 
		System.out.println("Object : "+ obj.toString());
	}
}


class Ovr4 {
	void method(short i ){
		System.out.println("short : "+ i);
	}
	void method(float i ){
		System.out.println("float : "+ i);
	}
	
	void method(double i ){
		System.out.println("double : "+ i);
	}
	
	void method(Float i ){
		System.out.println("Float : "+ i);
	}
	void method(Object i ){
		System.out.println("Object : "+ i);
	}
	
}

