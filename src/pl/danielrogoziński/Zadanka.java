package pl.danielrogoziński;

public class Zadanka {

    public static void zadanka() {
        int[] tab = {1, 2, 3, 4, 5, 6};
        int[] result = new int[7];

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                result[result.length - 1] = tab[0];
            } else {
                result[i - 1] = tab[i];
            }
        }

        for (int number : tab) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
