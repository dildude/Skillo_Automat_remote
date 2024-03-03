package hw4;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Input price:");
        double price = scanner.nextDouble();

        double revenue = 0.0;
        double discount = 0.0;

        if (quantity <= 100){
            revenue = quantity * price;
            System.out.println("The revenue from sale is: " + revenue + "$ Discount: Non");

        } else if (quantity > 100 && quantity <= 120) {
            discount = price * 0.15;
            price = price * 0.85; // dicounted price

            revenue = quantity * price;
            System.out.println("The revenue from sale is: "+ revenue + "$ Discount: " + discount + "$(15%)"  );

        }else {
            discount = price * 0.2;
            price = price * 0.80; // dicounted price

            revenue = quantity * price;
            System.out.println("The revenue from sale is: "+ revenue + "$ Discount: " + discount + "$(20%)"  );
            // discount 20
        }

    }
}
