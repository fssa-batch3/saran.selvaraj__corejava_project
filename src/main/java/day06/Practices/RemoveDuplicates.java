package day06.Practices;
import java.util.*;
public class RemoveDuplicates {

	public static void main (String args []) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List<String> cityListNew = new ArrayList<String>();
		
		for(String city : cityList) {
			if(!cityListNew.contains(city)) {
				cityListNew.add(city);
			}
		}
		
		System.out.println(cityListNew);
	}
}
