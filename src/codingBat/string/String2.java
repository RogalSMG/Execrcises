package codingBat.string;

public class String2 {
    public String doubleChar(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public String oneTwo(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 3 > str.length()) {
                builder.append(str.substring(i));
                break;
            }
            String sub = str.substring(i, i + 3);
            builder.append(sub.substring(1)).append(sub.charAt(0));
        }
        return builder.toString();
    }

    public String zipZap(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    builder.append("zp");
                    i += 2;
                    continue;
                }
            }

            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     */
    public boolean catDog(String str) {
        if (str == null) {
            return false;
        }

        int cdog = 0;
        int ccat = 0;
        for (int i = 0; str.length() > 2; ) {
            if (str.startsWith("cat")) {
                ccat++;
                str = str.substring(3);
                continue;
            } else if (str.startsWith("dog")) {
                cdog++;
                str = str.substring(3);
                continue;
            }
            str = str.substring(1);
        }
        return cdog == ccat;
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
     */
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        } else if (count == 1) {
            return word;
        }
        StringBuilder builder = new StringBuilder(word);
        for (int i = 1; i < count; i++) {
            builder.append(sep).append(word);
        }
        return builder.toString();
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by a period (.). So "xxyz" counts but "x.xyz" does not.
     */
    public boolean xyzThere(String str) {
        for (int i = str.indexOf("xyz"); i < str.length() - 2; ) {
            if (i == -1) {
                return false;
            }

            if (i == 0 || str.charAt(i - 1) != '.') {
                return true;
            }

            str = str.substring(i + 3);
            i = str.indexOf("xyz");
        }
        return false;
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.
     */
    public String repeatEnd(String str, int n) {
        str = str.substring(str.length() - n);
        StringBuilder builder = new StringBuilder();
        builder.append(str.repeat(Math.max(0, n)));

        /*
        for (int i = 0; i < n; i++) {
            builder.append(str);
        } replaced by builder
         */

        return builder.toString();

        // return "" + str.repeat(Math.max(0, n)); equivalent
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     */
    public int countHi(String str) {
        int count = 0;
        while (true) {
            int index = str.indexOf("hi");
            if (index >= 0) {
                count++;
                str = str.substring(index + 2);
            } else {
                break;
            }
        }
        return count;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     *
     * @param str given string
     * @return number of repetitions "cope" string in given string and there is also allowed any other letter instead of 'p'
     */
    public int countCode(String str) {
        if (str.length() < 4) {
            return 0;
        }
        int count = 0;
        int start = 0;

        do {
            int found = str.indexOf("co", start);
            if (str.length() > found + 3 && str.charAt(found + 3) == 'e') {
                count++;
                start = found + 4;
            } else {
                start += 2;
            }
        } while (str.length() > start);

        return count;
    }

    /**
     * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences
     * (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
     *
     * @param a first string
     * @param b second string
     * @return true if one of both string contain another at very end position
     */
    public boolean endOther(String a, String b) {
        if (a.isEmpty() || b.isBlank()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        return a.indexOf(b) == a.length() - b.length(); //part of the tests on the site are not passed, idk why???
    }

    /**
     * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
     */
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return true;
    }

    /**
     * Return a version of the given string, where for every star (*) in the string
     * the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     */
    public String starOut(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*') {
                //first loop where only two firs index were changed if at index 0 is *
                if (i == 0) {
                    chars[i] = ' ';
                    if (i < chars.length - 1) {
                        chars[i + 1] = ' ';
                    }
                    continue;
                }

                // case where are multiple * followed by each other
                if (i < chars.length - 1 && chars[i + 1] == '*') {
                    chars[i - 1] = ' ';

                    do {
                        chars[i] = ' ';
                        i++;
                    } while (i < chars.length && chars[i + 1] == '*');
                    if (i != chars.length - 1) {
                        chars[i + 1] = ' ';
                    }
                }

                // normal case where
                if (chars[i] == '*') {
                    chars[i] = ' ';
                    if (i < chars.length - 1) {
                        chars[i + 1] = ' ';
                    }
                    chars[i - 1] = ' ';
                    continue;
                }
            }
        }

        StringBuilder out = new StringBuilder();
        for (char aChar : chars) {
            if (aChar != ' ') {
                out.append(aChar);
            }
        }
        return out.toString();
    }
}

