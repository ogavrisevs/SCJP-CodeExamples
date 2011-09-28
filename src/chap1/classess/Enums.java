package chap1.classess;

public class Enums {

	enum SimpleEnum {unos, dos, tress}
	enum SimpleEnums {unos, dos, tress};
	enum SimpleEnumss {unos, dos, tress};
	
	enum EnumssClass {
		unos(3), dos(2), tress(1);
		
		EnumssClass(int val){
			this.val = val;
		}
		
		protected int val = 0;
		
		int getVal(){
			return val;
		}
		void setVal(int val){
			this.val = val;
		}
	}
	
	enum StrangeEnums {
		unos, dos {
			public String method() {
				return "B";
			}

			public int method2() {
				return 999;
			}

		},
		tress;

		public String method() {
			return "C";
		}
	};
	
	public static void main(String[] args) {
		new Enums();
	}

	public Enums() {
		SimpleEnum se = SimpleEnum.unos;
			System.out.println(se);
		
		for (SimpleEnum str : SimpleEnum.values())
			System.out.println("name: "+ str.name() + " val: "+ str.ordinal());
	
		
		EnumssClass ec = EnumssClass.tress;
		System.out.println(ec.toString());
		System.out.println(ec.getVal());
		ec.setVal(2);
		System.out.println(ec.toString() + " val "+ ec.val);
		ec.setVal(22);
		System.out.println(ec.toString() + " val "+ ec.val);
			
		StrangeEnums see = StrangeEnums.unos;
		System.out.println(see);
		StrangeEnums seee = StrangeEnums.dos;
		System.out.println(seee.method());
		
		
	}

	
}

