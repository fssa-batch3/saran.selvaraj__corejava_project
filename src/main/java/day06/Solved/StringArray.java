package day06.Solved;

public class StringArray {
	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		
		// Display the city names
		for (String cityName : cityArr) {
			if(cityName != null) {
				System.out.println(cityName);				
			}
		}
		
		System.out.println(" ");
		cityArr[3] = "Delhi";
		
		for (String cityName : cityArr) {		
			if(cityName != null) {
				System.out.println(cityName);				
			}
		}
		
		System.out.println(" ");
		cityArr[1] = "Kolkata";
		
		for (String cityName : cityArr) {		
			if(cityName != null) {
				System.out.println(cityName);				
			}
		}
		
		System.out.println(" ");
		cityArr[2] = null;
		
		for (String cityName : cityArr) {		
			if(cityName != null) {
				System.out.println(cityName);				
			}else {
				System.out.println("null");
			}
		}
	}

}
