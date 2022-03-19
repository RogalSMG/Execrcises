package pl.samouczekProgramistyPodstawowe.SilpeTypes;

import pl.samouczekProgramistyPodstawowe.pętle.IfWhile;

import java.util.Scanner;

public class ScannerFunctions {
    Scanner scan = new Scanner(System.in);

    public static void numberToBinnaryDisplay() {
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);

        int liczba = scan.nextInt();
        liczba = IfWhile.makeBinnaryFromInt(liczba);
        System.out.println(liczba);
    }

    public static void makeArrayWithNumbersAndDisplay() {
        System.out.println("Give number representing size of the array: ");
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę:");
            System.out.println("Pozostało: " + (size - 1 - i) + " liczb");
            int toPut = Integer.parseInt(scan.nextLine());
            array[i] = toPut;
        }
        for (int arra : array) {
            System.out.print(arra + " ");
        }
        System.out.println();
        IfWhile.bubbleSorting(array);

        for (int arra : array) {
            System.out.print(arra + " ");
        }
    }

    public static void putStringAndMakeSTH() {
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        System.out.println(myString.length());
        System.out.println(IfWhile.isPallindorn(myString));
        System.out.println(IfWhile.reversString(myString));
    }
}
