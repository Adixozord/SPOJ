import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());

		while (cases > 0) {
			cases--;
			int input = Integer.parseInt(reader.readLine());
			printTrailing0InFactorial(input);

		}

	}

	// algorithm counting amount of trailing zeros 
	// in fact(num) without actually calculating the
	// factorial
	
	public static void printTrailing0InFactorial(int num) {
		
		int count = 0;
		// we need to iterate 5 at a time thats
		// the only iterator that matters when it goes for 
		// 0's in a factorial
		for (int i = 5; (num / i) > 0; i = i * 5) {
			count = count + num / i;
		}
		System.out.println(count);
	}

}
