package chap6.Exam.Question10;

import java.io.*;

public class ReadingFor {
	public static void main(String[] args) {
		String s;
		try {
			FileReader fr = new FileReader("myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			while((s = br.readLine()) != null)
				System.out.println(s);
			// br.flush();
		} catch (IOException e) {
			System.out.println("io error");
		}
	}
}