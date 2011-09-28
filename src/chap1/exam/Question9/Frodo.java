package chap1.exam.Question9;

public class Frodo extends Hobbit {
	public static void main(String[] args) {
		Short myGold = 7;
		//System.out.println(countGold(myGold, 6));// invalid
		new Frodo().method();
		
		// is this legall ? 
		short s = new Short((short) 1); // legal 
		int ss = new Short((short) 1); // legal
		//byte sss = new Short((short) 1); // not -legal! 		
		
	}

	// corect 
	void method(){
		Short myGold = 7;
		System.out.println(countGold(myGold, 6));
	}
	
}

class Hobbit {
	int countGold(int x, int y) { return x + y; }
}