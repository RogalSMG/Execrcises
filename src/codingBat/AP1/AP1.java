package codingBat.AP1;

public class AP1 {

    /**
     * Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
     */
    public boolean scoresIncreasing(int[] scores) {
        int highest = scores[0];

        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] >= highest) {
                highest = scores[i + 1];
            } else return false;

        }
        return true;
    }
}
