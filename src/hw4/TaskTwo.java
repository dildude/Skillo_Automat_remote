package hw4;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte age = scanner.nextByte();

        if (age >= 16 && age < 73 ){
            System.out.println("You are eligible to work");
        }else {
            System.out.println("You are not eligible to work");
        }

    }
}
