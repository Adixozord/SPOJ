import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// handling 150 digits factorial fast and simple

class SmallFactorial {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());

		while (cases > 0) {
			cases--;
			int input = Integer.parseInt(reader.readLine());
			calculateFactorial(input);

		}

	}

	private static void calculateFactorial(int nExclamation) {
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= nExclamation; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}