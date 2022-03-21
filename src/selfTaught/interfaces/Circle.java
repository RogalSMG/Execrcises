package selfTaught.interfaces;

public class Circle implements Figure {
    private final int radius;

    public Circle(int diameter) {
        this.radius = diameter;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
