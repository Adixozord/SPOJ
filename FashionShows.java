import java.util.Scanner;
import java.util.*;

class FashionShows {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			int arrayLength = scan.nextInt();
			int firstArray[] = new int[arrayLength];
			int secondArray[] = new int[arrayLength];
			int pos = 0;
			while (pos < arrayLength) {
				firstArray[pos++] = scan.nextInt();
			}
			Arrays.sort(firstArray);
			pos = 0;
			while (pos < arrayLength) {
				secondArray[pos++] = scan.nextInt();
			}
			Arrays.sort(secondArray);
			pos = 0;
			int sum = 0;
			while (pos < arrayLength) {
				sum += firstArray[pos] * secondArray[pos];
				pos++;
			}
			System.out.println(sum);
		}
	}
}
