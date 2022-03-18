package pl.danielrogoziński.samouczekProgramistyPodstawowe.metody;

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

        if (a*a + b*b == c*c) {
            return true;
        } else {
            return false;
        }
    }

    public double method7(double a) {
        double sqrt = Math.sqrt(a);
        return sqrt;
    }

    public int method6(int a) {
        return a*a*a;
    }

    public boolean method5(int a) {
        if (a % 3 == 0 && a % 5 ==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean method4(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int yourAge() {
        return 25;
    }

    public String yourName() {
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        return name;
    }

    public void method3(int a, int b) {
        System.out.println("sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product : " + a*b);
    }

}
