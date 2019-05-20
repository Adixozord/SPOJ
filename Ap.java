import java.io.*;
import java.util.StringTokenizer;
import static java.lang.System.in;

public class Ap {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			long x = Long.parseLong(tokenizer.nextToken());
			long y = Long.parseLong(tokenizer.nextToken());
			long z = Long.parseLong(tokenizer.nextToken());
			long n = (2 * z) / (x + y);
			long d = (y - x) / (n - 5);
			long a = x - 2 * d;
			out.println(n);

			for (int j = 0; j < n; j++) {
				out.print(a + j * d + " ");
			}
			out.println();
		}
		out.flush();

	}
}