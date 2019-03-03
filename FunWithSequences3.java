import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class FunWithSequences3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int arrayLength = Integer.parseInt(reader.readLine());

		ArrayList<Integer> firstArray = toIntList(reader.readLine().split("\\s"), arrayLength);

		int secondArrayLength = Integer.parseInt(reader.readLine());

		ArrayList<Integer> secondArray = toIntList(reader.readLine().split("\\s"), secondArrayLength);

		// remove duplicate elements
//		firstArray.removeAll(secondArray);
		ArrayList<Integer> result = compareIndexes(firstArray, secondArray, arrayLength, secondArrayLength);
		
		System.out.println(result.toString().replaceAll("[,\\[\\]]", ""));

	}

	private static ArrayList<Integer> compareIndexes(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray, int arrayLength, int secondArrayLength) {

		ArrayList<Integer> result = new ArrayList<>();
		int limit = (arrayLength < secondArrayLength)? arrayLength : secondArrayLength;
		
		for(int i = 0; i < limit ; i++){
			if(firstArray.get(i) == secondArray.get(i)) {
			
				result.add(i+1);
			}
			
		}
		return result;
		
	}

	private static ArrayList<Integer> toIntList(String[] split, int length) {

		ArrayList<Integer> intList = new ArrayList<>();

		for (int i = 0; i < split.length; i++) {
			intList.add(Integer.parseInt(split[i]));
		}

		return intList;
	}
	
	
}
