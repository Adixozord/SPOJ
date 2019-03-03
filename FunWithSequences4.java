import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class FunWithSequences4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(reader.readLine());

		int arrayLength = Integer.parseInt(stk.nextToken());
		int limiter = Integer.parseInt(stk.nextToken());

		ArrayList<Integer> firstArray = toIntList(reader.readLine().split("\\s"), arrayLength);

		ArrayList<Integer> secondArray = toIntList(reader.readLine().split("\\s"), arrayLength);

		String result ="";
		
		for (int i = 0; i < arrayLength; i++) {
			for (int j = -limiter; j <= limiter; j++) {
				if ((i + j >= 0) && (i + j < arrayLength) && (firstArray.get(i) == secondArray.get(i + j))) {
					result+= i+1+ " ";
				}
			}
		}
		System.out.println(result.substring(0,result.length()-1));
	}

	private static ArrayList<Integer> toIntList(String[] split, int length) {

		ArrayList<Integer> intList = new ArrayList<>();

		for (int i = 0; i < split.length; i++) {
			intList.add(Integer.parseInt(split[i]));
		}

		return intList;
	}
}