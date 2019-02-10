import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gluttons {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// day is 86400 sec
	final static int fullDay = 86400;

	static void numOfCookiePacks(int contestants, long cookiesInOnePack) throws NumberFormatException, IOException {

		int allCookiesEaten = 0;
		for (int i = 0; i < contestants; i++) {

			int eatingTempo = Integer.parseInt(br.readLine());
			// num of cookies one contestant can eat during 24h period
			int cookiesEaten = fullDay / eatingTempo;
			// summing cookies eaten
			allCookiesEaten += cookiesEaten;
		}
		// check if host need to get another pack of cookies
		if (allCookiesEaten % cookiesInOnePack == 0) {
			// if not
			System.out.println(allCookiesEaten / cookiesInOnePack);
		} else {
			// else get one more
			System.out.println((allCookiesEaten / cookiesInOnePack) + 1);
		}
	}

	public static void main(String[] args) throws IOException {

		int cases = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cases; i++) {

			String[] input = br.readLine().split("\\s");
			int contestants = Integer.parseInt(input[0]);
			long packs = Integer.parseInt(input[1]);
			numOfCookiePacks(contestants, packs);
		}
	}
}
