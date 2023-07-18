package day07.Solved;
import java.util.*;
public class TreeSetDemo {

	 public static void main(String[] args) {
		 
	        // TreeSet sorts the collections
	        TreeSet<String> cityNames = new TreeSet<String>();
	        cityNames.add("Delhi");
	        cityNames.add("Chennai");
	        cityNames.add("Bangalore");
	 
	        for (String cityName : cityNames) {
	            System.out.println(cityName);
	        }
	        cityNames.clear();
	        System.out.println(cityNames);
	 }       
	         
}
