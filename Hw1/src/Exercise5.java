public class Exercise5 {
	public static void main(String[] args) {
		System.out.print("This weeks loto numbers are ");
		for (int i = 0; i < 6; i++) {
			int x = ((int) (Math.random() * ((49 - 1) + 1))) + 1;
			System.out.print(x + " ");
		}
	}
}
