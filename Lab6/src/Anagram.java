import java.util.Arrays;
import java.util.Scanner;
public class Anagram{

public static boolean areAnagrams(String s1, String s2) {
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);
}
public static void main(String[]args){
	System.out.println("This program checks if two strings are Anagrams ");
	
	Scanner scan = new Scanner(System.in);
	String x;
	String y;
	boolean answer;
	System.out.println("Enter first string");
	x = scan.next();
	System.out.println("Enter second string");
	y = scan.next();
	answer = areAnagrams( x, y);
	System.out.println(answer);
	
}
}