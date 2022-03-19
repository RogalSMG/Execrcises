package pl.samouczekProgramistyPodstawowe.interfejs;

public interface Figure {

    double getPerimeter();

    double getArea();

    default String getName() {
        return "name";
    }

}
