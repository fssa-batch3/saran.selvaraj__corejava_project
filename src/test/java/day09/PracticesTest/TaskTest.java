package day09.PracticesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import java.time.LocalDate;
import day09.Practices.*;
public class TaskTest {

    @Test
    public void testValidConstructorAndGetters() {
        int id = 1;
        String name = "Test Task";
        LocalDate deadline = LocalDate.of(2023, 1, 15);

        Tasks task = new Tasks(id, name, deadline);

        assertEquals(id, task.getId());
        assertEquals(name, task.getName());
        assertEquals(deadline, task.getDeadline());
    }

    @Test
    public void testInvalidSetters() {
        int id = 1;
        String name = "Test Task";
        LocalDate deadline = LocalDate.of(2023, 1, 15);

        Tasks task = new Tasks(id, name, deadline);

        // Set invalid values for id and deadline
        task.setId(-1);
        task.setDeadline(null);

        // Test whether invalid values are set correctly
        assertEquals(-1, task.getId());
        assertNull(task.getDeadline());
    }
}
