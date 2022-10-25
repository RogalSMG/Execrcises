package codingBat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {
    String2 string2 = new String2();

    @Test
    void testCatDog() {
        assertAll(
                () -> assertFalse(string2.catDog("dogdogcat"))
        );
    }

    @Test
    void testXyzThere() {
        assertAll(
                () -> assertFalse(string2.xyzThere("1.xyz.xyz2.xyz")),
                () -> assertTrue(string2.xyzThere("abc.xyzxyz"))
        );
    }

    @Test
    void testCountHi() {
        assertAll(
                () -> assertEquals(2, string2.countHi("hihi")),
                () -> assertEquals(2, string2.countHi("hihii"))
        );
    }

    @Test
    void testCounCode() {
        assertAll("Testing",
                () -> assertEquals(1,string2.countCode("code")),
                () -> assertEquals(2,string2.countCode("coxecode")),
                () -> assertEquals(2,string2.countCode("codecope")),
                () -> assertEquals(0,string2.countCode("cod")),
                () -> assertEquals(0,string2.countCode("")),
                () -> assertEquals(1,string2.countCode("codeco")),
                () -> assertEquals(1,string2.countCode("xxcozeyycop")),
                () -> assertEquals(3,string2.countCode("AAcodeBBcoleCCccoreDD")),
                () -> assertEquals(2,string2.countCode("cozexxcope")),
                () -> assertEquals(1,string2.countCode("cozfxxcope")),
                () -> assertEquals(3,string2.countCode("coAcodeBcoleccoreDD"))
        );
    }

    @Test
    void testEndOther() {
        assertAll(
                () -> assertFalse(string2.endOther("", ""))
        );
    }
}