import java.util.*;
import java.io.*;

class ChristmasPlay {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());

		while (cases-- > 0) {

			String input = br.readLine();
			String inputToArr[] = input.split(" ");
			int firstLength = Integer.parseInt(inputToArr[0]);
			int secondLength = Integer.parseInt(inputToArr[1]);

			input = br.readLine();
			inputToArr = input.split(" ");

			int arr[] = new int[firstLength];

			for (int i = 0; i < firstLength; i++) {
				arr[i] = Integer.parseInt(inputToArr[i]);
			}
			Arrays.sort(arr);

			int min = 1000000001;
			int i = 0;
			while (i + secondLength - 1 < firstLength) {

				if (arr[i + secondLength - 1] - arr[i] < min) {
					min = arr[i + secondLength - 1] - arr[i];
				}
				i += 1;
			}

			System.out.println(min);
		}

	}
}