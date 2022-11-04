package codingBat.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recursion1Test {
    Recursion1 recursion1 = new Recursion1();

    @Test
    void count8() {
        assertAll(
                () -> assertEquals(2,recursion1.count8(818)),
                () -> assertEquals(5,recursion1.count8(888))
        );

    }

    @Test
    void countX() {
        assertAll(
                () -> assertEquals(2, recursion1.countX("xx")),
                () -> assertEquals(1, recursion1.countX("xX")),
                () -> assertEquals(2, recursion1.countX("axaxa"))
                );
    }
}