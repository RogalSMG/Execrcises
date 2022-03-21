package codingBat.warmup2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Warmup2Test {

    @Test
    void stringTimes() {
        Warmup2 warm = new Warmup2();
        assertAll("Testing string repeater",
                () -> assertEquals("Hi", warm.stringTimes("Hi", 1)),
                () -> assertEquals("HiHi", warm.stringTimes("Hi", 2)),
                () -> assertEquals("HiHiHi", warm.stringTimes("Hi", 3)),
                () -> assertEquals("HiHiHiHi", warm.stringTimes("Hi", 4)),
                () -> assertEquals("", warm.stringTimes("Hi", 0)),
                () -> assertEquals("", warm.stringTimes("", 2))
        );
    }

    @Test
    void testFrontTimes() {
        Warmup2 warm = new Warmup2();
        assertAll("Testing string repeater",
                () -> assertEquals("Hil", warm.frontTimes("Hill", 1)),
                () -> assertEquals("HilHil", warm.frontTimes("Hill", 2)),
                () -> assertEquals("HiHiHi", warm.frontTimes("Hi", 3)),
                () -> assertEquals("HiHiHiHi", warm.frontTimes("Hi", 4)),
                () -> assertEquals("", warm.frontTimes("Hi", -1)),
                () -> assertEquals("", warm.frontTimes("", 2))
        );
    }

    @Test
    void stringSplosion() {
        Warmup2 warm = new Warmup2();
        assertEquals("AAbAbc", warm.stringSplosion("Abc"));
    }

    @Test
    void testNTwice() {
        Warmup2 warm = new Warmup2();
        assertEquals("Helllo", warm.nTwice("Hello", 3));
    }

    @Test
    void deFront() {
        Warmup2 warm = new Warmup2();
        assertAll("Testing string repeater",
                () -> assertEquals("abx", warm.deFront("abx")),
                () -> assertEquals("a", warm.deFront("axx")),
                () -> assertEquals("bx", warm.deFront("xbx")),
                () -> assertEquals("a", warm.deFront("a")),
                () -> assertEquals("b", warm.deFront("xb")),
                () -> assertEquals("a", warm.deFront("ax"))
        );
    }
}
