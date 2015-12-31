import java.util.Scanner;
public class Exercise7 {

	public static String askYesOrNoQuestion(String s){
		Scanner scan = new Scanner(System.in);
	do{
	
	if (s.equals("yes")){
		return "true";
	}
	else if (s.equals("no")){
		return "false";
	}
	else {
		return "Please enter a yes or no response";
	}
	
	}while (!s.equals("yes") || !s.equals("no"));
}
	
public static void main(String[]args){
	System.out.println("Are you hungry");
	System.out.println("Anwser Yes or No");
	Scanner scan = new Scanner(System.in);
	String answer;
	do{
	String s = scan.next();	
	answer = askYesOrNoQuestion(s);
	System.out.println(answer);

	} while (!answer.equals("true") || !answer.equals("false"));
}
}
