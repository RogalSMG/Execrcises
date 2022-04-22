package codeWars;

public class Solutions {
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

    public static boolean isAllTrue(boolean[] array) {
        for (boolean b : array) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static class Troll {
        public static String disemvowel(String str) { // a e i o u
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' &&
                    str.charAt(i) != 'u' && str.charAt(i) != 'o' && str.charAt(i) != 'A' &&
                    str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' &&
                    str.charAt(i) != 'U') {
                    s.append(str.charAt(i));
                }
            }
            return s.toString();
        }
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
}
