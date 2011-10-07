package chap6.Exam.Question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {

	public static void main(String [] argv){
		String args0 = "\\d*";
		String args1 = "ab34ef";
		Pattern p = Pattern.compile(args0);
		Matcher m = p.matcher(args1);
		boolean b = false;
		while(b = m.find()) 
			System.out.print(m.start()+ "_"+ m.group()+ "_");
		
	}

}

