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
        return output.toString();
    }


}
