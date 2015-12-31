import java.util.ArrayList;
import java.util.Scanner;
public class StoreManager {

	private String firstName;
	private String lastName;
	private String storeRole;
	
	private ArrayList<Cd> Cdcollection = new ArrayList<Cd>();
	
	public StoreManager(String fname, String lname, String role){
		firstName = fname;
		lastName = lname;
		storeRole = role;
	}
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
	public String getStoreRole() {
		return storeRole;
	}
	public void setStoreRole(String storeRole) {
		this.storeRole = storeRole;
	}
	public ArrayList<Cd> getCdcollection() {
		return Cdcollection;
	}
	public void setCdcollection(ArrayList<Cd> cdcollection) {
		Cdcollection = cdcollection;
	}
	
	public void initialize(){
		String temporaryCdName;
		String temporaryCdNumber;
		String answer;
		double price;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println ("enter CD name");
			temporaryCdName = scan.next();
			System.out.println ("enter CD number");
			temporaryCdNumber = scan.next();
			System.out.println ("enter CD price");
			price = scan.nextDouble();
		
			Cd temporary = new Cd(temporaryCdName, temporaryCdNumber, price);
		
			Cdcollection.add(temporary);
			System.out.println("Any more CD's ?");
			answer = scan.next();
			
			
		}while(!answer.equals("no"));
	}
	public Cd search (String name){
		Scanner scan = new Scanner(System.in);
		
		Cd temp = new Cd();
		
		for (int i = 0 ; i < CdCollection.size(); i ++){
		temp = CdCollection.get(i);
		if (temp.getCdName().equals(name) == true){
			return temp;
		}
		}
		
		return temp; 
		
			
		}
		
	
		
	}
		
}

