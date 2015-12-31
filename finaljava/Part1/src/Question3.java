import java.util.Scanner;
public class Question3 {
	public static String Answer = "Rabat";
	
	public static void main(String[]args){
		int count = 0;
		String response;
		do{
			
		
		Scanner scan = new Scanner(System.in);
		String answer;
		System.out.println("Answer the following Question");
		System.out.println("What is the Capital of Moocco");
		System.out.println("Rabat");
		System.out.println("Marrakech");
		System.out.println("Tangier");
		System.out.println("Casablanca");
		response = scan.next();
		
		if (response.equals(Answer)){
			System.out.println("Correct");
		}
		else 
			System.out.println(response + " is not the capital of Morocco please guess again");
		count ++;
		
		}while (count < 5 || response.equals(Answer));
		
		if (count >=5){
			System.out.println("Sorry you ran out of tries");
		}
	}

}
