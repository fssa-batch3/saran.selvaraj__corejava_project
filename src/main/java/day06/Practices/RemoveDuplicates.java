package day06.Practices;
import java.util.*;
public class RemoveDuplicates {
	public static String A;

	public static String getA() {
		return A;
	}

	public static void setA(String a) {
		A = a;
	}

	public static void main (String args []) {
		List<String> cityList = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String loop = "continue";
		while(!"exit".equalsIgnoreCase(loop)) {
			String loops = scan.nextLine();
			setA(loops);
			cityList.add(getA());
			System.out.println("Type \"exit\" to exit adding citys or press enter: ");
			loop = scan.nextLine();
		}
		
		
		List<String> cityListNew = new ArrayList<String>();
		
		for(String city : cityList) {
			if(!cityListNew.contains(city)) {
				cityListNew.add(city);
			}
		}
		
		System.out.println(cityListNew);
	}
}
