package pl.danielrogoziński.samouczekProgramistyPodstawowe.interfejs;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramFigure {

    ArrayList<Figure> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void doAll() {
        makeCircle();
        displayParametersOfObjectsOnList();
        makeTriangle();
        displayParametersOfObjectsOnList();
        makeRectangle();
        displayParametersOfObjectsOnList();
    }

    private void makeRectangle() {
        System.out.println("Give length of rectangle first side: ");
        int side1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give length of rectangle second side: ");
        int side2 = Integer.parseInt(scan.nextLine());

        Rectangle rectangle = new Rectangle(side1, side2);
        list.add(rectangle);
    }

    public void makeCircle() {
        System.out.println("Give length of diameter: ");
        int diameter = Integer.parseInt(scan.nextLine());

        Circle circle = new Circle(diameter);
        list.add(circle);
    }

    public void makeTriangle() {
        System.out.println("Give length of triangle first side: ");
        int side1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give length of triangle second side: ");
        int side2 = Integer.parseInt(scan.nextLine());

        Triangle triangle = new Triangle(side1, side2);
        list.add(triangle);
    }

    public void displayParametersOfObjectsOnList() {
        System.out.println("---");
        for (Figure kupoa : list) {
            System.out.println("Object nr: " + (list.indexOf(kupoa) + 1));
            System.out.println(kupoa.getName());
            System.out.println("Area: " + kupoa.getArea());
            System.out.println("Perimeter: " + kupoa.getPerimeter());

            System.out.println("");
        }
    }
}
