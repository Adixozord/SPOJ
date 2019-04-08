import java.util.Scanner;

class SumOfDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int result = 0;
			int tmp = 0;
			int allDigits = scan.nextInt();
			int length = String.valueOf(allDigits).length();
			
			for (int j = 0; j < length; j++) {

	            tmp = allDigits % 10;

	            result += tmp;

	            allDigits = allDigits / 10;
				
			}
			System.out.println(result);
		}
	}
}
//