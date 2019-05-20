import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Esyrcrtn {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int arr[] = {0,1,4,6,5,2};
        
        while (t >0){
        	
            long n = Integer.parseInt(reader.readLine());
            long val = n%6;
            Integer i = (int) (long) val;
            System.out.println(arr[i]);
            t--;
        }
    }
}