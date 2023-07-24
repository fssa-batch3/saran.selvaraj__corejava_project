package day05.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import day05.Practices.*;
public class TestDepartment {

	@Test
	public void getDepartment() {
		Department d = new Department("Programming", 389);
         assertEquals("Programming",d.toString());
	}
	
	public void getDeptId() {
		Department d = new Department("Programming", 389);
		assertEquals(389,d.toString());
	}
	
}
