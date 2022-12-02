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

    static boolean isNumberInRow(int[][] board, int row, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    static boolean isNumberInColumn(int[][] board, int colum, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][colum] == number) {
                return true;
            }
        }
        return false;
    }

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

    static boolean isValidPlace(int[][] board, int row, int column, int number) {
        return !isNumberInRow(board, row, number)
                && !isNumberInColumn(board, column, number)
                && !isNumberInSquare(board, row, column, number);
    }

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
