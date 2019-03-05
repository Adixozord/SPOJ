import java.util.*;
import java.math.*;

class Marbless {
	public static void main(String[] args) {
		(new Marbless()).run();
	}

	BigInteger choose(int n, int k) {
		if (k < 0 || k > n)
			return BigInteger.ZERO;
		if (n - k < k)
			k = n - k;

		BigInteger x = BigInteger.ONE;
		for (int i = 1; i <= k; i++) {
			x = x.multiply(new BigInteger("" + (n - i + 1)));
			x = x.divide(new BigInteger("" + i));
		}

		return x;
	}

	public void run() {
		
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		for (int i = 1; i <= cases; i++) {
			
			int n = input.nextInt();
			int k = input.nextInt();
			System.out.println(choose(n - 1, k - 1));
		}
	}

}