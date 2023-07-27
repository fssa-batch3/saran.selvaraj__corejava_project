package day08.PracticesTest;
import day08.Practices.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.HashMap;

public class HashMapPracticeTest {

    @Test
    public void testValidProcessString() {
    	HashMapPractice processor = new HashMapPractice();
        String input = "apple, Banana, apple, Orange, banana, apple";

        processor.processString(input);

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("orange", 1);

        assertEquals(expected, processor.getArrayNew());
    }

    @Test
    public void testInvalidProcessString() {
    	HashMapPractice processor = new HashMapPractice();
        String input = "apple, Banana, apple, Orange, banana, apple";

        processor.processString(input);

        // The map should not contain "Pineapple" key.
        assertEquals(null, processor.getArrayNew().get("Pineapple"));
    }
}
