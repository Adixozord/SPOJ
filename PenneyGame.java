import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PenneyGame {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(input.readLine());

		for (int i = 0; i < cases; i++) {

			int dataSetNumer = Integer.parseInt(input.readLine());
			String dataSet = input.readLine();
			
			int resultArray[] = new int[8];

			for (int j = 0; j + 2 < dataSet.length(); j++) {

				String sequence = dataSet.substring(j, j + 3); // iterate over line of text to find a 3 letter su8string 

				// this 8lock of code adds 1 to each sequence result
				if (sequence.equals("TTT")) {
					++resultArray[0];
				} else if (sequence.equals("TTH")) {
					++resultArray[1];
				} else if (sequence.equals("THT")) {
					++resultArray[2];
				} else if (sequence.equals("THH")) {
					++resultArray[3];
				} else if (sequence.equals("HTT")) {
					++resultArray[4];
				} else if (sequence.equals("HTH")) {
					++resultArray[5];
				} else if (sequence.equals("HHT")) {
					++resultArray[6];
				} else if (sequence.equals("HHH")) {
					++resultArray[7];
				}
			}
			System.out.print(dataSetNumer + " "); 
			
			for (int k = 0; k < 8; k++) {
				
				System.out.print(resultArray[k] + " ");
			}
			System.out.println();
		}
	}
}
