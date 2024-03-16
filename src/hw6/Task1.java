package hw6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        findingSmallestNum();
    }

    static void findingSmallestNum() {

        Scanner scanner = new Scanner(System.in);

        int[] numbs = new int[3];

        for (int i = 0; i < numbs.length; i++) {
            System.out.println("Select the the a number:");
            numbs[i] = scanner.nextInt();
        }

        int theSmallestNum = numbs[0];

        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] < theSmallestNum){
                theSmallestNum = numbs[i];
            }
        }

        System.out.println("The smallest number is:" + theSmallestNum );

    }
}
