import java.util.Scanner;

class FrequentPrimeRanges {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		int prime[] = new int[100005];
		prime[1] = 0;
		prime[0] = 0;

		for (int i = 2; i <= 100001; i++) {
			prime[i] = 1;
		}

		for (int i = 2; i <= 100001; i++) {
			if (prime[i] == 1) {
				int j = i + i;

				while (j <= 100001) {
					prime[j] = 0;
					j += i;
				}
			}
		}
		for (int i = 2; i <= 100001; i++)
			prime[i] += prime[i - 1];

		while (cases-- > 0) {
			int firstOperand = scan.nextInt();
			int secondOperand = scan.nextInt();
			long ans = 0;
			long result = 0;
			int mod = 2;

			if (secondOperand == 0) {
				long x = firstOperand - 1;
				System.out.println((x * (x + 1)) / 2);
			} else {
				for (int i = 2; i <= firstOperand && mod <= firstOperand; i++) {
					ans = 0;

					while (mod <= firstOperand + 1 && ans < secondOperand) {
						ans = prime[mod] - prime[i - 1];
						mod += 1;
					}
					mod -= 1;
					if (mod != firstOperand + 1) {
						result += firstOperand - mod + 1;
					}
				}
				System.out.println(result);
			}
		}
	}
}