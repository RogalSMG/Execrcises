package pl.danielrogoziński.codingBat.Warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CodingBatTest {
    @Test
    void testNotString() {
        CodingBat code = new CodingBat();
        assertAll("Testes",
        () -> assertEquals("not", code.notString("not"))
        );
    }

    @Test
    void frontBack() {
        CodingBat code = new CodingBat();
        assertEquals("abc",code.frontBack("cba"));
    }

    @Test
    void testMax1020() {
        CodingBat code = new CodingBat();
        assertEquals(0,code.max1020(20,21));
    }

    @Test
    void testIntMax() {
        CodingBat code = new CodingBat();
        assertEquals(3,code.intMax(1,2,3));
    }
}