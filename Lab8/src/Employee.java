
public class Employee {
	private String firstName;
	private String lastName;
	private String sSN;
	private int iD;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getsSN() {
		return sSN;
	}

	public void setsSN(String sSN) {
		this.sSN = sSN;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	//default constructor
	public Employee(){
		
	}
	//constructor that will allow you to create object of type employee...

	public Employee(String f, String l, String ssn, int i){
		firstName = f;
		lastName = l;
		sSN = ssn;
		iD = i;
	}
	
	public void setfirstName(String name)
	{
		firstName = name;
	}
	
	public String getfirstName(){
		return firstName;
	}
	
	
	
	public static void main(String[]args){
		Employee john = new Employee ();
		Employee bob = new Employee ("bob" , "smith", "SSN123456789", 12345);
		
		System.out.println(bob.getfirstName());
		
		String newName = "bob2";
		bob.setfirstName(newName);
		System.out.println("after changes" + bob.getfirstName());
		
		}
		
}