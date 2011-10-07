package chap8;

public class SimpleInnerClass {

	public static void main(String ... argv){
		
		// access inner class trougth varible   
		OutterClass oc = new OutterClass();		
		oc.ic.innerMethod();
		oc.outterMethod();
		
		// create inner class spereate 
		OutterClass.InnerClass ic = oc.new InnerClass();
		ic.innerMethod();

		OutterClass.InnerClass ic2 = oc.new InnerClass();
		ic2.innerMethod();
		
		// one outter varible for all inner claseesss
		oc.ic.innerMethodAccessOuterVarible();
		ic2.innerMethodAccessOuterVarible();
		
		// seperate varible for each inner classees 
		oc.ic.innerMethodAccessInnerVarible();
		ic2.innerMethodAccessInnerVarible();
	
		// will access first inner class 
		oc.outterMethodAccessInnerVaribles();
	}
	
}


class OutterClass{
	int outterVarible = 1;
	InnerClass ic  = new InnerClass();
	
	OutterClass(){
		System.out.println("OutterClass constructor");
	}
	
	class InnerClass{
		int innerVarible = 2;
		InnerClass me;
		
		InnerClass(){
			me = this;
			System.out.println("InnerClass constructor");
		}
		
		void innerMethod(){
			System.out.println("\nInner Method\n" +
					"  this is :"+ this +"\n"+
					"  outside is :"+  OutterClass.this );			
		}
		void innerMethodAccessOuterVarible(){
			System.out.println("InnerClass : Access Outer Varible : "+ OutterClass.this.outterVarible++ );
		}
		void innerMethodAccessInnerVarible(){
			System.out.println("InnerClass :Access Inner Varible : "+ innerVarible++ );
		}
		
	}

	void outterMethod(){
		System.out.println("Outter Method");
	}

	void outterMethodAccessInnerVaribles(){
		System.out.println("Outter Class : Access Inner varible : "+ this.ic.innerVarible);
		System.out.println("  Outter Class : "+ this);
		System.out.println("  Inner  Class : "+ this.ic.me);		
	}
	
}