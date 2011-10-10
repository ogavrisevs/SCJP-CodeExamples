package chap10.imports;

import java.util.Date;

public class Caller {
	public static void main (String ... arg){
		System.out.println("this is main() : chap10.imports.Caller" );
		new Test().method();
		System.out.println(new Date());
	}

	
}
