package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to validate:");
        String input = scanner.nextLine();
        char[] inpuyArray = input.toCharArray();
        char[] reservsedInput = new char[inpuyArray.length];
        boolean isEqual = true;

        for (int i = inpuyArray.length - 1, j = 0; i >= 0 ; i--, j++) {
            reservsedInput[j] = inpuyArray[i];
        }
        for (int i = 0; i < inpuyArray.length; i++) {
            if (inpuyArray[i] != reservsedInput[i]){
                isEqual = false;
                break;
            }

        }
        if (isEqual){
            System.out.println("The word is palindrom");
        }else {
            System.out.println("The word is not");
        }


//        boolean isPalindrome = true;
//        int left = 0;
//        int right = input.length() - 1;
//        while (left < right) {
//            if (input.charAt(left) != input.charAt(right)) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//
//        if (isPalindrome) {
//            System.out.println(input + " is a palindrome");
//        } else {
//            System.out.println(input + " is not a palindrome");
//        }
    }
}

