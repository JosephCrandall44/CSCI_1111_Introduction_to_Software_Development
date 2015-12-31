import java.util.ArrayList;
import java.util.Scanner;
public class Registrar {

	
	static ArrayList<Course> courseArray = new ArrayList<Course>();
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int option;
		System.out.println("Hello. Welcome to the GW Registrar.");
		do {
			System.out.println("Who are you.");
			System.out.println("1. Student");
			System.out.println("2. Professor");
			System.out.println("3. Admin");
			System.out.println("4. Exit the Program ");
			option = scan.nextInt();
			switch (option) {
			case 1:
				Student.optionsTree();
				break;
			case 2:
				Professor.optionsTree();
				break;
			case 3:
				Admin.optionsTree();
				break;
			}
		} while (option != 4);
	}
	
	public static ArrayList<Course> getCourseArray() {
		return courseArray;
	}

	public static void setCourseArray(ArrayList<Course> courseArray) {
		Registrar.courseArray = courseArray;
	}
}

    		
      			
      	/*
      	 
    		System.out.println("Please enter your numerical Password."); 
    		int x = scan.nextInt();
    			
    			
    		if (x == PASSWORD) {
    			
    			do {
    			System.out.println("Welcome to My Admin."); 
    			System.out.println("Choose an option.");
    			System.out.println("1. Search a Student.");
    			System.out.println("2. Add a Student.");
    			System.out.println("3. Delete a Student.");
    			System.out.println("4. Display all students.");
    			System.out.println("5. Exit - close the applciaiton");
    			option = scan.nextInt(); 
    			switch (option) {
    			
    				
    			case 1:
    				System.out.println("What is the name of the person you are searching for?");
    				String e_temporary = scan.next();
    				String temp;
    				Student temp2;
    				
    				for (int j = 0; j < Student1.size(); j++) {
    					temp2 = Student1.get(j);
    					temp = temp2.getName();

    					if (e_temporary.equals(temp)) {
    						System.out.println("Found " + Student1.get(j).getName());
    					}
    				}
    				
    				try {
    				    Thread.sleep(2000);
    				} catch(InterruptedException ex) {
    				    Thread.currentThread().interrupt();
    				}
    				break;
    			
    			
    		
    			
    			case 2:
    				
    				
    				System.out.println("Add a Student Name");
    				String Name = scan.next(); 
    				
    				System.out.println("Add a Student SSN");
    				String SSN = scan.next(); 
    				
    				System.out.println("Add a Student Email");
    				String Email = scan.next(); 
    				
    				Student temp1 = new Student(Name, SSN, Email);
    				Student1.add(temp1);
    			  	System.out.println("The Student has been added"); 
    				break;
    				
    				
    			case 3:
    				System.out.println("What is the name of the person you want to delete?");
    				String e_delete = scan.next();
    				String temp3;
    				
    				for (int j = 0; j < Student1.size(); j++) {
    					temp3 = Student1.get(j).getName();
    					if (e_delete.equals(temp3)) {
    						System.out.println(Student1.get(j).getName() + "Has been Removed");
    						Student1.remove(j);
    					}
    				}
    				break;
    				
    				
    			case 4:
    				System.out.println(Student1);
    				break;
    			}
    			
    			}while (option != 5);
    			
    			
    			
    			System.out.println("Have a nice day");
    			
    			
    			
    			
    		
    	} else {System.out.println("Invalid Password."); 
				count++;}
    			
    			
    			
    			
    		
    			
    	} while (count <3);
    	System.out.println("Sorry, you ran out of tries.");	
    	
    	
    	*/
    

