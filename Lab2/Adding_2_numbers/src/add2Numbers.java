import java.util.Scanner;



public class add2Numbers {
	public static void main(String[] args){
		
		int x;
		int y;
		int z;
		
		System.out.println ("Enter the first number?");
		
		Scanner S = new Scanner(System.in);
		
		x = S.nextInt();
		
		System.out.println ("Enter the second number?");
		
		Scanner S = new Scanner(System.in);
		
		y = S.nextInt();
		
		z = x + y;
		
		System.out.print("the resutl is :" + z);
		
		
	}
}
