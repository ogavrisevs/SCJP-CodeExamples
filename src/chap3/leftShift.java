package chap3;

public class leftShift {

	public static void main(String[] args) {

		System.out.println("(9 << 0) "+ (9 << 0));		
		System.out.println("(9 << 1) "+ (9 << 1));
		System.out.println("(9 << 2) "+ (9 << 2));
		System.out.println("(9 << 3) "+ (9 << 3));
		
		System.out.println("(72 >> 0) "+ (72 >> 0));		
		System.out.println("(72 >> 1) "+ (72 >> 1));
		System.out.println("(72 >> 2) "+ (72 >> 2));
		System.out.println("(72 >> 3) "+ (72 >> 3));

		int i =9;
		System.out.println("("+ i +" <<= 0) "+ (i <<= 0));		
		System.out.println("("+ i +" <<= 1) "+ (i <<= 1));
		System.out.println("("+ i +" <<= 2) "+ (i <<= 2));
		System.out.println("("+ i +" <<= 3) "+ (i <<= 3));
		
	}

}
