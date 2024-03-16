package hw8.taskOne;

public class Circle extends Shape{

    @Override
    public double getArea(double radius) {

        return Math.PI * radius * radius;

    }

    @Override
    public double getPerimeter(double radius) {

        return 2 * Math.PI * radius;

    }
    public String toString() {
        return "Circle";
    }

}
