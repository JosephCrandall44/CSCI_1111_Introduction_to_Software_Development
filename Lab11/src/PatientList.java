import java.util.ArrayList;
import java.util.Scanner;


public class PatientList {
		
		
		public static void main(String[]args){
			int value;
			Scanner scan = new Scanner(System.in);
			ArrayList<Patient> patientList = new ArrayList<Patient>();
			
	
			do
				{
					System.out.println("Please chose an option");
					System.out.println("(1)Add patient");
					System.out.println("(2)Remove most critical patient");
					System.out.println("(3)Print patient list");
					System.out.println("(4)Quit");

					value = scan.nextInt();
					if (value > 4){
						break;
					}
					switch (value) {
					case 1:
						System.out.println("Enter Patinets Name");
						String name = scan.next();
						
						System.out.println("Enter Patinets age");
						int age = scan.nextInt();
						
						System.out.println("Does the Patient Have insurance (T/F)");
						boolean insurance = scan.nextBoolean();
						
						System.out.println("Patients Criticality (1-10)");
						int criticality = scan.nextInt();
						Patient newPatient=new Patient(name,age,insurance, criticality);
patientList.add(newPatient);
						break;
						
					case 2:

						for (int k = 0; k < PatientList.size(); k++) {
							PatientList.get(criticality);
							int high = 0;
							if (PatientList.criticality => high) {
								high == setcriticality.equalshigh
							} 
							
						PatientList.remove(high);
						break;
						}
						

					case 3:
							System.out.println(PatientList);
							break;
						
					case 4:
						System.out.println("Have a nice day");
						break;	
				}
				} while (value != 4);
					
				
				
		}
			
		}

