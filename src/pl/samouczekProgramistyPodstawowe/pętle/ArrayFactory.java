package pl.samouczekProgramistyPodstawowe.pętle;

public class ArrayFactory {
    int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public int[] oneDimension() {
        return new int[size];
    }

    public int[][] twoDimensions() {
        return new int[size][size];
    }

    public int[][] identityMatrix() {
        int[][] matrix = twoDimensions();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j]++;
                } else {
                    // that line is superfluous, arrays are initialized with default value, 0 in case of int type
                    matrix[i][j] = 0;
                }
                if (i + j == size - 1) {
                    matrix[i][j]++;
                }
            }
        }
        return matrix;
    }

    public void matrixDisplaying(int[][] matrixToDisplay) {
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < size; j++) {
                System.out.print(matrixToDisplay[i][j] + " ");
                if (i == size - 1 && j == size - 1) {
                    System.out.println();
                }
            }
        }
    }
}
