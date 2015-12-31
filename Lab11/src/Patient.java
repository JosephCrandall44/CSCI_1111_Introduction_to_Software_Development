
public class Patient {
	private String name;
	private int age;
	private boolean insurance;
	private int criticality;
	
	public Patient(String name, int age, boolean insurance , int criticality){
		this.name = name;
		this.age = age;
		this.insurance = insurance;
		this.criticality = criticality;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isInsurance() {
		return insurance;
	}


	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}


	public int getCriticality() {
		return criticality;
	}


	public void setCriticality(int criticality) {
		this.criticality = criticality;
	}


	
}
