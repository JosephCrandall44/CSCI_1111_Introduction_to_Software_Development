import java.util.Scanner;


public class Neighbor {
	static  int smallestDistance (int [] array){
	    
        int smallest = (int) Math.abs(array[0]-array[1]);
        int index = 0;
        for(int i=1; i<array.length-1; i++){
            int value = Math.abs(array[i]-array[i+1]);
            if(value< smallest){
            smallest= value;
            index = i;
            }       
        }
		return index;    
	}
	    
	    public static void main(String [] args){
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("How many integers do you want in your array");
	    	int n = scan.nextInt();
	    	
	    	int[] array = new int[n];

	    	    for (int i = 0; i < array.length; i++)
	    	    {
	    	        System.out.println("Please enter an integer");
	    		array[i] = scan.nextInt();
	    	    }
	       
	    	    
			smallestDistance(int []  array);
	    }	    
}