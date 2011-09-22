package chap6.Exam.Question11;

import java.io.*;

public class Talker {
	public static void main(String[] args) {
		Console c = System.console();
		String u = c.readLine("%s", "username: ");
		System.out.println("hello " + u);
		String pw;
		//Error here
		//if(c != null && (pw = c.readPassword("%s", "password: ")) != null)
			// 	check for valid password
	}
}