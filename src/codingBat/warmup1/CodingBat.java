package codingBat.warmup1;

public class CodingBat {
    /**
     * Return tru if one of the params is equal 10 or their sum
     *
     * @param a first number
     * @param b second number
     * @return boolean
     */
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a + b == 10;
    }

    /**
     * Return string where last 3 chars are upper case. If shorter than 3, all are in upper case
     *
     * @param str given string
     * @return String
     */
    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String substring = str.substring(str.length() - 3);
            substring = substring.toUpperCase();
            return str.substring(0, str.length() - 3) + substring;
        }
    }

    public String notString(String str) {
        String prefix = "not";
        if (str.length() > 2) {
            if (str.substring(0, 3).equals(prefix)) {
                return str;
            }
        }
        return prefix + " " + str;
    }

    public String delDel(String str) {
        String del = "del";
        int fromIndex = str.indexOf(del);

        if (str.contains(del) && fromIndex == 1) {
            String before = str.substring(0, fromIndex);
            String after = str.substring(fromIndex + 3);
            return before + after;
        }
        return str;
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            String first = str.substring(0, 1);
            String middle = str.substring(1, str.length() - 1);
            String last = str.substring(str.length() - 1);
            return last + middle + first;
        }
        return str;
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19));
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count > 0 && count < 4;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour > 20 || hour < 7));
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public String missingChar(String str, int n) {
        String before = str.substring(0, n);
        String after = str.substring(n + 1);
        return before + after;
    }

    public boolean mixStart(String str) {
        return (str.indexOf("ix") == 1);
    }

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    public boolean loneTeen(int a, int b) {
        return ((a > 12 && a < 20) && !(b > 12 && b < 20) ||
                !(a > 12 && a < 20) && (b > 12 && b < 20));

//        boolean aTeen = (a >= 13 && a <= 19);
//        boolean bTeen = (b >= 13 && b <= 19);
//        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

    public String front22(String str) {
        String prefix;
        if (str.length() < 3) {
            prefix = str;
        } else {
            prefix = str.substring(0, 2);
        }
        return prefix + str + prefix;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        boolean isPositiveA = a >= 0;
        boolean isPositiveB = b >= 0;

        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (isPositiveA && !isPositiveB) || (!isPositiveA && isPositiveB);
        }
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public String everyNth(String str, int n) {
        StringBuilder nowy = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            nowy.append(str.charAt(i));
        }
        return nowy.toString();
    }

    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }

    public int max1020(int a, int b) {
        boolean isInScopeA = a >= 10 && a <= 20;
        boolean isInScopeB = b >= 10 && b <= 20;

        if (isInScopeA && isInScopeB) {
            return Math.max(a, b);
        } else if (isInScopeA) {
            return a;
        } else if (isInScopeB) {
            return b;
        } else {
            return 0;
        }
    }

    public String startOz(String str) {
        String outPut = "";

        if (str.length() > 0) {
            if (str.charAt(0) == 'o') {
                outPut += 'o';
            }
        }

        if (str.length() > 1) {
            if (str.charAt(1) == 'z') {
                outPut += 'z';
            }
        }
        return outPut;
    }

    public boolean in3050(int a, int b) {
        boolean isInScope3040A = a >= 30 && a <= 40;
        boolean isInScope3040B = b >= 30 && b <= 40;
        boolean isInScope4050A = a >= 40 && a <= 50;
        boolean isInScope4050B = b >= 40 && b <= 50;

        return isInScope3040A && isInScope3040B || isInScope4050A && isInScope4050B;
    }

    public int close10(int a, int b) {
        int rangeTo10A = Math.abs(10 - a);
        int rangeTo10b = Math.abs(10 - b);
        if (rangeTo10A == rangeTo10b) {
            return 0;
        }

        return (rangeTo10A > rangeTo10b) ? b : a;
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return (21 - n);
        }
    }

    public boolean startHi(String str) {
        return (str.indexOf("hi") == 0);
    }

    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        } else {
            String first3 = str.substring(0, 3);
            return first3 + first3 + first3;
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    public int intMax(int a, int b, int c) {
        int largest = Math.max(a, b);
        largest = Math.max(largest, c);
        return largest;
    }
}
