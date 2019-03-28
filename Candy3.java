import java.util.Scanner;

class Candy3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		
		for (int i = 0; i < cases; i++) {
			
			long k = scan.nextLong();
			long sum = 0;
			
			for (int j = 0; j < k; j++) {
				
				long c = scan.nextLong();
				sum = (sum + c) % k;
			}
			if (sum == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
