import java.io.File;


public class chap6 {

	public static void main(String argv[]){
		new chap6();
		
	}
	
	chap6(){
//		this.chap61();
		this.chap621();
	}
	
	public void chap61(){
		String str = "abc";
		System.out.println(str);
		System.out.println(str.hashCode());
		str += " cdf";
		System.out.println(str.hashCode());		
		
	}
	
	public void chap621(){
		try{
			File f = new File("newFile");
			System.out.println("isFile : "+  f.isFile());
			System.out.println("exists : "+  f.exists());
			System.out.println("isDirectory : "+  f.isDirectory());			
			f.createNewFile();
			System.out.println("isFile : "+  f.isFile());
			System.out.println("exists : "+  f.exists());
			System.out.println("isDirectory : "+  f.isDirectory());			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void chap622(){
		try{
			File f = new File("newFile");
			System.out.println("isFile : "+  f.isFile());
			System.out.println("exists : "+  f.exists());
			System.out.println("isDirectory : "+  f.isDirectory());			
			f.createNewFile();
			System.out.println("isFile : "+  f.isFile());
			System.out.println("exists : "+  f.exists());
			System.out.println("isDirectory : "+  f.isDirectory());			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
