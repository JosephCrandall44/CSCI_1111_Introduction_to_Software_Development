
public class DivisibleBy6or7 {
	public static final int upper = 100;
	public static void main(String[]args){
		int i;
		for(i = 1; i <= upper; i++)
		{	
			boolean num = (i % 6 == 0 || i % 7 == 0) && !(i % 6 == 0 && i % 7 == 0);
			if (num == true){
			System.out.println (i);
			}
		}
			
			
			
		}
	}

