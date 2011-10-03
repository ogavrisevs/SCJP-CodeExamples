package sybex.AssessmentTest.Question2;



public class TestTV {
	
	public static void main(String [] argv){
		new TestTV();
	}
	
	TestTV(){
		TV a = new TV("Philips", "42PFL5603D");
		TV b = new TV("Philips", "42PFL5603D");
		
		if(a.equals(b)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}

class TV {
	private String make;
	private String model;

	public TV(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public boolean equals(TV other) {
		return make.equals(other.make) && model.equals(other.model);
	}

	public int hashCode() {
		return make.length() * 10 + model.length();
	}
}

