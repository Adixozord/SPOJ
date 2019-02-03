public class AnswerToLife {
	public static void main(String[] args) throws java.lang.Exception {
		// input
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String s;
		// loop until answer isnt 42
		while (!(s = r.readLine()).startsWith("42"))
			System.out.println(s);
	}
}