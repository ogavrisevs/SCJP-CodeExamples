package chap7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Humanis implements Comparable<Humanis>{
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


	@Override
	public int compareTo(Humanis o) {
		if (this.age < o.getAge())
			return -1;
		else if (this.age > o.getAge())
			return 1;
		else if (this.age == o.getAge())
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


public class chap72 {

	public static void main(String[] args) {
		new chap72();
	}

	public chap72() {
		//chap721();
		//chap722();		
		
	}
	
	/**
	 * List Object , SortBy  Comparator 
	 */
	public void chap722(){
		ArrayList<Humanis> piiplli = new ArrayList<Humanis>();
		piiplli.add(new Humanis("vasa",  "vasok",  21));
		piiplli.add(new Humanis("sanna", "asnnok", 22));
		piiplli.add(new Humanis("gera",  "gerok",  19));		
		
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
