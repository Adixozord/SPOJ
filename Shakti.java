import java.io.*;
import java.util.StringTokenizer;
import static java.lang.System.in;

class Shakti {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(tokenizer.nextToken());

		for (int i = 0; i < N; i++) {

			StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
			int S = Integer.parseInt(tokenizer1.nextToken());

			if ((S & 1) == 1) {
				out.println("Sorry Shaktiman");
			} else {
				out.println("Thankyou Shaktiman");
			}
		}
		out.flush();
	}
}