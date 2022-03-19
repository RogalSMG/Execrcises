package pl.selfTaught.methods;

import java.util.Scanner;

public class MetodyWJava {
    Scanner scan = new Scanner(System.in);

    public boolean method8(int a, int b, int c) {
        int highest = a;

        if (highest < b) {
            highest = b;
        }

        if (highest < c) {
            highest = c;
        }

        return a * a + b * b == c * c;
    }

    public double method7(double a) {
        return Math.sqrt(a);
    }

    public int method6(int a) {
        return a * a * a;
    }

    public boolean method5(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    public boolean method4(int a) {
        return a % 2 == 0;
    }

    public int yourAge() {
        return 25;
    }

    public String yourName() {
        System.out.println("What is your name? ");
        return scan.nextLine();
    }

    public void method3(int a, int b) {
        System.out.println("sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product : " + a * b);
    }

}
