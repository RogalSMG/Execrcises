package codingBat.logic;

public class Logic2 {

    /**
     * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
     * Return true if it is possible to make the goal by choosing from the given bricks.
     * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
     */
    public boolean makeBricks(int small, int big, int goal) {
        int smallNeeded = goal % 5;
        int bigNeeded = goal / 5;
        if (small >= smallNeeded && big >= bigNeeded) {
            return true;
        } else if (big < bigNeeded) {
            return small >= (smallNeeded + (bigNeeded - big) * 5);
        } else return false;
    }

    /**
     * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
     */
    public int loneSum(int a, int b, int c) {
        int sum = a + b + c;

        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else return sum;
    }

    /**
     * Given 3 int values, a b c, return their sum. However,
     * if one of the values is 13 then it does not count towards the sum and values to its right do not count.
     * So for example,if b is 13, then both b and c do not count.
     */
    public int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else return sum;
    }

    /**
     * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
     * except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
     * {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times
     * (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
     */
    public int noTeenSum(int a, int b, int c) {

        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    /**
     * Helper method to noTeenSum
     */
    public int fixTeen(int a) {
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            return 0;
        } else return a;
    }

    /**
     * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
     * so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
     * Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num)
     * {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
     */
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int rest = num % 10;
        if (rest >= 5) {
            return num - rest + 10;
        } else return num - rest;
    }

    /**
     * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
     * differing from both other values by 2 or more.
     */
    public boolean closeFar(int a, int b, int c) {
        return close(a, b) && far(c, a, b) || close(a, c) && far(b, a, c);
    }

    public boolean close(int a, int b) {
        return (Math.abs(a - b) <= 1);
    }

    public boolean far(int a, int b, int c) {
        return Math.abs(a - b) >= 2 && Math.abs(a - c) >= 2;
    }

    /**
     * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
     */
    public int blackjack(int a, int b) {
        int newA = 21 - a;
        int newB = 21 - b;
        if (newA < 0 && newB < 0) {
            return 0;
        } else if (newA < 0) {
            newA = 21;
        } else if (newB < 0) {
            newB = 21;
        }
        if (newA > newB && b <= 21) {
            return b;
        } else if (newB > newA && a <= 21) {
            return a;
        } else return 0;
    }

    /**
     * Given three ints, a b c, one of them is small, one is medium and one is large.
     * Return true if the three values are evenly spaced, so the difference
     * between small and medium is the same as the difference between medium and large.
     */
    public boolean evenlySpaced(int a, int b, int c) {
        int small = a;
        int medium = b;
        int large = c;
        int temp;

        if (small > medium) {
            temp = medium;
            medium = small;
            small = temp;
        }
        if (medium > large) {
            temp = large;
            large = medium;
            medium = temp;
        }
        if (small > medium) {
            temp = medium;
            medium = small;
            small = temp;
        }
        return medium - small == large - medium;
    }

    /**
     * We want to make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
     * Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
     */
    public int makeChocolate(int small, int big, int goal) {
        if ((small + big * 5) < goal) {
            return -1;
        }
        int neededBig = goal / 5;
        int neededSmall = goal % 5;

        if (big >= neededBig && small >= neededSmall) {
            return neededSmall;
        } else if (big < neededBig) {
            if (small >= neededSmall + (neededBig - big) * 5) {
                return neededSmall + (neededBig - big) * 5;
            }
        }
        return -1;
    }
}
