package sybex.AssessmentTest.Question9;

public class Test {

	
	public static void main(String argv[]){
		new Test();
		
	}
	
	Test() {
		Boolean m = true;
		int n = 14;
		do {
			n = n >> 1;
			if (n < 4) {
				m = new Boolean(false);
			}
		} while (m);
		System.out.println(n);

	}
	
}


