package chap7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


public class chap73 {

	public static void main (String [] argv){
		new chap73();
	}
	
	public chap73(){
		chap730();
		chap731();
		chap732();
		chap733();
		chap734();
		chap735();
	
	}
	
	/**
	 * Map , complex obj 
	 */
	public void chap735(){
		Map<Object, Object> myMap = new HashMap<Object, Object>();

		Object[][] objDim = {{ new SimpleA("aka"), new SimpleA("aka") , new SimpleA("aka"), "aka"   , new Integer(1)  },
							 { new SimpleA("kak"), new SimpleA("aka") , new SimpleA("222"), "dati"  , "dt"            } };
		
		for (int sk = 0; sk < objDim[0].length; sk ++){
			Object obj = myMap.put(objDim[0][sk], objDim[1][sk]);
			if (obj == null)
				System.out.println(" add  val: "+ objDim[0][sk] +" val: "+  objDim[1][sk] );
			else 
				System.out.println(" repl "+ obj.toString());				
			
		}
		
		 //print all
		 for (Object obj : myMap.keySet())
			 System.out.println("key : "+ ((obj != null)? obj.toString() : "null") + " , val : "+ myMap.get(obj));
		 System.out.println();
		
		 //try retrieve 
		 Object obj = myMap.get(objDim[0][0]);
		 System.out.println("try get key :"+ objDim[0][0]);
		 if (obj == null) System.out.println(" not found !");
		 else System.out.println(" got"+ obj.toString());				

		 obj = myMap.get("aka");
		 System.out.println("try get key :"+ "aka");		 
		 if (obj == null) System.out.println(" not found !");
		 else System.out.println(" got "+ obj.toString());
			
		 
		 obj = myMap.get(1);
		 System.out.println("try get key :"+ 1);		 
		 if (obj == null) System.out.println(" not found !");
		 else System.out.println(" got "+ obj.toString());				
		 
			
	}

	
	/**
	 * Maps, HasMaps, Simple obj.
	 */
	public void chap734(){
		Map<Object, Object> myMap = new HashMap<Object, Object>();
		Object[][] objDim = {{"key1", "key2", new Integer(1), null   , "key1" },
							 {"val1", "val2", "111"         , "null" , "val1" } };
		
		for (int sk = 0; sk < objDim[0].length; sk ++){
			Object obj = myMap.put(objDim[0][sk], objDim[1][sk]);
			if (obj == null)
				System.out.println(" add  val: "+ objDim[0][sk] +" val: "+  objDim[1][sk] );
			else 
				System.out.println(" repl "+ obj.toString());				
		}
		 
		 for (Object obj : myMap.keySet())
			 System.out.println("key : "+ ((obj != null)? obj.toString() : "null") + " , val : "+ myMap.get(obj));
		 System.out.println();
		
	}
	
	
	/**
	 * Set's HashMap add simple types  
	 */	
	public void chap732(){

		Set mySet = new HashSet();
		Object[]list = {"aa", new String("aa") , (int)1 , new Integer(1)};
		
		for(Object obj : list) {
			if (mySet.add(obj))
				System.out.println("add suc.: "+ obj.toString());
			else 
				System.out.println("add fail: "+ obj.toString());
		}
		
		for (Object obj : mySet)
			System.out.print(obj.toString()+ " ");
		System.out.println();
		
		
	}

	
	/**
	 * Set's HashMap add obj 
	 */
	public void chap733(){

		Set mySet = new HashSet();
		String[]list = {"aa", "bb", "bb", null};
		
		for(String str : list) {
			SimpleC a1 = new SimpleC(str);
			if (mySet.add(a1))
				System.out.println("add suc.: "+ a1);
			else 
				System.out.println("add fail: "+ a1);
		}
		
		//for (Object obj : mySet)
		//	System.out.print(obj.getStr()+ " ");
		//System.out.println();
		
		
	}
	
	
	
	/**
	 * iterator over List 
	 */
	public void chap731(){
		List<SimpleC> myList = new ArrayList<SimpleC>();
		myList.add(new SimpleC("one"));
		myList.add(new SimpleC("dos"));		
		myList.add(new SimpleC("tres"));
		
		for (SimpleC aa : myList)
			System.out.print(aa.getStr() + " ");
		System.out.println();
		
		Iterator<SimpleC> iter = myList.iterator(); 
		while (iter.hasNext())
			System.out.print(iter.next());
	}
	
	/**
	 * All kind Collections, kill me please!
	 */
	public void chap730(){
		
		// Sets 
		Set<Object> a1  = new HashSet<Object>();
		Set<Object> a2 = new LinkedHashSet<Object>();		
		SortedSet<Object> a3 = new TreeSet<Object>();		
		NavigableSet<Object> a4 = new TreeSet<Object>();		
		Set<Object> a41 = new TreeSet<Object>();		
		
		//Lists 
		List a5 = new ArrayList<Object>();
		List a6 = new LinkedList<Object>();		
		List a7 = new Vector<Object>();		
		
		//Queue
		Queue a8 = new LinkedList<Object>();
		Queue a9 = new PriorityQueue<Object>();		
		
		//Map's
		Map a10 = new HashMap<Object, Object>();
		Map a11 = new Hashtable();
		Map a12 = new HashMap<Object, Object>();
		Map a13 = new LinkedHashMap<Object, Object>();		
		Map a14 = new TreeMap<Object, Object>();
		SortedMap a15 = new TreeMap<Object, Object>();
		NavigableMap a16 = new TreeMap<Object, Object>();
		
		Collection[] list = {a1, a2, a3, a4, a41, a5, a6, a7, a8, a9};
		Map[] listM =  {a10, a11, a12, a13, a14, a15};
		
		System.out.println(list.toString());
		System.out.println(listM.toString()); 
		
		
	}
	
}

class SimpleA {
	private String str;
	public SimpleA(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleA [str=");
		builder.append(str);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object o){
		if (   (o instanceof SimpleA) 
			&& ( this.getStr().equals(((SimpleA) o).getStr())))
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode(){
		return this.str.hashCode();
	}

}

class SimpleC{
	private String str ;
	
	public SimpleC(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleC [str=");
		builder.append(str);
		builder.append("] ");
		return builder.toString();
	}
}
