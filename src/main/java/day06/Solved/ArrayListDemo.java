package day06.Solved;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {

		// Store the city names in the List
		ArrayList cityList = new ArrayList();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		// Display the city names
		for (Object object : cityList) {
			String cityName = (String) object; // TypeCast object to String
			System.out.println(cityName);
		}
		
		System.out.println(cityList);	// Use of toString method of 'Object' class

	}
}
