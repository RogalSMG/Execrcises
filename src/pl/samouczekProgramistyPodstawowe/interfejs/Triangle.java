package pl.samouczekProgramistyPodstawowe.interfejs;

public class Triangle implements Figure {
    private final int side1;
    private final int side2;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public double getPerimeter() {
        return side1 + side2 + Math.sqrt(side1 * side1 + side2 * side2);
    }

    @Override
    public double getArea() {
        return side1 * side2 * 0.5;
    }
}
