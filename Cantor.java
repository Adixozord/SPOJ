import java.util.Scanner;

class Cantor {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			
			int term = scan.nextInt();
			double d = Math.sqrt((double) term * 2);
			
			long firstSide = Math.round(d);
			long secondSide = ((firstSide - 1) * (firstSide)) / 2 + 1;
			
			if (firstSide % 2 == 0) {
				secondSide = term - secondSide + 1;
				System.out.println("TERM " + term + " IS " + secondSide + "/" + (firstSide - secondSide + 1));
			} else {
				secondSide = term - secondSide + 1;
				System.out.println("TERM " + term + " IS " + (firstSide - secondSide + 1) + "/" + secondSide);
			}
		}
	}
}