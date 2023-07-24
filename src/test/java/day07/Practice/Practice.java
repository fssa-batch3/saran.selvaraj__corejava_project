package day07.Practice;
import day08.Practices.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class Practice {

	@Test
	public void GetKeyValuePairsCount() {
	
		HashMapPractice h = new HashMapPractice();
		String line1 = "hr,hr,hr";
		String str = h.Array(line1).toString();
		assertTrue(true,"{hr=3}");
		
		String line2 = "sales,sales";
		String str2 = h.Array(line2).toString();
		assertFalse(false,"{sales=1}");
	}
}
