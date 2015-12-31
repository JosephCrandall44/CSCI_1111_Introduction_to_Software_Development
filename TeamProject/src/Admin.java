import java.util.*;
import java.util.Scanner;

public class Admin {
	final static String ADMIN = "theBoss";
	final static int PASSWORD = 12345;

	
	public Admin(int id, String password){
		id = id;
		password = password;
	}
	
		
	public static void optionsTree(){
		
		Scanner scan = new Scanner(System.in);
		int option;
		int x;
	
		do { 
    		System.out.println("Hello " + ADMIN + " Please enter your numerical Password."); 
    		x = scan.nextInt();
    		if (x == PASSWORD) {
    			do {
        			System.out.println("Welcome to My Admin."); 
        			System.out.println("Choose an option.");
        			System.out.println("1. add, remove, or edit a Course.");
        			System.out.println("2. add, remove, or edit a Professor");
        			System.out.println("3. add, remove, or edit a Student");
        			System.out.println("4. Exit ");
        			option = scan.nextInt();
        			switch (option){
        			case 1:
        				do {
            			System.out.println("1. add course"); 
            			System.out.println("2. remove course");
            			System.out.println("3. edit course");
            			System.out.println("4. Exit ");
            			option = scan.nextInt();
            			switch (option) {
            			case 1:
            				
            			System.out.println("Add a Course number");
        				String number = scan.next(); 
        				
        				System.out.println("Add a Course title");
        				String title = scan.next(); 
        				
        				System.out.println("Add a Professor for the Course");
        				String prof = scan.next(); 
        				
        				Course temp1 = new Course(title, number , prof);
        				
        				Registrar.classcourseArray.add(temp1);
        				
        			  	System.out.println("The Course has been added"); 
        				break;
        				
            			case 2:
            				/*System.out.println("What is the name of the course you want to delete?");
            				String e_delete = scan.next();
            				String temp3;
            				
            				for (int j = 0; j < Course1.size(); j++) {
            					temp3 = Course1.get(j).getCourseName();
            					if (e_delete.equals(temp3)) {
            						System.out.println(Course1.get(j).getCourseName() + "Has been Removed");
            						Course1.remove(j);
            					}
            				}
            				break;
            				
            				
	        			case 3:
	        			case 4:
	        			
	        			*/
	        			}
        				}while (option != 4);
	        		}
        			}while (option != 4);
        		}
		}while (x != PASSWORD);  
	}
}
    			
    		
