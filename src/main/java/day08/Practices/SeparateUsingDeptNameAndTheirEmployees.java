package day08.Practices;

import java.util.*;
public class SeparateUsingDeptNameAndTheirEmployees {

	 /**
	 * @param args
	 */
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        HashMap<String, List<String>> departmentEmployeesMap = new HashMap<>();
	        
	        System.out.println("Enter the DeptName, EmployeeName pairs (comma-separated):");
	        	String input = scanner.nextLine();	

	        String[] pairs = input.split(", ");

	        for (String pair : pairs) {
	            String[] parts = pair.split(",");

	            String department = parts[0].trim();
	            String employee = parts[1].trim();

	            if (departmentEmployeesMap.containsKey(department)) {
	                List<String> employees = departmentEmployeesMap.get(department);
	                employees.add(employee);
	            } else {
	                List<String> employees = new ArrayList<>();
	                employees.add(employee);
	                departmentEmployeesMap.put(department, employees);
	            }
	        }

	        System.out.println("Department-wise employees:");
	        
	        for (Map.Entry<String, List<String>> entry : departmentEmployeesMap.entrySet()) {
	            String department = entry.getKey();
	            List<String> employees = entry.getValue();
	            System.out.println(department + ": " + String.join(", ", employees));
	        }
	    }
}
