import java.util.ArrayList;
import java.util.Scanner;

public class PrimesNumGenerator1 {
	public static void main(String[] args) {
		int flag = 0;
		int casesAmount;
		ArrayList<int[]> nums = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Num of cases: ");

		while (true) {
			casesAmount = scanner.nextInt();
			if (casesAmount >= 10) {
				System.out.println("maximum 10 cases");
			} else {
				break;
			}
		}

		for (byte i = 0; i < casesAmount; i++) {
//			System.out.println("Enter lower and higher nums separated with space: ");
			int min = scanner.nextInt();
			int max = scanner.nextInt();
			int[] minmax = { min, max };
			nums.add(minmax);
		}
		scanner.close();
		for (int[] pair : nums) {
			int min = pair[0];
			int max = pair[1];
			if (min >= 1 && min <= max && max <= 1000000000) {
				for (int j = min; j <= max; j++) {
					if (j == 2) {
						System.out.println(j);
						continue;
					}
					for (int k = 2; k < j; k++) {
						if (j % k == 0 || j == 1) {
							flag = 0;
							break;
						} else {
							flag = 1;
						}
					}
					if (flag == 1) {
						System.out.println(j);
					}
				}
				System.out.println("");
			}
		}
	}
}
