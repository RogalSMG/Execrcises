package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    @Test
    void testRomanToInt() {
        Solutions solu = new Solutions();
        assertAll("checking some roman values",
        () -> assertEquals(3,solu.romanToInt("III")),
        () -> assertEquals(4,solu.romanToInt("IV"))
        );
    }

}