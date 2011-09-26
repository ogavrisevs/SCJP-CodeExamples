package chap1.classess;




public class PublicSubClass extends DefualtClass2{
	public PublicSubClass(){
		super();
		System.out.println("public constructor for PublicSubClass");
	}

	PublicSubClass(boolean boo){
		System.out.println("defualt constructor for PublicSubClass");
	}
}


class DefualtClass2{
	private DefualtClass2(boolean boo){
		System.out.println("private constructor for DefualtClass2");
	}
	
	DefualtClass2(){
		System.out.println("defualt constructor for DefualtClass2");
	}
	
	
}

