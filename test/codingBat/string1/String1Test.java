package codingBat.string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class String1Test {
    String1 string1 = new String1();

    @Test
    void doubleChar() {
    }

    @Test
    void testLastChars() {
        assertEquals("as", string1.lastChars("ababa" , "ass"));
        assertAll(
                () -> assertEquals("@@", string1.lastChars("", "")),
                () -> assertEquals("11", string1.lastChars("1", "a1")),
                () -> assertEquals("@@", string1.lastChars("@", "@")),
                () -> assertEquals("q@", string1.lastChars("qps", "@"))
        );

    }
}