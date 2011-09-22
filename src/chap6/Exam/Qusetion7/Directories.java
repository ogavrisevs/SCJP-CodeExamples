package chap6.Exam.Qusetion7;

import java.io.*;

class Directories {
	static String[] dirs = { "dir1", "dir2" };
	static String argsT[] = {"file2.txt"};
	
	public static void main(String[] args) {
		for (String d : dirs) {
			String path = d;
			File file = new File(path, argsT[0]);
			System.out.print(file.exists() + " ");
			System.out.print(file.isFile() + " ");
		}
	}
}