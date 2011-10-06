package chap1.arrays;

public class SimpleArrays {

	public static void main(String[] argv){

		String array01[] = {"A1", "A2"};
		String[] array02 = {"A1", "A2"};		
		
		String[] array[] = {{"A1"}, {"B1"}}; 
		for (int z=0; z < array.length;z++ )
			for (int i=0; i < array[0].length;i++ )
				System.out.println(array[z][i]);

		String[][] array2 = {{"A1", "A2"}, {"B1", "B2"}};		
		for (int z=0; z < array2.length;z++ )
			for (int i=0; i < array2[0].length;i++ )
				System.out.println(array2[z][i]);
		
		
		String array3[][] = {{"A1", "A2", "A3"}, {"B1", "B2", "B3"}};
		for (int z=0; z < array3.length;z++ )
			for (int i=0; i < array3[0].length;i++ )
				System.out.println(array3[z][i]);

		// 4D!
		String array4[][][][] = {{{{"A1"}, {"B1"}},{{"A2"}, {"B2"}}}, {{{"A3"}, {"B3"}},{{"A4"}, {"B4"}}}} ;
		for (int z=0; z < array4.length; z++ )
			for (int i=0; i < array4[0].length; i++ )
				for (int x=0; x < array4[0][0].length; x++ )
					for (int t=0; t < array4[0][0][0].length; t++ )					
						System.out.println(array4[z][i][x][t]);
		
		int z=0;
		for ( ; z < 10; )		
			System.out.println("works! "+ z++);

	
		for ( ; true; ){
			System.out.println("infinitive loop");
			break;
		}
		
		{{{System.out.println("any count brakets");}}}
		
		//Object obj = {{"A1"}, {"B1"}};
		
		// what a F*** is that ?!! 
		int [][] a3aa = {{1,2 , }, {3,4}};
		String [][] aada = {{"1", "2" , }, {"3", "4"}};

		
		// infinitive loop 
		//for (System.out.println("any operator here2") ; true; System.out.println("any operator here"));
		
		int arr40 [];
		//System.out.println( "int arr40 [] = {} :" + arr40.length); //The local variable arr40 may not have been initialized
		
		int arr41 [] = {};
		System.out.println( "int arr41 [] = {} :" + arr41.length);
		//arr41[0] = 1; //java.lang.ArrayIndexOutOfBoundsException
		
		int arr42 [] = new int[0];
		System.out.println( "int arr42 [] = new int[0] :" + arr42.length);		
		int arr43 [] = new int[]{1};	
		System.out.println( "int arr43 [] = new int[]{1} :" + arr43.length);		
				
		
	}
}
