package codingBat.string2;

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
}
