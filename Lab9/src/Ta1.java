import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ta1 {

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int value;	
		do
			{
				System.out.println("Please chose an option");
				System.out.println("(1)Add guest");
				System.out.println("(2)Remove guest");
				System.out.println("(3)Print lists");
				System.out.println("(4)Exit");

				value = scan.nextInt();
				if (value > 4){
					break;
				}
				switch (value) {
				case 1:
					System.out.println("Enter the Guests Name");
					String x = scan.next();
					names.add(x);
					break;
				case 2:
					System.out.println("Enter the Guests Name you wish to remove");
					String remove = scan.next();
					for (int k = 0; k < names.size(); k++) {
						names.get(k);
						if (remove.equalsIgnoreCase(names.get(k))) {
							names.remove(k);
							break;
						} else {
							System.out.println("The Guests Name does not exists");
						}
					}

				case 3:
						System.out.println(names);
						break;
					
				case 4:
					System.out.println("Have a nice day");
					break;	
			}
			} while (value != 4);
				
			
			
	}
}

	


