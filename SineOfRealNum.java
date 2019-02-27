import java.util.Scanner;

class SineOfRealNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < input; i++) {
			
			double realNum = Double.parseDouble(scan.nextLine());
			computeSine(realNum);
		}

	}

	private static void computeSine(double realNum) {
	    double x = realNum;

        // convert x to an angle between -2 PI and 2 PI
        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
	}
	
}
