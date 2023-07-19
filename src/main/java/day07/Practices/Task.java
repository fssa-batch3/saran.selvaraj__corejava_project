package day07.Practices;
import java.util.*;
public class Task {

	public Task(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(0);
		numbers.add(2);
		numbers.add(2);
		numbers.add(2);
		System.out.println("Before Removing : " + numbers);
		HashSet<Integer> removed = new HashSet<Integer>(numbers);
		System.out.println("After Removing : " + removed);
		
	}
}
