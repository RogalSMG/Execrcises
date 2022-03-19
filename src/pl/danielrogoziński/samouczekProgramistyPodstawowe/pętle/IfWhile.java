package pl.danielrogoziński.samouczekProgramistyPodstawowe.pętle;

import java.util.Arrays;

public class IfWhile {

    public static void getNumberFromZeroToSet(int number) {
        int i = 0;

        while (i < number) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < number);
    }

    public static void printEachDigitOfNumberLine(int input) {
        while (input > 0) {
            int reminder = input % 10;
            System.out.println(reminder);
            input /= 10; //input = input / 10;
        }
    }

    public static String reversString(String input) {
        char[] inputInChar = input.toCharArray();
        StringBuilder reversedInput = new StringBuilder();

        for (int i = 0; i < inputInChar.length; i++) {
            reversedInput.append(inputInChar[inputInChar.length - i - 1]);
        }
        return reversedInput.toString();
    }

    public static boolean isPallindorn(String input) {
        char[] inputInChar = input.toCharArray();
        char[] inputInCharReversed = new char[inputInChar.length];

        for (int i = 0; i < input.length(); i++) {
            inputInCharReversed[i] = inputInChar[inputInChar.length - 1 - i];
        }
        return Arrays.equals(inputInChar, inputInCharReversed);
    }

    public static int makeBinnaryFromInt(int input) {
        StringBuilder binnaryInString = new StringBuilder();
        while (input > 0) {
            binnaryInString.append(input % 2);
            input /= 2;
        }
        return Integer.parseInt(reversString(binnaryInString.toString()));
    }

    public static void displayingArrayInSpecialWay(int[] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++) {
            if (i == 0) {
                System.out.print("[" + arrayInput[i] + ", ");
            } else if (i < arrayInput.length - 1) {
                System.out.print(arrayInput[i] + ", ");
            } else {
                System.out.println(arrayInput[i] + "]");
            }
        }
    }

    public static int[] bubbleSorting(int[] inputArray) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    if (count == 0) {
                        count++;
                    }
                    int holder = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = holder;
                }
            }
        }
        return inputArray;
    }

    public static int[] selectingSorting(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[smallest] > inputArray[j]) {
                    smallest = j;
                }
            }
            int holder = inputArray[i];
            inputArray[i] = inputArray[smallest];
            inputArray[smallest] = holder;
        }
        return inputArray;
    }

    public static int[] insertionSorting(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (input[j] < input[j - 1]) {
                int holder = input[j];
                input[j] = input[j - 1];
                input[j - 1] = holder;
                if (j == 1) {
                    break;
                }
                j--;
            }
        }
        return input;
    }

    public static void treeWithTrunk(int high, int trunkWidth, int trunkHeight) {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < high - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        if (trunkWidth < (high * 2 - 1) && trunkWidth % 2 == 1) {
            for (int i = 0; i < trunkHeight; i++) {
                printOneSpace(high - 1 - (trunkWidth - 1) / 2);
                printOneStar(trunkWidth);
                System.out.println();
            }

        } else {
            System.out.println("Trunk were not displayed because condition were not fulfilled");
        }
    }

    private static void printOneSpace(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    private static void printOneStar(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
}