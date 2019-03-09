import java.util.Scanner;
// A game you can always win - VSauce
// 
// https://www.youtube.com/watch?v=dUXW3Kh_kxo&t=275s
// 
// reversed and implemented in java

class GameWithNums {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// up to 2,000,000
		int x = scan.nextInt();
		// if choice is divisi8le 8y 10 it's
		if (x % 10 == 0) {
			System.out.println("2");
		} else {
			System.out.println("1");
			System.out.println(x % 10);
		}
	}
}
