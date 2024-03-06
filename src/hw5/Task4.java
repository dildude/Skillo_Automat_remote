package hw5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. To give a size of the array
        System.out.println("Choose how big the array will be");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];

        //2. To fill the array
        System.out.println("Fill the Array");
        for (int i = 0; i < arrSize ; i++) {
            array[i]= scanner.nextInt();
        }

        int theLargestNum = array[0];

        //3. Going thru the array and compare numbers
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > theLargestNum){
                theLargestNum = array[i];
            }
        }

        System.out.println("The Largest number in the array is: " + theLargestNum);
    }
}
