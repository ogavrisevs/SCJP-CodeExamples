package chap6.Exam.Question15;

import java.util.*;

public class Looking {
	public static void main(String[] args) {
		String input = "1 2 a 3 45 6";
		Scanner sc = new Scanner(input);
		int x = 0;
		do {
			x = sc.nextInt();
			System.out.print(x + " ");
		} while (x != 0);
	}
}