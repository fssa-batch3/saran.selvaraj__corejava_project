package day08.Practices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepartmentEmployee {
    private HashMap<String, List<String>> departmentEmployeesMap;

    public DepartmentEmployee() {
        departmentEmployeesMap = new HashMap<>();
    }

    public HashMap<String, List<String>> getDepartmentEmployeesMap() {
        return departmentEmployeesMap;
    }

    public void setDepartmentEmployeesMap(HashMap<String, List<String>> departmentEmployeesMap) {
        this.departmentEmployeesMap = departmentEmployeesMap;
    }

    public void addEmployee(String department, String employee) {
        if (departmentEmployeesMap.containsKey(department)) {
            List<String> employees = departmentEmployeesMap.get(department);
            employees.add(employee);
        } else {
            List<String> employees = new ArrayList<>();
            employees.add(employee);
            departmentEmployeesMap.put(department, employees);
        }
    }
    public static void main(String args[]) {
    	
    }
}
