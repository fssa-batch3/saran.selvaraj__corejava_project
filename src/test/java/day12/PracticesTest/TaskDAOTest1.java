package day12.PracticesTest;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import day12.Practices.*;
import day12.Practices.TaskDAO.DAOException;
public class TaskDAOTest1 {

    @Test
    public void testValidCreateUpdateAndDeleteTask() {
        TaskDAO taskDAO = new TaskDAO();

        // Valid create task
        TaskDAO task1 = new TaskDAO();
        task1.id = 1;
        task1.name = "Task 1";
        task1.status = "Incomplete";
        taskDAO.createTask(task1);

        // Valid update task
        TaskDAO taskToUpdate = new TaskDAO();
        taskToUpdate.id = 1;
        taskToUpdate.name = "Updated Task 1";
        taskToUpdate.status = "Complete";
        taskDAO.updateTask(taskToUpdate);

        // Valid delete task
        taskDAO.deleteTask(1);

        List<TaskDAO> allTasks = taskDAO.getAllTasks();
        assertNotNull(allTasks);
        assertTrue(allTasks.isEmpty());
    }

    @Test(expected = DAOException.class)
    public void testInvalidDeleteTask() throws DAOException {
        TaskDAO taskDAO = new TaskDAO();

        // Invalid delete task (non-existent task ID)
        taskDAO.deleteTask(9999);
    }
}

