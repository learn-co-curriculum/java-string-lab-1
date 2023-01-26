import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

    @Disabled
    @Test
    public void isValidLength() {
        assertTrue(PasswordChecker.isValidLength("abcdefgh"));
        assertTrue(PasswordChecker.isValidLength("123456789"));
        assertFalse(PasswordChecker.isValidLength("1234567"));
        assertFalse(PasswordChecker.isValidLength(""));
    }

    @Disabled
    @Test
    public void containsSpecialChar() {
        assertTrue(PasswordChecker.containsSpecialChar("abc!def"));
        assertTrue(PasswordChecker.containsSpecialChar("#hash"));
        assertTrue(PasswordChecker.containsSpecialChar("yummy?"));

        assertFalse(PasswordChecker.containsSpecialChar("5<8"));
        assertFalse(PasswordChecker.containsSpecialChar("not special"));
        assertFalse(PasswordChecker.containsSpecialChar(""));
    }

    @Disabled
    @Test
    public void containsDigit() {
        assertTrue(PasswordChecker.containsDigit("abc3def"));
        assertTrue(PasswordChecker.containsDigit("5"));
        assertTrue(PasswordChecker.containsDigit("!a 9"));

        assertFalse(PasswordChecker.containsDigit("secret"));
        assertFalse(PasswordChecker.containsDigit("!!!"));
        assertFalse(PasswordChecker.containsDigit(""));
    }

    @Disabled
    @Test
    public void containsNonDigit() {
        assertTrue(PasswordChecker.containsNonDigit("abc3def"));
        assertTrue(PasswordChecker.containsNonDigit("-5"));
        assertTrue(PasswordChecker.containsNonDigit("???"));

        assertFalse(PasswordChecker.containsNonDigit("5"));
        assertFalse(PasswordChecker.containsNonDigit("12345678"));
        assertFalse(PasswordChecker.containsNonDigit(""));
    }

    @Disabled
    @Test
    public void passwordStrength() {
       /*
       length
       special character
       digit
       non-digit
        */

        assertEquals(4, PasswordChecker.passwordStrength("aB3!def*")); //length,  digit, non-digit, special
        assertEquals(3, PasswordChecker.passwordStrength("Ab9(0000")); //length,  digit, non-digit
        assertEquals(3, PasswordChecker.passwordStrength("???????????")); //length, nondigit, special
        assertEquals(2, PasswordChecker.passwordStrength("1*3=7")); //digit, nondigit
        assertEquals(2, PasswordChecker.passwordStrength("Password")); //length, nondigit
        assertEquals(2, PasswordChecker.passwordStrength("12345678")); //length, digit
        assertEquals(1, PasswordChecker.passwordStrength("%^()")); //nondigit

    }
}