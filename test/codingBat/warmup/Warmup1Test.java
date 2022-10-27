package codingBat.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Warmup1Test {
    @Test
    void testNotString() {
        Warmup1 code = new Warmup1();
        assertAll("Testes",
                () -> assertEquals("not", code.notString("not"))
        );
    }

    @Test
    void frontBack() {
        Warmup1 code = new Warmup1();
        assertEquals("abc", code.frontBack("cba"));
    }

    @Test
    void testMax1020() {
        Warmup1 code = new Warmup1();
        assertEquals(20, code.max1020(20, 21));
    }

    @Test
    void testIntMax() {
        Warmup1 code = new Warmup1();
        assertEquals(3, code.intMax(1, 2, 3));
    }
}