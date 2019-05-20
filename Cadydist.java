import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cadydist {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int n = Integer.parseInt(reader.readLine());
			if (n == 0) {
				break;
			}
			
			long arr1[] = new long[100001];
			long arr2[] = new long[100001];
			String ch1[] = reader.readLine().split(" ");
			String ch2[] = reader.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				arr1[i] = Long.parseLong((ch1[i]));
				arr2[i] = Long.parseLong((ch2[i]));
			}

			Arrays.sort(arr1, 0, n);
			Arrays.sort(arr2, 0, n);
			long out = 0;

			for (int i = 0; i < n; i++) {
				out = out + arr1[i] * arr2[n - i - 1];
			}
			System.out.println(out);
		}
	}
}
