package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {
   EmailValidator emailValidator = new EmailValidator();

   @BeforeEach
    public void setUp() {
        emailValidator = new EmailValidator();
    }
    @Test
    public void testValidEmail() {
        String email = ("mario@edu.com");
        boolean result = emailValidator.isValid(email);
        assertTrue(result);
    }
    @Test
    public void testInvalidEmail() {
        String email = ("@edu.com");
        boolean result = emailValidator.isValid(email);
        assertFalse(result);
    }
    
}
