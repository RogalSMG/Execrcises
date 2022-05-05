package codingBat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {
    String2 string2 = new String2();

    @Test
    void testCatDog() {

        assertAll(
                () -> assertTrue(string2.catDog("dogdogcat"))
        );
    }
}