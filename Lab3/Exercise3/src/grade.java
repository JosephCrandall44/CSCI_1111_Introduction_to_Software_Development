import java.util.Scanner;

public class grade {

	public static void main(String[] args){
		
		char letterGrade;
		double minGrade = 1;
		double currentAverage = 1;
		double finalPercentage = 1;
		double averageScore =1;
		double neededScore =1;
		double currentAverage =1 ;
		double finalPercentageInDec =1;
		System.out.println("Enter Desired Grade");
		Scanner myScanner = new Scanner(System.in);
		myScanner.next();
		letterGrade = myScanner.next().charAt(0)
		System.out.println("Enter Minimum Grade");
		minGrade = myScanner .nextDouble();
		System.out.println("Enter Minimum Grade");
		currentAverage = myScanner .nextDouble();
		System.out.println("Enter the currnet Percentage");
		
		finalPercentageInDec = finalpercentage / 100;
		
		neededScore = (averageScore - (currentAverage * (1-finalPercentageInDec)))/ finalPercentageInDec
				
		System.out.println("You need a score of" +neededscore + " to get a" + letterGrade);
		
		
		
		
	}
}