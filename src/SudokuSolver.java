public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
        printBoard(board);

        if (solveSudoku(board)) {
            System.out.println("Successful");
        } else {
            System.out.println("Do not go out");
        }

        printBoard(board);
    }

    /**
     * Method witch print a board
     * @param board given int[][] to print
     */
    static void printBoard(int[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("----------------------");
            }
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Helper method check if there is given number in specified row in given int[][]
     * @param board given sudoku board
     * @param row number of row
     * @param number given number to check if it is present
     * @return true if is present
     */
    static boolean isNumberInRow(int[][] board, int row, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Helper method check if there is given number in specified column in given int[][]
     * @param board given sudoku board
     * @param colum number of colum
     * @param number given number to check if it is present
     * @return true if is present, otherwise false
     */
    static boolean isNumberInColumn(int[][] board, int colum, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][colum] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Helper method check if the given number is present is 3x3 square of given int[][]
     * @param board given sudoku board
     * @param row given row
     * @param column given column
     * @param number given number to check if it is present
     * @return true if it is present, if not false
     */
    static boolean isNumberInSquare(int[][] board, int row, int column, int number) {
        row = row - row % 3;
        column = column - column % 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Helper method which check if given number cen be placed in specified place
     * @param board given int[][]
     * @param row given row
     * @param column given column
     * @param number given int to check
     * @return true if place is valid
     */
    static boolean isValidPlace(int[][] board, int row, int column, int number) {
        return !isNumberInRow(board, row, number)
                && !isNumberInColumn(board, column, number)
                && !isNumberInSquare(board, row, column, number);
    }

    /**
     * Method witch will solve sudoku. Int[][] variable is
     * @param board given int[][] represented sudoku
     * @return True if successfully put number in exact place
     */
    static boolean solveSudoku(int[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidPlace(board, i, j, num)) {
                            board[i][j] = num;
                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
