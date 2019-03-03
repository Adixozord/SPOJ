class AnswerToLifeInteractive {
	public static void main(String[] args) throws java.lang.Exception {
		// input
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		String input;
		while (!(input = r.readLine()).startsWith("42")) {
			System.out.println(input);
		}
		System.out.println(input);
	}
}
