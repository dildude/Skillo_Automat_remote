package hw6;

import java.util.Scanner;

public class Task2 {

    static void avrOf3Num (){

        Scanner scanner = new Scanner(System.in);

        Double[] numbs = new Double[3];

        for (int i = 0; i < numbs.length; i++) {
            System.out.println("Select a number:");
            numbs[i] = scanner.nextDouble();
        }

        double avrSum = 0;

        for (double num : numbs){
            avrSum += num;
        }

        System.out.println("The Average sum is: " + avrSum /3);

    }

    public static void main(String[] args) {

        avrOf3Num();

    }
}

