
package at.fhj.msd;

public class EmailValidator {
    public static boolean isValid(String email) {
        return !email.startsWith("@") && email.contains("@") && email.endsWith(".com");
    }
}