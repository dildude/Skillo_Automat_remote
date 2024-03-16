package hw8.taskOne;

public class Square extends Shape{

    @Override
    public double getArea(double side) {

        return side * 2;
    }

    @Override
    public double getPerimeter(double side) {
        return 4 * side;
    }

    public String toString(){
        return "Square";
    }
}
