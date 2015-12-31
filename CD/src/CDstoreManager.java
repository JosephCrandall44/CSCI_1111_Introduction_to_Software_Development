//This class is for a CDstoreManager
// a CDstoreManager has a firstname, lastname, and role
// and an array list that will hold the CDs that the store will have.


import java.util.*;
import java.util.Scanner; 


public class CDstoreManager {

    //state
	private String firstname;
	private String lastname;
	private String role;
	
	//arraylist
	private ArrayList<CD> myArr = new ArrayList<CD>();
	
    //constructor
	public CDstoreManager(String fname, String lname, String r){
		
		firstname = fname;
		lastname = lname;
		role = r;
		
	}
	
	
	//a store manager can initialize or populate the array list that will contain the CD entered by the user
	public void initialize(){
		
		Scanner myscanner = new Scanner(System.in);
		String tempcdname;
		String tempcdnumber;
		double tempcdprice;
		String answerfromtheuser;
		
	
		CD temp = new CD();
		do{
	
		
			System.out.println("Enter CD name ");
		
			tempcdname = myscanner.next();
		
			System.out.println("Enter CD number ");
		
			tempcdnumber = myscanner.next();
		
			System.out.println("Enter CD price  ");
		
			tempcdprice = myscanner.nextDouble();
	
			temp.setCDname(tempcdname);
			temp.setCDnumber(tempcdnumber);
			temp.setCDprice(tempcdprice);
		   
			//adding to the list - notice temp is a CD
			myArr.add(temp);
			
			System.out.println("Any more CD you want to ADD");
			answerfromtheuser = myscanner.next();
		
		}while(!answerfromtheuser.equals("NO"));
		
		
		
		
		
	
	}
	
	
  // a CDstoremanager can search for CD per name
    public CD search(String name){
		
	    //creating a temp object that will later on be assigned to the object found in the list.
	   //or it is will stay empty if the object is not found
	    CD temp = new CD();
	    
	    
	    for(int i=0;i<myArr.size();i++)
		{
		  temp = myArr.get(i); //this is where you get records (CDs stored at myarry arraylist) - you loop through eachone
		  if(temp.getCDname().equals(name)){
			  
			  return temp;
		  }
			
			
		}	
	    return temp;
	 
	
	}
    //you can add more functions for delete, edit ... 
    ///...
    public void delete(String name){
    	
    	CD temp = new CD();
    	
    	for (int i = 1 ; i < myArr.size(); i ++){
    		temp = myArr.get(i);
    		
    		if(temp.getCDname().equals(name)){
    			myArr.remove(i);
    		}
    		
    		
    	}
    }
	
    public void edit(String name){
    	
    }
    
    
    
	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public ArrayList<CD> getMyArr() {
		return myArr;
	}


}