package pl.danielrogoziński.samouczekProgramistyPodstawowe.tablice;

public class Tablice {

    public static String[] getStringArrayFiveFirstChar() {
        return new String[] {"a", "b", "c", "d", "e"};
    }

    public static int[] reversArray(int[] arrayIn) {
        int [] arrayOut = new int[arrayIn.length];
        for (int i = 0; i < arrayIn.length; i++) {
            arrayOut[arrayOut.length - 1 - i] = arrayIn[i];
        }
        return arrayOut;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i > array.length - 2) {
                System.out.println();
            }
        }
    }
}
