package hw8.taskOne;

public class FinalResult {
    public static void main(String[] args) {
        Circle s1 = new Circle();
        System.out.println("The Area is: " + s1.getArea(3.0));
        System.out.println(s1);
        System.out.println();

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println("The Area is: " + s2.getArea(3.0));
        System.out.println(s2);
        System.out.println();

        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3);
        System.out.println("The circumference is: " + s2.getPerimeter(3.0));
        System.out.println();


        Square s5 = new Square();
        System.out.println(s5);
        System.out.println("The Area is: " + s5.getArea(6.0));
        System.out.println("The circumference is: " + s5.getPerimeter(6.0));
    }
}
