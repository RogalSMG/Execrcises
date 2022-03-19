package pl.samouczekProgramistyPodstawowe.obiektyIPakiety;

public class Rectangle {
    int length;
    int wide;

    public Rectangle(int length, int wide) {
        this.length = length;
        this.wide = wide;
    }

    public int area() {
        return this.length * this.wide;
    }

    public int circumference() {
        return (length + wide) * 2;
    }

    public double diagonal() {
        return (Math.sqrt(length * length + wide * wide));
    }
}
