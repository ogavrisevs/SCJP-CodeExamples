package chap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class chap72 {

	public static void main(String[] args) {
		new chap72();
	}

	public chap72() {
		chap721();
		chap722();		
		chap723();
		chap724();
		chap725();
		chap726();
	}
	
	/**
	 * Array binarySearch
	 */
	public void chap726(){
		
		String[] list = {"ccc", "aaa","ggg","bbb","111"};
		
		for (String str : list )
			System.out.print( str +" ");
		System.out.println();
		
		//If you attempt to search an array or collection that has not already been
		// sorted, the results of the search will not be predictable !!!!!!
		int poz = Arrays.binarySearch(list, "ggg");
		System.out.println("poz : " + poz + " : "+ list[poz] );
		
		// simple lex sort and search
		Arrays.sort(list);
		for (String str : list )
			System.out.print( str +" ");
		System.out.println();
		poz = Arrays.binarySearch(list, "ggg");
		System.out.println("poz : " + poz + " : "+ list[poz] );

		// sort desc and search 
		CompareDesc cd = new CompareDesc();
		Arrays.sort(list, cd);
		for (String str : list )
			System.out.print( str +" ");
		System.out.println();
		poz = Arrays.binarySearch(list, "ggg", cd);
		System.out.println("poz : " + poz + " : "+ list[poz] );
		
		
	}
	
	/**
	 * List To array and back  , List.toArray, Arrays.asList
	 */
	public void chap725(){
		//List
		List<String> list = new ArrayList<String>();
		list.add("bbb");
		list.add("ccc2");
		list.add("ddd");		
		
		// To array 
		System.out.println(list);
		Object[] arrayList = list.toArray();

		for (Object obj : arrayList)
			System.out.print( " "+ obj );
		System.out.println();
		
		//To List
		List mylist= Arrays.asList(arrayList);
		System.out.println(mylist);
	}
	
	/**
	 * Sort Array  
	 */
	public void chap724(){
		String[] myList = {"zzz", "ccc", "bbb", "111", "111" };
		
		for (String str : myList)
			System.out.print( " "+ str);
		System.out.println( " ");
		
		Arrays.sort(myList);
		
		for (String str : myList)
			System.out.print( " "+ str);
		System.out.println( " ");		
		
		CompareDesc cd =  new  CompareDesc();		
		Arrays.sort(myList, cd);
		
		for (String str : myList)
			System.out.print( " "+ str);
		System.out.println( " ");		

	}
	
	/**
	 * List Object , SortBy  Comparator 
	 */
	public void chap723(){
		List<BigHumanis> piiplli = new ArrayList<BigHumanis>();
		piiplli.add(new BigHumanis("vasa",  "vasok",  21));
		piiplli.add(new BigHumanis("sanna", "asnnok", 22));
		piiplli.add(new BigHumanis("gera",  "gerok",  19));		
		
		// sort by age 
		System.out.println(" before sort " + piiplli);
		Collections.sort(piiplli);
		System.out.println(" after  sort " + piiplli);
		
		// sort by name 
		CompareByName cbn = new CompareByName();
		Collections.sort(piiplli, cbn);
		System.out.println("SortByName : " + piiplli);

		// sort by nick
		CompareByNik cbnc = new CompareByNik();
		Collections.sort(piiplli, cbnc);
		System.out.println("SortByNick : " + piiplli);
		
		
	}
	    
	/**
	 * Simple object sort  
	 */
	public void chap722(){
		List<Humanis> piiplli = new ArrayList<Humanis>();
		piiplli.add(new Humanis("vasa",  "vasok",  21));
		piiplli.add(new Humanis("sanna", "asnnok", 22));
		piiplli.add(new Humanis("gera",  "gerok",  19));		
		System.out.println(" before sort " + piiplli);

		//not working nead Comparable implament
		//Collections.sort(piiplli);
		System.out.println(" after  sort " + piiplli);
	}
	
	
	/**
	 * List<String>, Sort 
	 */
	private void chap721() {
		List<String> list = new ArrayList<String>();
		list.add("bbb");
		list.add("ccc2");
		list.add("ddd");		
		list.add("aaa");
		list.add("ccc1");
		
		System.out.println("unsort "+ list);
		Collections.sort(list);
		System.out.println("sort   "+ list);
		
	}

}


class Humanis {
	private String name;
	private String nick;
	private Integer age;
	
	public Humanis(String name, String nick, Integer age) {
		this.name = name;
		this.nick = nick;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Humanis [name=");
		builder.append(name);
		builder.append(", nick=");
		builder.append(nick);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}

class BigHumanis extends Humanis implements Comparable<Humanis>{
	
	public BigHumanis(String name, String nick, Integer age) {
		super(name, nick, age);
	}

	@Override
	public int compareTo(Humanis o) {
		if (this.getAge() < o.getAge())
			return -1;
		else if (this.getAge() > o.getAge())
			return 1;
		else if (this.getAge() == o.getAge())
			return 0;
		return 0;
	}
}

class CompareByName implements Comparator<Humanis>{
	public int compare(Humanis obj1, Humanis obj2){
		return obj1.getName().compareTo(obj2.getName());
	}
}

class CompareByNik implements Comparator<Humanis>{
	public int compare(Humanis obj1, Humanis obj2){
		return obj1.getNick().compareTo(obj2.getNick());
	}
}

class CompareDesc implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return (o1.compareTo(o2) * (-1));
	}
}
