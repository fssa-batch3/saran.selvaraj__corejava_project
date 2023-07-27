package day09.PracticesTest;

import day09.Practices.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.util.*;


public class SearchTest {

    @Test
    public void testValidSorting() {
        List<Search> tasks = new ArrayList<>();
        LocalDate deadline1 = LocalDate.parse("2023-07-25");
        LocalDate deadline2 = LocalDate.parse("2023-07-26");
        LocalDate deadline3 = LocalDate.parse("2023-07-27");

        // Add tasks with different deadlines and priorities
        tasks.add(new Search(1, "Task 1", deadline2, 1));
        tasks.add(new Search(2, "Task 2", deadline3, 2));
        tasks.add(new Search(3, "Task 3", deadline1, 3));

        // Sort tasks based on deadline and priority
        Collections.sort(tasks, Comparator
                .comparing(Search::getDeadline)
                .thenComparing(Search::getPriority));

        // Verify the correct order after sorting
        assertEquals("Task 3", tasks.get(0).getName()); // Earliest deadline and highest priority
        assertEquals("Task 1", tasks.get(1).getName()); // Next deadline
        assertEquals("Task 2", tasks.get(2).getName()); // Latest deadline and lowest priority
    }

    @Test
    public void testInvalidSorting() {
        List<Search> tasks = new ArrayList<>();
        LocalDate deadline1 = LocalDate.parse("2023-07-25");
        LocalDate deadline2 = LocalDate.parse("2023-07-26");
        LocalDate deadline3 = LocalDate.parse("2023-07-27");

        // Add tasks with different deadlines and priorities in the wrong order
        tasks.add(new Search(1, "Task 1", deadline2, 1));
        tasks.add(new Search(2, "Task 2", deadline1, 2));
        tasks.add(new Search(3, "Task 3", deadline3, 3));

        // Sort tasks based on deadline and priority
        Collections.sort(tasks, Comparator
                .comparing(Search::getDeadline)
                .thenComparing(Search::getPriority));

        // Verify the incorrect order after sorting
        assertEquals("Task 2", tasks.get(0).getName()); // Should have been the first task due to earliest deadline
        assertEquals("Task 1", tasks.get(1).getName()); // Should have been the second task due to later deadline
        assertEquals("Task 3", tasks.get(2).getName()); // Should have been the last task due to latest deadline
    }
}
