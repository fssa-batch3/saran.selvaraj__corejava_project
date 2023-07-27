package day10.PracticesTest;

import day10.Practices.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EmailValidationDemoTest {

    @Test
    public void testValidEmail() {
        String email = "john.doe@freshworks.com";
        String regex = "^.*@.*\\..*$";

        EmailValidationDemo emailValidator = new EmailValidationDemo(email, regex);

        assertTrue(emailValidator.isValidEmail());
    }

    @Test
    public void testInvalidEmail() {
        String email = "invalid_email";
        String regex = "^.*@.*\\..*$";

        EmailValidationDemo emailValidator = new EmailValidationDemo(email, regex);

        assertFalse(emailValidator.isValidEmail());
    }
}
