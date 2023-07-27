package day09.PracticesTest;

import day09.Practices.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class SortAListOfIntegerTest {

    @Test
    public void testValidSortIntegers() {
    	SortAListOfIntegers sorter = new SortAListOfIntegers();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 7));

        sorter.setArr(input);
        sorter.sortIntegers();

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8));
        assertEquals(expected, sorter.getArr());
    }

    @Test
    public void testInvalidSortIntegers() {
    	SortAListOfIntegers sorter = new SortAListOfIntegers();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 7));

        sorter.setArr(input);
        sorter.sortIntegers();

        // The list should not contain 9
        assertEquals(-1, sorter.getArr().indexOf(9));
    }
}
