import java.util.*;

class Mushrooms {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = 0;
		int arr[] = new int[10];
		
		while (cases < 10) {
			arr[cases++] = scan.nextInt();
		}
		
		int sum = 0;
		cases = 0;
		
		while (cases < 10) {
			sum += arr[cases];
			if (sum >= 100) {
				break;
			}
			cases++;
		}
		if (cases <= 9) {
			sum -= arr[cases];
			if ((100 - sum) >= (sum + arr[cases] - 100))
				System.out.println(sum + arr[cases]);
			else
				System.out.println(sum);
		} else {
			System.out.println(sum);
		}
	}
}