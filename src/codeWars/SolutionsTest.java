package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Solutions pc = new Solutions();
        assertTrue(pc.pangramChecker(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Solutions pc = new Solutions();
        assertFalse(pc.pangramChecker(pangram2));
    }

    @Test
    public void testPangramCheckerMyself() {
        Solutions sol = new Solutions();
        assertAll("Checking:",
        () -> assertFalse(sol.pangramChecker("aa..")),
        () -> assertFalse(sol.pangramChecker("abc efg hij klmn")),
        () -> assertTrue(sol.pangramChecker("The quick brown fox jumps over the lazy dog.")),
        () -> assertFalse(sol.pangramChecker("a.."))
        );
    }
}