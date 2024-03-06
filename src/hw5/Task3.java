package hw5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Get number of rows and columns from user
        System.out.println("Select how many rows the array to have");
        int rows = scanner.nextInt();
        System.out.println("Select how many columns the array to have");
        int columns = scanner.nextInt();

        // 2. Declare and initialize the matrix with user-provided dimensions
        int [][] dynamArray = new int[rows][columns];

        // 3. Get user input for each element
        System.out.println("Enter the matrix elements (row-wise): ");
        for (int i = 0; i < rows  ; i++) {
            for (int j = 0; j < columns ; j++) {
                dynamArray[i][j] = scanner.nextInt();
            }

        }
        // 4. Print the matrix elements
        System.out.println("The matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(dynamArray[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
