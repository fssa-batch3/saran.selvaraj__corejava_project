package day06.Solved;
import java.util.ArrayList;
public class ArrayListWithGenericsDemo {

	public static void main(String[] args) {

		// Store the city names in the List ( use Generics )
		ArrayList<String> cityList = new ArrayList();
		
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		// Display the city names
		for (String cityName : cityList) {
			System.out.println(cityName);
		}

		System.out.println(cityList); // Use of toString method of 'Object' class

	}
}
