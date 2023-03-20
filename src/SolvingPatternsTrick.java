/**
 * How to approach any pattern problem
 * 1. How many rows are in pattern
 * 2. For every row number identify:
 * - How many columns are there
 * - What types of sing are there
 * 3. What should be printed
 * <p>
 * Try finding rule contain row and col numbers
 */
public class SolvingPatternsTrick {

    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int c = n * 2 - 1;

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }

            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int numberOfColumn = row > n ? 2 * n - row : row;

            for (int s = 0; s < n - numberOfColumn; s++) {
                System.out.print(" ");
            }
            for (int col = numberOfColumn; col >= 1; col--) {
                System.out.print(col);
            }

            for (int col = 2; col <= numberOfColumn; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfSpaces = 2 * (n - row);

            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }

            int numberOfColumn = row * 2 - 1;
            for (int col = 1; col <= numberOfColumn; col++) {
                int numberToPrint = row >= col ? row - col + 1 : col - row + 1;
                System.out.print(numberToPrint + " ");
            }
            System.out.println("");
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalNumberOfCol = row > n ? 2 * n - row : row;

            int numberOfSpaces = n - totalNumberOfCol;

            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int i = 0; i < totalNumberOfCol; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * for n 3
     * *
     * **
     * ***
     * **
     * *
     */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalNumberOfCol = row > n ? 2 * n - row : row;
            for (int i = 0; i < totalNumberOfCol; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // When one row is printed we need new line
            System.out.println();
        }
    }

    /**
     * ***
     * **
     * *
     */
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // When one row is printed we need new line
            System.out.println();
        }
    }

    /**
     * rows equals cols
     * ***
     * ***
     * ***
     */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // When one row is printed we need new line
            System.out.println();
        }
    }

    /**
     * *
     * **
     * ***
     * ****
     * *****
     */
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed we need new line
            System.out.println();
        }
    }
}
