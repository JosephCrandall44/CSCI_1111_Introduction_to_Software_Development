import java.util.ArrayList;
import java.util.Scanner;

public class FrozenYoPointOfSale {

	private static final String I = null;
	private static final String A = null;
	private static final String D = null;
	private static final String E = null;
	private static final String R = null;
	private static final String Q = null;

	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		String option;
		ArrayList<StoreManager> StoreManager1 = new ArrayList<StoreManager>();
		
		System.out.println("Do you have a Store Manager Account, please anwer yes or no");
		String question;
		question = scan.next();
		if (question == "no"){
			
			ArrayList<StoreManager> StoreManagerlName = new ArrayList<StoreManager>();
			System.out.println("Please enter your first name");
			String fName=scan.next();
			System.out.println("Please enter your last name");
			String lName=scan.next();
			System.out.println("What is your ManagerNumber");
			int ManagerNumber=scan.nextInt();
			System.out.println("create user name");
			double Price = scan.nextDouble();
			System.out.println("please rate on a scale of 1-5");
			int Rate=scan.nextInt();
			BlueBunny temp1 = new BlueBunny(Flavor,Quantity,Price, Rate);
			BlueBunnyname.add(temp1);
			System.out.println("You Blue Bunny Product has been added");
			break;
		
		}
		}
		
		ArrayList<BlueBunny> BlueBunnyname = new ArrayList<BlueBunny>();
		System.out.println("Thank you");
		//ArrayList<BlueBunny> BlueBunny1 = new ArrayList<BlueBunny>();
		
	
		
		
		
		
		
		System.out.println("Hello and Welcome to the Store Manager");
		
			do{
				System.out.println("I: Initialize Products");
				System.out.println("A: Add");
				System.out.println("D: Delete");
				System.out.println("E: Edit");
				System.out.println("R: Rate");
				System.out.println("Q: Quit");
				
				option = scan.next();
				switch (option){
				case I:
					System.out.println("Assign a name to this arraylist of blue bunny products");
					String name = scan.next(); 
					ArrayList<BlueBunny> BlueBunnyname = new ArrayList<BlueBunny>();
					System.out.println("Thank you");
					break;
				case A:
					System.out.println("Add BlueBunny Flavor");
					String Flavor=scan.next();
					System.out.println("How much are you adding");
					int Quantity=scan.nextInt();
					System.out.println("what is the cost");
					double Price = scan.nextDouble();
					System.out.println("please rate on a scale of 1-5");
					int Rate=scan.nextInt();
					BlueBunny temp1 = new BlueBunny(Flavor,Quantity,Price, Rate);
					BlueBunnyname.add(temp1);
					System.out.println("You Blue Bunny Product has been added");
					break;
				case D:
					System.out.println("what is the name of flavor that you are going to delete?");
					String e_delete = scan.next();
					String temp2;
					for (int i = 0 ; i < BlueBunnyname.size(); i++){
						temp2 = BlueBunnyname.get(i).getFlavor();
						if (e_delete.equals(temp2)){
							BlueBunnyname.remove(i);
							System.out.println(BlueBunnyname.get(i).getFlavor() + "has been removed");
						}
						else{
							System.out.println("Sorry, there is currently no Bluebunny flavor with that name");	
						}
					}
					break;
				case E:
					System.out.println("what is the name of flavor that you are going to edit?");
					String edit = scan.next();
					String temp3;
					int qunatity1;
					double cost1;
					int rate1;
					
					for (int i = 0 ; i < BlueBunnyname.size(); i++){
						temp3 = BlueBunnyname.get(i).getFlavor();
						if (e_delete.equals(temp3)){
							System.out.println("How many " + BlueBunnyname.get(i).getFlavor()   + " do we have?");
							qunatity1 = scan.nextInt();
							BlueBunnyname.get(i).setQuantity(qunatity1);
							System.out.println("How much does " + BlueBunnyname.get(i).getFlavor()   + " cost?");
							cost1 = scan.nextInt();
							BlueBunnyname.get(i).setPrice(cost1);
							System.out.println("On a scale of 1-5 what do you rate" + BlueBunnyname.get(i).getFlavor() + " flavor from BlueBunny");
							rate1 = scan.nextInt();
							BlueBunnyname.get(i).setRate(rate1);
							System.out.println(BlueBunnyname.get(i).getFlavor() + "has been updated");
						}
							
						else{
							System.out.println("Sorry, there is currently no Bluebunny flavor with that name");	
							}
						}
					break;
				case R:
					System.out.println("what is the name of flavor that you want to rate?");
					String namerate = scan.next();
					String temp4;
					int rate;
					for (int i = 0 ; i < BlueBunnyname.size(); i++){
						temp4 = BlueBunnyname.get(i).getFlavor();
						if (namerate.equals(temp4)){
							System.out.println("On a scale of 1-5 what do you rate" + BlueBunnyname.get(i).getFlavor() + " flavor from BlueBunny");
							rate = scan.nextInt();
							BlueBunnyname.get(i).setRate(rate);
							System.out.println( BlueBunnyname.get(i).getFlavor() + " is now rated " + BlueBunnyname.get(i).getRate());	
						}
						else{
							System.out.println("Sorry, there is currently no Bluebunny flavor with that name");	
						}
					}
					break;
		}while(!option.equals(Q));
		
		System.out.println("Have a nice day");
		
		
	}
}
