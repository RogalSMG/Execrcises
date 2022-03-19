package pl.codingBat.Warmup2;

public class Warmup2 {
    /*
    Hello there, this is my personal battle with enormous amount of tasks placed on site codebat.com.
    Prepare your shield.
     */

    public String stringTimes(String str, int n) {
        String output = str;
        try {
            output = (str.repeat(n));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        if (n == 0) {
            return "";
        } else {
            return output;
        }
    }

    public String frontTimes(String str, int n) {
        String front;
        if (str.length() > 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        if (n < 0) {
            System.err.println("Integer value lower than zero, " +
                    "there is no exceptions because Math.max was used.");
        }
        return front.repeat(Math.max(0, n));
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int indexOfFirstX = str.indexOf('x');

        if (indexOfFirstX == -1) { // case when x was not found
            return false;
        }

        if (indexOfFirstX == str.length() - 1) { // case when 'x' is a last char
            return false;
        }

        return str.charAt(indexOfFirstX) == str.charAt(indexOfFirstX + 1);
    }

    public String stringBits(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder stro = new StringBuilder();
        for (int i = 1; i < str.length() + 1; i++) {
            stro.append(str, 0, i); // second int argument is endindex EXCLUSIVE, thus we +1 str.length() in loop
        }
        return stro.toString();
    }

    public int last2(String str) {
        String lastTwo;
        if (str.length() < 3) {
            return 0;
        } else lastTwo = str.substring(str.length() - 2);

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == lastTwo.charAt(0) && str.charAt(i + 1) == lastTwo.charAt(1)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int shorter = Math.min(a.length(), b.length());

        for (int i = 0; i < shorter - 1; i++) {
            String asub = a.substring(i, i + 2);
            String bsub = b.substring(i, i + 2);
            if (asub.equals(bsub)) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x' || (i == 0) || i == str.length() - 1) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public String altPairs(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            out.append(str, i, end);
        }
        return out.toString();
    }

    public String stringYak(String str) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')) {
                i = i + 2;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 5 == nums[i + 1] && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

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

}
