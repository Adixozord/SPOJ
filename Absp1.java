import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Absp1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		while (t > 0) {

			int n = Integer.parseInt(reader.readLine());
			String arr[] = reader.readLine().split(" ");
			int val[] = new int[n];

			for (int i = 0; i < n; i++) {
				val[i] = Integer.parseInt(arr[i]);
			}
			long sum = 0;
			for (int j = 0; j < n; j++) {
				sum = sum + val[j] * (2 * j - n + 1);
			}
			System.out.println(sum);
			t--;
		}
	}
}