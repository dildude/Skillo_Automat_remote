package hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] twoDArray = {
                {10, 20, 30},
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}
        };

        System.out.println("Select row position:");
        int rowPosit = Math.abs(scanner.nextInt());

        if (rowPosit < twoDArray.length -1){
            System.out.println("The element in the selected position is: " + rowPosit);
        }else {
            System.out.println("Wrong input");
        }

        System.out.println("Select row position:");
        int columPosit = Math.abs(scanner.nextInt());

        if (columPosit < twoDArray.length -1){
            System.out.println("The element in the selected position is: " + columPosit);
        }else {
            System.out.println("Wrong input");
        }

    }
}
