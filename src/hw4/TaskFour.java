package hw4;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        /* This is number 5 form the TaskConditions */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of vacation are you interested in (Beach or Mountain)?");
        String vacationType = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison

        System.out.println("What is your budget per day per person?");
        int budgetPerDay = scanner.nextInt();

        String destination;

        switch (vacationType) {
            case "BEACH":
                destination = (budgetPerDay < 50) ? "Bulgaria" : "Outside Bulgaria";
                break;
            case "MOUNTAIN":
                destination = (budgetPerDay < 30) ? "Bulgaria" : "Outside Bulgaria";
                break;
            default:
                destination = "No information available for this type of vacation.";
        }

        System.out.println("Recommended destination for " + vacationType + " vacation with $" + budgetPerDay + " per day: " + destination);

    }
}
