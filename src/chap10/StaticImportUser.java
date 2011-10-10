package chap10;

//class import import (method and instance )
import chap10.StaticImpPackge.StaticImports;

// static import (method and instance )
import static chap10.StaticImpPackge.StaticImports.staticVarible;
import static chap10.StaticImpPackge.StaticImports.staticMethod;

public class StaticImportUser {

	public static void main(String[] args) {
		new StaticImportUser();
	}

	public StaticImportUser() {
		// with no imports 
		//chap10.StaticImports.StaticImports.staticMethod();
		//System.out.println(chap10.StaticImports.StaticImports.staticVarible);
		
		//chap10.StaticImports.StaticImports si = new chap10.StaticImports.StaticImports();
		//System.out.println(si.instanceVarible);
		
		staticMethod();
		System.out.println(staticVarible);
		
	    StaticImports si = new StaticImports();
		System.out.println(si.instanceVarible);

		//  default class AnotherSimpleClass is not visible 
		//new chap10.StaticImpPackge.AnotherSimpleClass();
	}

}
