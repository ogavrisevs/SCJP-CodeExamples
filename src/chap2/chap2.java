package chap2;

public class chap2 {
	class PrivateConstr{
		private PrivateConstr(){
			System.out.println("PrivateConstr");
		}
	}
	class ProtectedConstr{
		private ProtectedConstr(){
			System.out.println("ProtectedConstr");
		}
	}
	class PublicConstr{
		public PublicConstr(){
			System.out.println("PublicConstr");
		}
	}

	
	public static void main (String [] argv){
		new chap2();
	}
	chap2(){
		new PrivateConstr();
		new ProtectedConstr();
		new PublicConstr();
		
		// not visible
		//new PrivateConstrOutside();
		
		// not visible
		//new ProtectedConstrOutside();
		new PublicConstrOutside();
		
	}
}


class PrivateConstrOutside{
	private PrivateConstrOutside(){
		System.out.println("PrivateConstrOutside");
	}
}
class ProtectedConstrOutside{
	private ProtectedConstrOutside(){
		System.out.println("ProtectedConstrOutside");
	}
}
class PublicConstrOutside{
	public PublicConstrOutside(){
		System.out.println("PublicConstrOutside");
	}
}


