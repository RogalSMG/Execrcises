package codingBat.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Logic2Test {
    Logic2 logic2 = new Logic2();

    @Test
    void makeBricks() {
        assertAll(
                () -> assertTrue(logic2.makeBricks(2,2,12)),
                () -> assertTrue(logic2.makeBricks(5,0,5)),
                () -> assertTrue(logic2.makeBricks(6,1,11)),
                () -> assertTrue(logic2.makeBricks(0,0,0)),
                () -> assertFalse(logic2.makeBricks(4,1,10)),
                () -> assertFalse(logic2.makeBricks(0,2,11)),
                () -> assertFalse(logic2.makeBricks(10,0,11)),
                () -> assertFalse(logic2.makeBricks(0,0,1))
        );
    }
}