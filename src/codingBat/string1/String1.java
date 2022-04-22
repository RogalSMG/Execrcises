package codingBat.string1;

public class String1 {
    public String makeTags(String tag, String word) {
        return ("<" + tag + ">" + word + "</" + tag + ">");
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(str.length() - 2).startsWith("ly");
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.startsWith(str.substring(str.length() - 2));
    }

    public String left2(String str) {
        String first2 = str.substring(0, 2);
        String rest = str.substring(2);
        return rest + first2;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String withoutLastTwo = str.substring(0, str.length() - 2);
        return withoutLastTwo + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);

    }

    public String nTwice(String str, int n) {
        if (n > str.length()) {
            n = str.length();
        }

        String start = str.substring(0, n);
        String end = str.substring(str.length() - n);
        return start + end;
    }

    public String twoChar(String str, int index) {
        if (str.length() < 2) {
            return str;
        }
        if (index + 2 > str.length() || index < 0) {
            return str.substring(0, 2);
        }

        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int startIndex = (str.length() - 1) / 2 - 1;
        return str.substring(startIndex, startIndex + 3);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        String isBad;
        if (str.length() == 3) {
            isBad = str.substring(0, 3);
        } else {
            isBad = str.substring(0, 4);
        }

        return isBad.contains("bad");
    }

    public String atFirst(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a.concat(b.substring(1));
        } else {
            return a + b;
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";

    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        }

        String shorter = a;
        String longer = b;
        if (a.length() > b.length()) {
            shorter = b;
            longer = a;
            return a.substring(longer.length() - shorter.length()) + b;
        } else {
            return a + b.substring(longer.length() - shorter.length());
        }
    }

    public String minCatAAS(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        }

        String shorter = a;
        String longer = b;
        if (a.length() > b.length()) {
            shorter = b;
            longer = a;
            return a.substring(longer.length() - shorter.length()) + b;
        } else {
            return a + b.substring(longer.length() - shorter.length());
        }
    }

    public String extraFront(String str) {
        String first2;
        if (str.length() < 3) {
            first2 = str;
        } else {
            first2 = str.substring(0, 2);
        }
        return first2 + first2 + first2;
    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String ending = str.substring(str.length() - 2);
        if (str.startsWith(ending)) {
            return str.substring(2);
        } else {
            return str;
        }

    }

    public String deFront(String str) {
        if (str.length() == 0) {
            return str;
        }

        String a = "";
        if (str.charAt(0) == 'a') {
            a = "a";
        }
        if (str.length() == 1) {
            return a;
        }

        String b = "";
        if (str.charAt(1) == 'b') {
            b = "b";
        }
        System.out.println(a);
        return a + b + str.substring(2);
    }

    public String startWord(String str, String word) {
        if (str.length() == 0) {
            return str;
        }

        String beginning = str.substring(1);
        if (beginning.startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }

    public String withoutX(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return "";
            }
        }

        String middle = str.substring(1, str.length() - 1);
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        boolean firstX = first == 'x';
        boolean lastX = last == 'x';

        if (firstX && lastX) {
            return middle;
        } else if (firstX) {
            return middle + last;
        } else if (lastX) {
            return first + middle;
        } else {
            return str;
        }
    }

    public String withoutXX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0,str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        boolean wasFirstX = false;
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            wasFirstX = true;
        }
        if (str.length() > 0) {
            if (wasFirstX && str.charAt(0) == 'x') {
                str = str.substring(1);
            } else if (!wasFirstX && str.charAt(1) == 'x'){
                str = str.charAt(0) + str.substring(2);
            }
        }
        return str;
    }

    public String extraFront2(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str + str + str;
        }
        str = str.substring(0, 2);
        return str + str + str;
    }
}
