package pl.samouczekProgramistyPodstawowe.obiektyIPakiety;

public class MyNumber {
    private final double value;

    public MyNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(value);
    }

    public MyNumber pow(MyNumber otherValue) {
        return new MyNumber(Math.pow(value, otherValue.value));
    }

    public MyNumber add(MyNumber otherValue) {
        return new MyNumber(value + otherValue.value);
    }

    public MyNumber subtract(MyNumber otherValue) {
        return new MyNumber(value - otherValue.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
