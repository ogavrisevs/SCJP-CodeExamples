package chap6;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class chap65 {

	public static void main (String[] argv){
		new chap65();
	}

	chap65() {
		chap651();
		chap652();
		chap653();
		chap654();
		chap655();		
	}
	
	
	/**
	 * printf, %[arg_index$][flags][width][.precision]conversion char
	 */
	public void chap655(){

		System.out.format("_ %2$d  %1$d_ \n",  11, 22);

		System.out.format(">%3$+d< \t >%2$d< \t >%1$+d< \n",  11, 22, -13);		

		// right justify
		System.out.format(">%10d< \n", -13);
		
		// left and right justify with zeros 
		System.out.format(">%-10d< \t >%010d< \t \n", 22, -13);		
		
		System.out.format(">%-10s< \t >%10s< \t \n", "aa", "bb");		
		
		System.out.format(">%010d< \t \n", 123456789);
		
		System.out.format(">%5.5f< \t \n", 123456789.123456789);		
		
	}
		
	
	/**
	 * Cadillac of tokenizing
	 */
	private void chap654() {
		Scanner scan = new Scanner(" 1 gfg 23 dfgd true f \n gdfg 444 \n true 5fg ");
		while (scan.hasNext()){
			
			if (scan.hasNextInt())
				System.out.println("int : "+ scan.nextInt());
			else if (scan.hasNextBoolean())
				System.out.println("bool : "+ scan.nextBoolean());
			//else if (scan.hasNextLine())
			//	System.out.println("line : "+ scan.nextLine());
			else 
				System.out.println("str : "+ scan.next());
			
		}
	}

	/**
	 * Splitter 
	 */
	public void chap653(){
		String source = "sdf :- sdf s:-df sd:-f";
		String[] array = source.split("[:][-]");
		for (String string : array) 
			System.out.println(string);
	}
		
	/**
	 * Scanner 
	 */
	public void chap652(){
		Pattern pattern = Pattern.compile("[ak]");
		Scanner scan = new Scanner("sdf skdfdsaf");
		String token; 
		while ( (token = scan.findInLine(pattern)) != null)
			System.out.println(token);
		
	}
	
	/**
	 * Pattern, Matcher
	 */
	public void chap651(){
		String source = "ab2cd dfa54dfwse w733f 8f wea5af0w ";
		pureRegEx("ab" , source);
		pureRegEx("[a-z]" , source);
		pureRegEx("[a-b]" , source);
		pureRegEx("([a-b])" , source);
		
		//^ except 
		pureRegEx("([^a-d])" , source);		

		pureRegEx("([abc])" , source);		
		pureRegEx("(\\d)" , source);
		pureRegEx("(\\d\\d)" , source);
		
		// once or not at all
		pureRegEx("([a][5])?" , source);
		
		// zero or more times
		pureRegEx("([a][5])*" , source);
		
		//one or more times 
		pureRegEx("([a][5])+" , source);		

		// real life 
		String cenas = "1 701 Ls , 1702.0 Ls , 1703Ls, 1704.00 ";
		pureRegEx("(\\d)+([ ])?(\\d)+([.])?(\\d)+([ ])?([^Ls])?" , cenas);		

	}

	public void pureRegEx(String regex, String source){
		System.out.println("--------------------------------\n" +
				"regex  : "+ regex +"\n"+
				"source : "+ source);
		
		Pattern pat = Pattern.compile(regex);
		Matcher mach = pat.matcher(source);
		while ( mach.find() ){
			System.out.println( mach.start() +" : "+ mach.end() + " = "+ mach.group() ); 
		}
		
		
		
	}
		
		
	
}
