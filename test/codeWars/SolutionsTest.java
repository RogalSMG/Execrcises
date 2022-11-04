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

    @Test
    public void testExplode() {
        assertAll(
                () -> assertEquals("122333", Solutions.explode("123")),
                () -> assertEquals("33322", Solutions.explode("032")),
                () -> assertEquals("", Solutions.explode("")),
                () -> assertEquals("", Solutions.explode("0"))
        );
    }

    @Test
    void arrayDiff() {
        assertAll(
                () -> assertArrayEquals(new int[]{2}, Solutions.arrayDiff(new int[]{1, 2}, new int[]{1})),
                () -> assertArrayEquals(new int[]{2, 2}, Solutions.arrayDiff(new int[]{1, 2, 2}, new int[]{1})),
                () -> assertArrayEquals(new int[]{1}, Solutions.arrayDiff(new int[]{1, 2, 2}, new int[]{2})),
                () -> assertArrayEquals(new int[]{1, 2, 2}, Solutions.arrayDiff(new int[]{1, 2, 2}, new int[]{})),
                () -> assertArrayEquals(new int[]{3, 5}, Solutions.arrayDiff(new int[]{1, 2, 2, 3, 5, 2}, new int[]{2, 1})),
                () -> assertArrayEquals(new int[]{}, Solutions.arrayDiff(new int[]{}, new int[]{1, 2}))
        );
    }
}
