package day08.PracticesTest;

import day08.Practices.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DepartmentEmployeesTest {

    @Test
    public void testValidAddEmployee() {
        DepartmentEmployee departmentEmployees = new DepartmentEmployee();
        String department = "HR";
        String employee = "John Doe";
        departmentEmployees.addEmployee(department, employee);

        List<String> expectedEmployees = new ArrayList<>();
        expectedEmployees.add(employee);
        assertEquals(expectedEmployees, departmentEmployees.getDepartmentEmployeesMap().get(department));
    }

    @Test
    public void testInvalidAddEmployee() {
        DepartmentEmployee departmentEmployees = new DepartmentEmployee();
        String department = "HR";
        String employee = "John Doe";
        departmentEmployees.addEmployee(department, employee);

        String invalidDepartment = "InvalidDepartment";
        String employee2 = "Jane Smith";
        departmentEmployees.addEmployee(invalidDepartment, employee2);

        // The invalid department should not be added to the map.
        assertEquals(null, departmentEmployees.getDepartmentEmployeesMap().get(invalidDepartment));
    }
}

