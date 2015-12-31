import java.util.Scanner;
public class Question2Final {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This Program will count how many times each word apears in your text.");
		System.out.println("Enter your text");
			
		String a = scan.nextLine();
		
		String[] asplit = a.split(" ");

		for (int i = 0; i < asplit.length; i++) {
			int count = 1;
			if(asplit[i].equals("0")){
				break;
			}
			if (!asplit[i].equals("0")){
			
			
				for (int j = i + 1; j < asplit.length; j++) {
					if (asplit[j].equals(asplit[i])){ 
						count++;
						asplit[j]="0";
					}
				}	
			}System.out.println(asplit[i] + " " + count);	
		}
	}
}
