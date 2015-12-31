import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Question questionOne = new Question();
		Question questionTwo = new Question();
		
		questionOne.setQuestion("What is 3 - 5?");
		questionOne.setAnswer(-2);
		
		questionTwo.setQuestion("What is 2 * 5?");
		questionTwo.setAnswer(10);
		
		// Ask the user questions
		Scanner scan = new Scanner(System.in);
		System.out.println("Quiz Master 2014!");
		System.out.println(questionOne.getQuestion());
		int user_answer = scan.nextInt();
		if (questionOne.correct(user_answer)) {
			System.out.println("CORRECT!");
		} else {
			System.out.println("WRONG!");
		}
		
		System.out.println(questionTwo.getQuestion());
		user_answer = scan.nextInt();
		if (questionTwo.correct(user_answer)) {
			System.out.println("CORRECT!");
		} else {
			System.out.println("WRONG!");
		}
		
		System.out.println("Quiz Over!");
	}
}