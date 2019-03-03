import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class FunWithSequences {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int arrayLength = Integer.parseInt(reader.readLine());

		ArrayList<Integer> firstArray = toIntList(reader.readLine().split("\\s"), arrayLength);

		int secondArrayLength = Integer.parseInt(reader.readLine());

		ArrayList<Integer> secondArray = toIntList(reader.readLine().split("\\s"), secondArrayLength);

		// remove duplicate elements
		firstArray.removeAll(secondArray);
		System.out.println(firstArray.toString().replaceAll("[,\\[\\]]", ""));

	}

	private static ArrayList<Integer> toIntList(String[] split, int length) {

		ArrayList<Integer> intList = new ArrayList<>();

		for (int i = 0; i < split.length; i++) {
			intList.add(Integer.parseInt(split[i]));
		}

		return intList;
	}
}