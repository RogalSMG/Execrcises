package codingBat.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {
    Array2 array2 = new Array2();

    @Test
    void haveThree() {
        assertAll(
                () -> assertTrue(array2.haveThree(new int[]{3, 1, 3, 1, 3})),
                () -> assertFalse(array2.haveThree(new int[]{3, 1, 3, 3}))
        );
    }

    @Test
    void testTwoTwo() {
        assertAll(
                () -> assertTrue(array2.twoTwo(new int[]{1,2,2,3}))
        );
    }
}