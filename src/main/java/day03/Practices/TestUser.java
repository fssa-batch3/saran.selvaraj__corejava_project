package day03.Practices;

public class TestUser {

	public static void main(String[] args) {
		User user = new User();
		
		user.User("saran","saranselvaraj","saran@21122004");
		
		System.out.println("Name : "+user.getName());
		System.out.println("Password : "+user.getPassword());
		System.out.println("Email Id : "+user.getEmailId());
	}
}
