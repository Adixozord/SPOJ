import java.util.Scanner;

class Mod {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int gon = scan.nextInt();
			int killua = scan.nextInt();

			// x%3==0 , it means ROCK
			// if x%3==1 , it means PAPER
			// if x%3==2 , it means SCISSOR
			if (gon == killua) {
				System.out.println("DRAW");
			} else if (gon == 1 && killua == 2 || gon == 0 && killua == 1 || gon == 2 && killua == 0) {
				System.out.println("KILLUA");
			} else {
				System.out.println("GON");
			}
		}
	}
}
