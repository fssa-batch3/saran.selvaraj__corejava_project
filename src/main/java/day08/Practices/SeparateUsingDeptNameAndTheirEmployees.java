package day08.Practices;

import java.util.*;
public class SeparateUsingDeptNameAndTheirEmployees {

	 /**
	 * @param args
	 */
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a HashMap to store the department-employees mapping
	        HashMap<String, List<String>> departmentEmployeesMap = new HashMap<>();

	        // Read the comma-separated list of DeptName, EmployeeName pairs from the user
	        System.out.println("Enter the DeptName, EmployeeName pairs (comma-separated):");
//	        for(int i = 0; i < ) {
	        	String input = scanner.nextLine();	
//	        }

	        // Split the input into individual pairs
	        String[] pairs = input.split(", ");

	        // Process each pair and update the department-employees mapping
	        for (String pair : pairs) {
	            // Split each pair into department and employee
	            String[] parts = pair.split(",");

	            // Get the department name and employee name
	            String department = parts[0].trim();
	            String employee = parts[1].trim();

	            // Update the department-employees mapping
	            if (departmentEmployeesMap.containsKey(department)) {
	                // Department already exists, add the employee to the existing list
	                List<String> employees = departmentEmployeesMap.get(department);
	                employees.add(employee);
	            } else {
	                // Department does not exist, create a new list with the employee
	                List<String> employees = new ArrayList<>();
	                employees.add(employee);
	                departmentEmployeesMap.put(department, employees);
	            }
	        }

	        // Print the department-employees mapping
	        System.out.println("Department-wise employees:");
	        for (Map.Entry<String, List<String>> entry : departmentEmployeesMap.entrySet()) {
	            String department = entry.getKey();
	            List<String> employees = entry.getValue();
	            System.out.println(department + ": " + String.join(", ", employees));
	        }

	        scanner.close();
	    }
	/*HR,Ram HR, Suresh IT, Basker IT, Joseph Admin, Sundar*/
}
