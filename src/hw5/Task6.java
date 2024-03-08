package hw5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {10, 5, 6, 20},
                {1, 10, 20, 4},
                {11, 20, 10, 14},
                {20, 24, 25, 10}
        };
        int matrixSize = 4;


        int diagonal = 0;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    diagonal += matrix[i][j];
                }
            }
        }
        System.out.println("The diagonal is: " + diagonal);
    }
}
