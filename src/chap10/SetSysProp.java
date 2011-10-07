package chap10;

public class SetSysProp {
	public static void main(String[] args) {
		 java.util.Properties p = System.getProperties();
		 for(Object key : p.keySet())
			 System.out.println(key.toString() +":"+ p.getProperty(key.toString()) );
	}

}
