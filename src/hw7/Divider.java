package hw7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Select first number");
            int num1 = scanner.nextInt();

            System.out.println("Select second number");
            int num2 = scanner.nextInt();

            if (num2 == 0){
                throw new ArithmeticException("Division by 0 is not possible");
            }

            double result =(float) num1 / num2;
            System.out.println("The result is: " + result);
        }catch (InputMismatchException e){
            System.out.println("Wrong input value. Please enter integers only.");
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
