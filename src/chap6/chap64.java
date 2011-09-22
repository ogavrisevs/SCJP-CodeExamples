package chap6;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class chap64 {
	public static void main(String[] argv){
		new chap64();
	}
	
	chap64(){
		chap641();

		chap642(Locale.getDefault());
		
		Locale locLv =new Locale("lv");
		chap642(locLv);
		
		Locale locBe =new Locale("be");
		chap642(locBe);
		
		Locale locRu =new Locale("ru");
		chap642(locRu);
		
		Locale locLa =new Locale("la");
		chap642(locLa);
		
	}
	
	

	public void chap641(){
		Date dt = new Date();  
		System.out.println(dt.toString());
		
		dt.setTime(1000000000000L);
		System.out.println(dt.toString());

		// add 1 sec.
		dt.setTime( dt.getTime() + 1000);
		System.out.println(dt.toString());
	}
	
	/**
	 * DateFormat, Calendar, Locale
	 * 
	 */
	public void chap642(Locale loc){


		System.out.println("Country : "+ loc.getCountry());
		System.out.println("DisplayName : "+ loc.getDisplayName());
		Calendar ca = Calendar.getInstance(loc);
		
		System.out.println(ca.getTime().toString());
		
		ca.add(Calendar.MONTH, 3);
		System.out.println("+3 Month : "+ ca.getTime().toString());		
		
		ca.add(Calendar.MONTH, -6);
		System.out.println("-6 Month : " +ca.getTime().toString());		
		
		ca.set(2011, 9, 20);
		System.out.println(" Set 2011.9.20 : "+ ca.getTime().toString());
		
		System.out.println(" Get DAY_OF_MONTH : "+	ca.get(Calendar.DAY_OF_MONTH) );
		
		System.out.println(" Get WEEK_OF_MONTH : "+	ca.get(Calendar.WEEK_OF_MONTH) );
		
		Date curDt = new Date();
			
		DateFormat dfF = DateFormat.getDateInstance(DateFormat.FULL, loc );
		System.out.println("DateFormat.FULL : "+ dfF.format(curDt));

		DateFormat dfM = DateFormat.getDateInstance(DateFormat.MEDIUM, loc );
		System.out.println("DateFormat.MEDIUM : "+ dfM.format(curDt ));
			
		DateFormat dfS = DateFormat.getDateInstance(DateFormat.SHORT, loc );
		System.out.println("DateFormat.SHORT : "+ dfS.format(curDt ));
			
		SimpleDateFormat sdf = new SimpleDateFormat("[MM-dd-yyyy E G]", loc); 
		System.out.println("[MM-dd-yyyy E G] : "+ sdf.format(curDt ));
		
		NumberFormat nf = NumberFormat.getInstance(loc);
		System.out.println("Instance : "+ nf.format(100000000));
		
		NumberFormat nfn = NumberFormat.getNumberInstance(loc);
		System.out.println("NumberInstance : "+ nfn.format(100000000));		
		
		NumberFormat nfc = NumberFormat.getCurrencyInstance(loc);
		System.out.println("CurrencyInstance : "+ nfc.format(100000000));
		
		System.out.println("--------------------------------------------");
	}
	
	
}
