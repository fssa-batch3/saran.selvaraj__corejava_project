package day03.Practices;

public class User {

	private static String name;
	private static String password;
	private static String emailId;
	
	public void User(String name, String password,String emailId) {
		this.name = name;
		this.password = password;
	    this.emailId = emailId;
	}
	
	public String getName() {
		return name;
		
	}
	public String getPassword() {
		return password;
	}
	public String getEmailId() {
		return emailId;
	}
}
