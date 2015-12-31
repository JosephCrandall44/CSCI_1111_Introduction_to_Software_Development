//this class is about has the main method
//this is the main application that uses both CDstoreManager and CD classes
//this class is incomplete and I encourage you to finish it and add a do-while with a menu 
//or switch depending on what the store manager wants to do ..
//this related to the project, and also it is a good review for the final exam. 
import java.util.Scanner;



public class CDuser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		String tobesearched;
		
       CDstoreManager A = new CDstoreManager("John","smith","manager");
      
       A.initialize();
      
      
      System.out.println("what is the name of the cd you want to search for?");
      
       tobesearched = s.next();
      
       CD foundCD = new CD();
      
      foundCD = A.search(tobesearched);
      
      System.out.println("the CD you searched is for is found and its price is"+foundCD.getCDprice() ); 
   
      
      
      
	}

}