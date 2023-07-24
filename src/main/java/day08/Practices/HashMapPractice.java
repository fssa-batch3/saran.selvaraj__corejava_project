
package day08.Practices;
import java.util.*;
public class HashMapPractice {
	
public static HashMap<String,Integer> Array(String line1) {
		
		HashMap<String,Integer> arrayNew = new HashMap<>();
		
		 String[] linesplit = line1.split(",");
			
			for(String i : linesplit) {
				arrayNew.put(i.toLowerCase().trim(),arrayNew.getOrDefault(i.toLowerCase().trim(), 0) + 1);
			}
			
			return arrayNew;
			
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
        String line1 = scan.nextLine();
        HashMap<String,Integer> arrayNew1 = new HashMap<>(Array(line1));
 		
		arrayNew1.forEach((key,value) -> System.out.println(key + " " + value));
   }
}
