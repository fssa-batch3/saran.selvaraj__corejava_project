package day07.PracticesTest;

import java.util.ArrayList;
import java.util.HashSet;

import day07.Practices.RemoveDuplicateTaskUsingHashSet;

public class RemoveDuplicatesTaskUsingHashSetTest {

	 public static void main(String[] args) {
	        ArrayList<RemoveDuplicateTaskUsingHashSet> arr = new ArrayList <> ();
	        RemoveDuplicateTaskUsingHashSet task1 = new RemoveDuplicateTaskUsingHashSet("Car Wash",1,"2011-09-01");
	        RemoveDuplicateTaskUsingHashSet task4 = new RemoveDuplicateTaskUsingHashSet("Car Wash",4,"2011-09-01");
	        RemoveDuplicateTaskUsingHashSet task2 = new RemoveDuplicateTaskUsingHashSet("Shopping",3,"2012-05-15");
	        RemoveDuplicateTaskUsingHashSet task3 = new RemoveDuplicateTaskUsingHashSet("Haircut",5,"2013-02-24");
	        arr.add(task1);
	        arr.add(task2);
	        arr.add(task3);
	        arr.add(task4);

	        HashSet<RemoveDuplicateTaskUsingHashSet> distinctTask = new HashSet<>(arr);

	        for (RemoveDuplicateTaskUsingHashSet i: distinctTask) {
	            System.out.println(i);
	        }

	    }
}
