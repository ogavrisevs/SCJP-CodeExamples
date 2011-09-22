package chap6.Exam.Qusetion6;


import java.util.*;
import java.text.*;

class DateTwo {
	public static void main(String[] args) {
		Date d = new Date(1119280000000L);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,
				Locale.GERMANY);
		System.out.println(df.format(d));
	}
}
