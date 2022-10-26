package codingBat.string;

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

    @Test
    void middleTwo() {
        assertAll(
                () -> assertEquals("s", string1.middleTwo("ast")),
                () -> assertEquals("ss", string1.middleTwo("asst")),
                () -> assertEquals("at", string1.middleTwo("at")),
                () -> assertEquals("a", string1.middleTwo("a")),
                () -> assertEquals("", string1.middleTwo(""))
        );
    }
}