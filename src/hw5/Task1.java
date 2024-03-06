package hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayElem = {30, 51, 676, 3, 8440, 69};

        System.out.println("Select the position of the array element one:");
        int elemOne = Math.abs(scanner.nextInt());


        if (elemOne <= arrayElem.length -1) {
            System.out.println("The elemTwo of the array elements is: " + arrayElem[elemOne]);
        }else {
            System.out.println("Incorrect position");
        }

        System.out.println("Select the position of the array element two:");
        int elemTwo = Math.abs(scanner.nextInt());


        if (elemTwo <= arrayElem.length -1) {
            System.out.println("The elemTwo of the array elements is: " + arrayElem[elemTwo]);
        }else {
            System.out.println("Incorrect position");
        }

        int elemSum = arrayElem[elemOne] + arrayElem[elemTwo];

        System.out.println("The sum of the two elements in the array is: " + elemSum);
    }
}
