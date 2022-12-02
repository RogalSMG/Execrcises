package jKozakJava;

import java.util.Random;

/*
    1. Napisać program, który tworzy dwuwymiarową tablicę liczb całkowitych o losowej wielkości (wylosowanej z
zakresu [10, 20]), gdzie liczba wierszy jest taka sama, jak liczba kolumn.
Następnie tablica zostaje uzupełniona liczbami losowymi z zakresu [-100, 100], z wyjątkiem elementów
znajdujących się na przekątnej tablicy, które w (losowo) ok. 50% przypadków otrzymują wartość 1, a w
pozostałych 50% przypadków wartość -1.
W wyniku działania programu należy wyświetlić na ekran:
• dwie największe liczby zapisane w tabeli,
• stosunek sumy liczb leżących w komórkach tablicy o parzystych indeksach wierszy i nieparzystych
indeksach kolumn,
• liczbę komórek, których wartość jest mniejsza od iloczynu indeksu wiersza i kolumny tej komórki.

     */

public class Zad1 {
    int[][] ints;

    public Zad1(int[][] ints) {
        this.ints = ints;
    }

    public Zad1() {
    }

    void printBoard() {
        for (int[] anInt : this.ints) {
            System.out.println();
            for (int j = 0; j < this.ints.length; j++) {
                System.out.printf("%4d", anInt[j]);
            }
        }
        System.out.println();
    }

    void makeBoard() {
        Random random = new Random();
        int size = random.nextInt(3, 4);
        this.ints = new int[size][size];
    }

    void fillAll100() {
        Random random = new Random();
        for (int i = 0; i < this.ints.length; i++) {
            for (int j = 0; j < this.ints.length; j++) {
                ints[i][j] = random.nextInt(-100, 101);
            }
        }
    }

    void fillDiagonals() {
        Random random = new Random();
        for (int i = 0; i < this.ints.length; i++) {
            for (int j = 0; j < this.ints.length; j++) {
                if (i == j || i + j == this.ints.length - 1) {
                    if (random.nextInt(0, 2) == 0) {
                        ints[i][j] = -1;
                    } else ints[i][j] = 1;
                }
            }
        }
    }

    void printTwoHighest() {
        int first = -100;
        int second = -100;
        for (int[] anInt : this.ints) {
            for (int j = 0; j < this.ints.length; j++) {
                if (anInt[j] > first) {
                    second = first;
                    first = anInt[j];

                } else if (anInt[j] >= second) {
                    second = anInt[j];
                }
            }
        }
        System.out.println("First number: " + first + "\nSecond number: " + second);
    }

    void ratio() {
        int columns = 0;
        int rows = 0;
        for (int i = 0; i < this.ints.length; i++) {
            for (int j = 0; j < this.ints.length; j++) {
                if (j % 2 == 0) {
                    columns += ints[i][j];
                }
                if (i % 2 == 1) {
                    rows += ints[i][j];
                }
            }
        }
        double ratio = (double) columns / rows;
        System.out.println("Columns: " + columns + "\nRows " + rows + "\nRatio: " + ratio);
    }

    void multiplication() {
        int count = 0;
        for (int i = 0; i < this.ints.length; i++) {
            for (int j = 0; j < this.ints.length; j++) {
                if (ints[i][j] < i * j) {
                    count++;
                }
            }
        }
        System.out.println("Ile mniejszych: " + count);
    }

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
