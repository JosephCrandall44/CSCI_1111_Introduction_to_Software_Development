//import
import java.util.*;

public class Student extends User {
    
	public Student(int id, String password, String name, String type){
		super(id, password, name, type);
	}
	
	/*state
	private String Name;
	private String Password;
	private String SSN;
	private String Email;
    
	//constructor
	public Student(String Name, String Password, String SSN, String Email){		
		this.Name = Name;
		this.Password = Password;
		this.SSN = SSN;
		this.Email= Email;
	}
	
	*/
	
	public static void optionsTree() {
		
		Scanner scan = new Scanner(System.in);
		int option;
		String submittedName;
		String submittedPassword;
		String tempName = null;
    	String tempPassword = null;
		
		System.out.println("SUP G-DUB");
		do { 
    		System.out.println("Hello Student, please enter your user Name"); 
    		submittedName = scan.next();
    		System.out.println("and now your passowrd"); 
    		submittedPassword = scan.next();
    		
    		for (int j = 0; j < Course.studentArray.size(); j++) {	
    	
    	tempName = Course.studentArray.get(j).getName();
				if (submittedName.equals(tempName)) {
						tempPassword = Course.studentArray.get(j).getPassword();
						if(submittedPassword.equals(tempPassword)){
							
							do {
								System.out.println("What would you like to do");
								System.out.println("1. View all available courses being offered");
								System.out.println("2. Regester for a Course");
								System.out.println("3. Drop a Course you are enrolled in");
								System.out.println("4. View Courses you are enrolled in");
								System.out.println("5. Exit the Program ");
								option = scan.nextInt();
								switch (option) {
								case 1:
									System.out.println("Here are the courses that are curently being offered "); 
								for (int j2 = 0; j2 < Registrar.courseArray.size(); j2++){
									System.out.println(Registrar.courseArray.get(j2).getCourseName());
									System.out.println(Registrar.courseArray.get(j2).getCourseNumber());
									System.out.println(Registrar.courseArray.get(j2).getCourseProfessor());
									}
									break;
								case 2:
									Professor.optionsTree();
									break;
								case 3:
									Admin.optionsTree();
									break;
								case 4:
									
									break;
								}
							} while (option != 5);
							
						}
				}
    		}
		}while (!submittedName.equals(tempName) || !submittedPassword.equals(tempPassword));
	}
	/*
	@Override
	   public String toString() {
	        return ("StudentName: "+this.getName()+
	        		"Password: "+this.getPassword()+
	                    " SSN: "+ this.getSSN() +
	                    " Email: "+ this.getEmail() );
	   }
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}	
	
	*/
}
