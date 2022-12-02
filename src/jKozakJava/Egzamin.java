package jKozakJava;

public class Egzamin {

    public static void main(String[] args) {
        Zad1 zad1 = new Zad1();
        zad1.makeBoard();
        zad1.printBoard();
        zad1.fillAll100();
        zad1.printBoard();
        zad1.fillDiagonals();
        zad1.printBoard();
        zad1.printTwoHighest();
        zad1.ratio();
        zad1.multiplication();
    }
}
