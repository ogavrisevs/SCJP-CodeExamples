package chap5;

public class CustomException {

	public static void main(String argv[]){
		new CustomException(); 
	}
	public CustomException() {
		new ThrowStack();		
		
	}
}



class MyException extends Exception{
	MyException(){
		System.out.println("crt : MyException");
	}
	
	MyException(String str){
		super(str);
		System.out.println("crt : MyException + msg");
	}
}


class ThrowStack{
	ThrowStack(){
		method0();
	}
	void method0(){
		try{
			method();
		}finally {
			System.out.println("finall catch on method0 ");
		}
	}

	void method(){
		try{
			method1();
		}catch(Throwable obj) {
			System.out.println("catch Throwable ");
		}
	}

	
	void method1() throws Throwable{
		try{ 
			method2();
		}catch (Throwable t){
			System.out.println("catch Throwable : re-throw");
			throw t;
		}
	}
	void method2() throws Exception{
		try{
			method3();
		}catch (Exception e) {
			System.out.println("catch Exception : re-throw ");
			throw e;
		}
	}
	void method3() throws MyException{
		try{
			method4();
		}catch (MyException e) {
			System.out.println("ups i did it again!  " +
					": catch MyException : re-throw");
			 System.out.println("mesage : "+ e.getMessage());
			throw e;
		}
	}
	void method4() throws MyException{
		try{
			method5();
		}finally {
			System.out.println("finall catch on method4 ");
		}
	}
	void method5() throws MyException {
		throw new MyException(" hmm something wrong here ");
	}
	
}