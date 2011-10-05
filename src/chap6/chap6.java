package chap6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;


public class chap6 {

	public static void main(String argv[]){
		new chap6();
	}
	
	chap6(){
		this.chap61();
		this.chap621();
		this.chap622();
		this.chap623();
		this.chap624();
		this.chap625();
		this.chap626();	
		
	}
	
	public void chap61(){
		String str = "abc";
		System.out.println(str);
		System.out.println(str.hashCode());
		str += " cdf";
		System.out.println(str.hashCode());
		str = "aaa";
		System.out.println(str.hashCode());
		str = "aaa";
		System.out.println(str.hashCode());
		
	}
	
	public void chap621(){
		try{
			File f = new File("newFile");
			System.out.println("exists : "+  f.exists());			
			System.out.println("isFile : "+  f.isFile());
			System.out.println("isDirectory : "+  f.isDirectory());			
			f.createNewFile();
			System.out.println("exists : "+  f.exists());			
			System.out.println("isFile : "+  f.isFile());
			System.out.println("isDirectory : "+  f.isDirectory());			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * File
	 */
	public void chap622(){
		try{
			File fDir = new File("newDir");
			getFileInfo(fDir);
			fDir.mkdir();
			getFileInfo(fDir);
			
			File f1 = new File(fDir, "newFile1");
			File f2 = new File(fDir ,"newFile2");
			getFileInfo(f1);			
			getFileInfo(f2);
			f1.createNewFile();
			f2.createNewFile();
			getFileInfo(f1);			
			getFileInfo(f2);

			//Need full path 
			f1.renameTo(new File("newDir\\File1"));
			getFileInfo(f1);
			
			f2.delete();
			getFileInfo(f2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * FileWriter, FileReader
	 */
	public void chap623(){
		try {
			FileWriter fw = new FileWriter(new File("ff1"));
			fw.write("may\nnew\nstring!\n");
			fw.flush();
			fw.close();
			
			char[] cbuf = new char[100];
			FileReader fr = new FileReader("ff1");
			int readCount = fr.read(cbuf);
			System.out.println("Number of characters read : "+ readCount);
			for (char ch : cbuf)
				System.out.print(ch);
			fr.close();
			
			//read buffer too small
			char[] cbuf2 = new char[5];
			FileReader fr2 = new FileReader("ff1");
			int readCount2 = fr2.read(cbuf);
			System.out.println("Number of characters read : "+ readCount2);
			for (char ch : cbuf2)
				System.out.print(ch);
			fr2.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * BufferedWriter, BufferedReader
	 */
	public void chap624(){
		try {
			FileWriter w = new FileWriter("file");  
			BufferedWriter bw = new BufferedWriter(w);
			bw.write("this is may");
			bw.newLine();
			bw.write(" new line ");
			bw.flush();
			bw.close();
		
			FileReader fr = new FileReader("file");
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while ( (str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	/**
	 * PrintWriter
	 */
	public void chap625(){
		try {
			FileWriter fw = new FileWriter("filePW");  
			PrintWriter pw = new PrintWriter(fw);
			pw.print("some text here ");
			pw.println("and new line");
			pw.write(" simple\n writer\n");
			pw.printf(" arg1:%s arg2:s", "val1", "val2");
			pw.flush();
			pw.close();
		
			FileReader fr = new FileReader("filePW");
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while ( (str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Console
	 */
	public static void chap626(){
	
		Console c = System.console();
		if (c == null){
			System.out.println("No Console found !");
			return;
		}
		
		char[] pw;
		pw = c.readPassword("%s", "pw: "); 
		for (char ch : pw)
			c.format("%c ", ch); 
		c.format("\n");
		MyUtility mu = new MyUtility();
		while (true) {
			String name = c.readLine("%s", "input?: "); 
			c.format("output: %s \n", mu.doStuff(name));
		}
			
	}
	
	public void getFileInfo(File f){
		StringBuilder sb = new StringBuilder();
		sb.append(" FName: ");
		sb.append(f.getName());

		sb.append(" isFile: ");
		sb.append(f.isFile());
		
		sb.append(" isDirectory: ");
		sb.append(f.isDirectory());
		
		sb.append(" exists: ");
		sb.append(f.exists());
	
		System.out.println(sb);
	}
}

class MyUtility {
	String doStuff(String arg1) {
		return "result is " + arg1;
	}
}
