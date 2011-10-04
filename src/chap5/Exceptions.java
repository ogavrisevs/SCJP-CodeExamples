package chap5;

public class Exceptions {

	public static void main(String[] args) {
		new Exceptions();
		
	}
	public Exceptions() {
		new RunTimeExcept();
		//new RunTimeExceptMultiCatch();
		//new RunTimeExceptReThrow();
	}
	
}



class RunTimeExcept{
	public RunTimeExcept() {
		try {
			method0();
		}catch (Exception e) {
			System.out.println("IndexOutOfBoundsException: catch exception ");
			e.printStackTrace();
		}
	}
	void method0(){
		try {
			method();
		}finally{
			System.out.println(" some finall work here : method0 ");
		}
	}
	
	void method(){
		try {
			method1();
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException: catch exception ");

		}
	}
	void method1(){
		try{
			method2();
		}finally {
			System.out.println(" some finall work here : method1 ");
		}
	}
	
	void method2(){
		String[] arg = {"h"};
		arg[5] = "ff"; // throw exception 
		
	}
	
	
	
	
}


class RunTimeExceptMultiCatch{
	public RunTimeExceptMultiCatch() {
		try {
			String[] arg = {"h"};
			arg[5] = "ff"; // throw exception 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: catch exception ");			
		}catch (IndexOutOfBoundsException e) {			
			System.out.println("IndexOutOfBoundsException: catch exception ");
		}catch (Exception e) {
			System.out.println("Exception: catch exception ");
		}finally{
			System.out.println("finally ");			
		}
	}
}

class RunTimeExceptReThrow{
	public RunTimeExceptReThrow()  {
		try{
			method();
		}catch (Exception e) {}
	}
	
	void method() throws Exception{
		try {
			method0();
		}catch (Exception e){
			System.out.println("Exception: catch exception");
			throw e;			
		}
	}
	
	void method0(){
		try {
			method1();
		}catch (IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException: catch exception ");
			throw e;
		}
	}
	void method1(){
		try{
			method2();
		}catch (ArrayIndexOutOfBoundsException e){			
			System.out.println("ArrayIndexOutOfBoundsException: catch exception ");
			throw e;
		}
	}
	
	void method2(){
		String[] arg = {"h"};
		arg[5] = "ff"; // throw exception 
	}
}


