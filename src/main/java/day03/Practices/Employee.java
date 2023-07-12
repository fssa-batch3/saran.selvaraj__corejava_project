package day03.Practices;

public class Employee {

	private static int id;
    private static String name;
 
    public void Employee(int id,String name) {
        this.id = id;
        this.name = name;
        
    }
    public int getEmployeeid() {
    	return id;
    }
    public String getEmployeename() {
    	return name;
    }
}
