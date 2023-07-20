package day09.Practices;
import java.util.*;
public class SortAListOfIntegers {

      public static void main(String args[]) {
    	  
    		Scanner scan = new Scanner(System.in);
    		ArrayList<Integer> arr = new ArrayList<Integer>(); 
    		
    	    System.out.print("Enter integers with space separated");
    	    
    		for(int i = 0 ; i < 5; i ++) {
    			arr.add(scan.nextInt());
    		}
    		Collections.sort(arr);
    		for(int i = 0 ; i < 5; i ++) {
    			System.out.print( arr.get(i) + " " );
    		}
    		
      }

  

}
