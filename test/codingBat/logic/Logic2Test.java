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

    @Test
    void closeFar() {
        assertTrue(logic2.closeFar(4,5,8));
    }

    @Test
    void blackjack() {
        assertAll(
                () -> assertEquals(20,logic2.blackjack(20,22)),
                () -> assertEquals(21,logic2.blackjack(21,22)),
                () -> assertEquals(0,logic2.blackjack(23,22)),
                () -> assertEquals(20,logic2.blackjack(20,19))
        );
    }
}