package chap2;

public class chaper21 {


	public static void main(String[] args) {
		new chaper21();

	}
	
	public chaper21() {
		//chaper211();
		chaper212();
	}

	public void chaper211(){
		class ClasA {
			public ClasA(){
				System.out.println("ClasA");
			}
		}
		class ClasB extends ClasA{
			public ClasB(){
				System.out.println("ClasB");
			}
		}
	
		class ClasC extends ClasB{
			public ClasC(){
				System.out.println("ClasC");
			}
		}
		
		class ClasD extends ClasA{
			public ClasD(){
				System.out.println("ClasD");
			}
			ClasD( String str){
				System.out.println("ClasD" + str);
			}
	
		}
	
		
		ClasA ca  = new ClasA();
		ClasB cb  = new ClasB();
		ClasC cc  = new ClasC();		
		ClasD cd  = new ClasD(" me");		
	}
	
	public void chaper212(){
		class ClasA {
			private int sk = 0;
			public ClasA(){
				System.out.println("ClasA const()");
			}
			public ClasA(int sk){
				System.out.println("ClasA const(int)" +" "+ sk);
				this.sk = sk;
			}
			public void doMe(){
				System.out.println( "ClasA doMe() "+  sk);
			}

		}
		
		class ClasB extends ClasA{
			private int sk = 1;
			public ClasB(){
				System.out.println("ClasB const()");
			}
			public ClasB(int sk){
				System.out.println("ClasB const(int)" +" "+ sk);
				this.sk = sk;
			}
			public void doMe(){
				System.out.println( "ClasB doMe()"+  sk);
			}
		}
	
	
		
		ClasA a  = new ClasA();
		ClasB b  = new ClasB();
		
		ClasA aa  = new ClasA(22);
		ClasB bb  = new ClasB(11);		
		aa.doMe();
		bb.doMe();

		//downcast ClasB to ClasA
		ClasA cc  = (ClasA) bb;
		cc.doMe();

		// Upcast, error -> java.lang.ClassCastException
		//ClasB dd  = (ClasB) aa;
		//dd.doMe();
		
		
	}	
	

}
