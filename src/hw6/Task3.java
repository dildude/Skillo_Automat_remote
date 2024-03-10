package hw6;

import java.util.Scanner;

public class Task3 {

    static void displayingMidChar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String theWord = scanner.nextLine();

        char[] charArrayForTheWord = theWord.toCharArray();

        if (theWord.length() % 2 == 0){
            int firstMidChar = theWord.length() / 2;
            int secondMidChar = theWord.length() / 2 - 1;



            System.out.println("The mid 2 char in an even length word are: " + charArrayForTheWord[firstMidChar] + " " + charArrayForTheWord[secondMidChar]);
        }else {
            int midChar = theWord.length() / 2;
            System.out.println("The mid char is: " + charArrayForTheWord[midChar]);
        }

    }

    public static void main(String[] args) {

        displayingMidChar();

    }
}
