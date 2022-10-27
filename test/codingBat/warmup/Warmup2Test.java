package codingBat.warmup;

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
}
