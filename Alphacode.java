import java.util.*;
import java.lang.*;

class Alphacode {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String encodedNumericString = scan.next(); // store input as string to have methods like charAt() and length()

		while (!encodedNumericString.equals("0")) { // terminate program if input equals 0
			int a = 1;
			int b = 1;
			int result = 1;

			for (int i = 0; i < encodedNumericString.length(); i++) {

				int iteratedChar = Character.getNumericValue(encodedNumericString.charAt(i));

				if (i > 0) {

					int previousChar = Character.getNumericValue(encodedNumericString.charAt(i - 1));
					int decoded = previousChar * 10 + iteratedChar;
					
					if (decoded >= 10 && decoded <= 26) {
						if (decoded == 10 || decoded == 20) {
							
							result = b;
							b = a;
							a = result;
						} else {
							
							result = a + b;
							b = a;
							a = result;
						}
					} else {
						a = b = result;
					}
				}

			}
			System.out.println(result);
			encodedNumericString = scan.next();
		}
	}
}
