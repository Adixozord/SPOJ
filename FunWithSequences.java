import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FunWithSequences {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// num of arguments in first array
		int arrayLength = Integer.parseInt(reader.readLine());
		// converting user input to list of strings to use union
		List<String> firstArray = Arrays.asList(reader.readLine().split("\\s"));
		// num of arguments in second array
		int secondArrayLength = Integer.parseInt(reader.readLine());
		// converting user input
		List<String> secondArray = Arrays.asList(reader.readLine().split("\\s"));
		// creating hash set to remove distinct elements of 2nd list
		Set<String> union = new HashSet<String>(firstArray);
		union.addAll(firstArray);
		// prepare an intersection
		Set<String> intersection = new HashSet<String>(firstArray);
		intersection.retainAll(secondArray);
		// subtract the intersection from the union
		union.removeAll(intersection);
		
		String result = "";
		
		// using sort with generics to convert set into sorted list
		for (String n : asSortedList(union)) {
			
			result += n + " ";
		}
		// get rid of whitespace to pass the test
		System.out.println(result.trim());
	}
	
	public static <T extends Comparable<? super T>> List<T> asSortedList(Collection<T> c) {
	
	  List<T> list = new ArrayList<T>(c);
	  java.util.Collections.sort(list);
	  return list;
	}
}