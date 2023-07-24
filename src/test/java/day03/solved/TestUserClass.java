package day03.solved;
import day03.Practices.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUserClass {

	@Test
	public void TestGetUserDetails() {
	User u = new User();
	assertEquals("Ajmal",u.getName());
	assertEquals("ajmal@gmail.com",u.getEmailId());
	assertEquals("blue@123",u.getPassword());
	
	}
}
