import java.util.Scanner;
public class ReversedArray {
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a string");
	String string1 = scan.next();
	
	char[] ar = string1.toCharArray();
		
	for(int i = 0; i < ar.length / 2; i++)
	{
	    int temp = ar[i];
	   ar[i] = ar[ar.length - i - 1];
	   ar[ar.length - i - 1] = (char) temp;
	}
	System.out.println(ar);
	}
}
