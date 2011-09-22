package chap6.Exam.Question14;

import java.util.regex.*;

public class Archie {
	
	public static void main(String[] args) {
		doMe("ab2c4d67", "\\d");
		doMe("ab2c4d67", "\\d?");
		doMe("ab2c4d67", "(\\d)?");		
		doMe("ab2c4d67", "\\d*");
		doMe("ab2c4d67", "\\d+");
		
	}
	
	public static void doMe(String source, String regex ){
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(source);
		int count = 0;
		while (m.find()){
			count++;
			System.out.println(">"+ m.group() +"<");
		}
		System.out.println("-----------------"+count);

	}
}