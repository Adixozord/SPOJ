import java.util.Scanner;

public class Przedszkolanka {
	// checking method
	static void checkIfDivisible(int class_1, int class_2) {
		for (int i = class_2; i < 100000; i ++) {
			if (i % class_1 == 0 && i % class_2 == 0) {
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for (int i = 0; i < cases; i++) {

			int class1 = scan.nextInt();
			int class2 = scan.nextInt();
			checkIfDivisible(class1, class2);
		}
	}
}
