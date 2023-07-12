package day03.Practices;

public class TestEmployee {

	 public static void main(String[] args) {
	        Employee e1 = new Employee();
	        Employee e2 = new Employee();
	        
	        e1.Employee(1,"naresh");
	        e2.Employee(2,"suresh");
	        
	        System.out.println("id="+e1.getEmployeeid()+" " + "name="+e1.getEmployeename());
	        System.out.println("id="+e2.getEmployeeid()+" " + "name="+e2.getEmployeename());
	    }
}
