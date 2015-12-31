
public class Exercise3 {
	public static int raiseIntToPower(int n, int k) {
		int sum;
		sum = (int) Math.pow(n, k);
		return sum;
}
	public static void main(String[]args){
	for (int k = 0; k <=10 ; k++){
		int result = raiseIntToPower(2, k);
		System.out.println (k + " " + result);
		
	}
	}
}