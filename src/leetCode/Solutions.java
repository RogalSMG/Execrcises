package leetCode;

public class Solutions {
    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char let = chars[i];

            if (let == 'V') {
                sum += 5;
                continue;
            }

            if (let == 'L') {
                sum += 50;
                continue;
            }

            if (let == 'D') {
                sum += 500;
                continue;
            }

            if (let == 'M') {
                sum += 1000;
                continue;
            }

            boolean isLast = s.length() - 1 == i;

            if (let == 'I') {
                if (isLast) {
                    sum += 1;
                    break;
                }

                if (chars[i + 1] == 'V') {
                    sum += 4;
                    i++;
                    continue;
                }

                if (chars[i + 1] == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }

                sum += 1;
                continue;
            }

            if (let == 'X') {
                if (isLast) {
                    sum += 10;
                    break;
                }

                if (chars[i + 1] == 'L') {
                    sum += 40;
                    i++;
                    continue;
                }
                if (chars[i + 1] == 'C') {
                    sum += 90;
                    i++;
                    continue;
                }

                sum += 10;
                continue;
            }

            if (let == 'C') {
                if (isLast) {
                    sum += 100;
                    break;
                }

                if (chars[i + 1] == 'D') {
                    sum += 400;
                    i++;
                    continue;
                }

                if (chars[i + 1] == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }

                sum += 100;
            }
        }
        return sum;
    }

    public boolean isPalindrome(ListNode head) {
        return true;
    }
}
