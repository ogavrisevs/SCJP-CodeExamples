package chap7;

public class chap71 {

	public static void main(String [] argv) {
		new chap71();
	}
	
	chap71(){
		equalSimpleObjTest();
		equalObjTest();
		equalObjTest2();
	}

	
	private void equalObjTest() {
		class ClassB{ Integer sk;}
		ClassB c1 = new ClassB();
		ClassB c2 = new ClassB();
		if (c1.equals(c2))
			System.out.println("c1 == c2");
		else 
			System.out.println("c1 != c2");
		
		ClassB c11 = new ClassB();
		ClassB c22 = c11;
		c22 = new ClassB();
		if (c11.equals(c22))
			System.out.println("c11 == c22");
		else 
			System.out.println("c11 != c22");
	}

	private void equalObjTest2() {

		class ClassC{
			private Integer sk;			
			public ClassC(Integer sk) {
				this.sk = sk;
			}
			public ClassC() {
			}

			@Override
			public boolean equals(Object obj){
				if ((obj instanceof ClassC) && (((ClassC)obj).getSk()).equals(this.sk)) 
					return true;
				else 
					return false;
			}
			public Integer getSk() {
				return sk;
			}
		}

		ClassC b1 = new ClassC(1);
		ClassC b2 = new ClassC(2);
		if (b1.equals(b2))
			System.out.println("b1 == b2");
		else 
			System.out.println("b1 != b2");
		
		// exceptio here java.lang.NullPointerException
		//ClassC b11 = new ClassC();
		//ClassC b22 = new ClassC();
		//if (b11.equals(b22))
		//	System.out.println("b11 == b22");
		//else 
		//	System.out.println("b11 != b22");

		ClassC b111 = new ClassC(1);
		ClassC b222 = new ClassC(1);
		if (b111.equals(b222))
			System.out.println("b111 == b222");
		else 
			System.out.println("b111 != b222");
		
		//---- The equals() Contract --------------
		//reflexive
		if (b111.equals(b111))
			System.out.println("b111 == b111");
		else 
			System.out.println("b111 != b111");
		
		//symmetric
		if (b111.equals(b222))
			System.out.println("b111 == b222");

		if (b222.equals(b111))
			System.out.println("b222 == b111");
		
		//transitive
		ClassC b333 = new ClassC(1);

		if (b111.equals(b222))
			System.out.println("b111 == b222");

		if (b222.equals(b333))
			System.out.println("b222 == b333");

		if (b111.equals(b333))
			System.out.println("b111 == b333");
		
		//consistent
		if (b111.equals(b222)){
			System.out.println("1: b111 == b222");
			if (b111.equals(b222))
				System.out.println("2: b111 == b222");

		}
		
		
	}
	
	
	public void equalSimpleObjTest(){
		String s1 = "aaa";
		String s2 = "bbb";
		if (s1.equals(s2))
			System.out.println("s1 equals s2"); 
		if (s1 == s2)
			System.out.println("s1 == s2"); 
		System.out.println("s1.hashCode : "+ s1.hashCode());
		System.out.println("s2.hashCode : "+ s2.hashCode());
		
		//One object (String) in pull, references equ
		String s11 = "aaa";
		String s22 = "aaa";
		if (s11.equals(s22))
			System.out.println("s11 equals s22"); 
		if (s11 == s22)
			System.out.println("s11 == s22");
		System.out.println("s11.hashCode : "+ s11.hashCode());
		System.out.println("s22.hashCode : "+ s22.hashCode());
	
		Integer s111 = 1;
		Integer s222 = 1;
		if (s111.equals(s222))
			System.out.println("s111 equals s222"); 
		if (s111 == s222)
			System.out.println("s111 == s222");
		System.out.println("s111.hashCode : "+ s111.hashCode());
		System.out.println("s222.hashCode : "+ s222.hashCode());

		Integer s1111 = new Integer(1);
		Integer s2222 = s1111;
		s1111 = 2;
		if (s1111.equals(s2222))
			System.out.println("s1111 equals s2222"); 
		if (s1111 == s2222)
			System.out.println("s1111 == s2222");
		System.out.println("s1111.hashCode : "+ s1111.hashCode());
		System.out.println("s2222.hashCode : "+ s2222.hashCode());
		
			
	}

	
}
