package codeWars;

import java.util.ArrayList;

public class Solutions {
    public static boolean isAllTrue(boolean[] array) {
        for (boolean b : array) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static boolean validatePin(String pin) {
//        return pin.matches("[0-9]{4}|\\d{6}");
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit(char z) {
        for (int i = 48; i < 58; i++) {
            if (z == i) {
                return true;
            }
        }
        return false;
    }

    public static String explode(String digits) {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
            int numb = Integer.parseInt(String.valueOf(digits.charAt(i)));
            build.append(String.valueOf(digits.charAt(i)).repeat(numb));
        }
        return build.toString();
    }

    /**
     * Method check if given number is prime
     *
     * @param num given number
     * @return true if number is prime, false if not
     */
    public static boolean isFirst(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getSum(int[][] votes) {
        int[] results = new int[2];
        for (int[] vote : votes) {
            for (int j = 0; j < 2; j++) {
                results[j] += vote[j];
            }
        }
        return results;
    }

    /**
     * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
     * <p>
     * It should remove all values from list a, which are present in list b keeping their order.
     * <p>
     * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
     * If a value is present in b, all of its occurrences must be removed from the other:
     * <p>
     * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arrayA = new ArrayList<>();
        for (int num : a) {
            arrayA.add(num);
        }

        ArrayList<Integer> arrayB = new ArrayList<>();
        for (int num : b) {
            arrayB.add(num);
        }

        arrayA.removeAll(arrayB);

        return arrayA.stream().mapToInt(i -> i).toArray();
    }

    public String toJadeCase(String phrase) {
        // using phrase == 0 used less memory
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        // could split to char[] and then make uppercase each char preceded by space
        String[] words = phrase.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String first = String.valueOf(words[i].charAt(0));
            first = first.toUpperCase();
            words[i] = first + words[i].substring(1);
            if (i == words.length - 1) {
                output.append(words[i]);
            } else {
                output.append(words[i]).append(" ");
            }
        }
        return new String(output);
    }

    public boolean pangramChecker(String sentence) {
        sentence = sentence.toLowerCase();
        char[] chars = sentence.toCharArray();

        boolean[] histo = new boolean[26];

        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z' && !histo[aChar - 'a']) {
                histo[aChar - 'a'] = true;
            }
        }
        return isAllTrue(histo);
    }
}
