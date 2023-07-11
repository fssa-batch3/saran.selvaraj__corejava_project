package day02.practice;

public class User {

	private int id;
    private String name;
    private String password;
    private String emailId;
    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public static void main(String args[]) {
    	User user = new User();
    	
    	user.setId(129);
    	user.setName("Saran");
    	user.setPassword("Jumanji@2023");
    	user.setEmailId("saran.selvaraj@fssa.freshworks.com");
    	
    	System.out.println("Id : " + user.getId());
    	System.out.println("Name : " + user.getName());
    	System.out.println("Password : " + user.getPassword());
    	System.out.println("Email Id : " + user.getEmailId());
    }
}
