import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 // 1. Store your names in 3 different variables and print your whole name

//        String firstName = scanner.next();
//        String midName = scanner.next();
//        String lastName = scanner.next();
//
//        System.out.println(firstName + " " + midName + " " + lastName);

// ---------------------------------------------------
// 2. Print the perimeter of a triangle by given sides. Use formula to calculate it.

//        double sideA = scanner.nextDouble();
//        double sideB = scanner.nextDouble();
//        double sideC = scanner.nextDouble();
//
//        double perimeter = sideA + sideB + sideC;
//
//        System.out.println("This is the perimeter: " + perimeter);
//
//---------------------------------------------------
// 3. Print the area of a triangle by given sides. Use formula to calculate it.

//        double base = scanner.nextDouble();
//        double height = scanner.nextDouble();
//
//        double calculation = (base * height) / 2;
//
//        System.out.println("The area is: " + calculation);

//---------------------------------------------------
// 4. Print pine tree using asterisks in the console

//        int size = scanner.nextInt(); // Adjust the size of the tree as needed
//
//        // Printing the tree body
//        for (int i = 0; i < size; i++) { // This loop controls the number of rows in the pine tree. It starts from 0 and continues until i is less than size, incrementing i by 1 in each iteration. The size variable determines how tall the tree will be.
//            for (int j = 0; j < size - i - 1; j++) { // This loop prints spaces before the asterisks to properly align them and create the triangular shape of the tree. The number of spaces decreases as we move from the top to the bottom of the tree.
//                System.out.print(" "); // Printing spaces
//            }
//            for (int k = 0; k < 2 * i + 1; k++) { // his loop prints the asterisks that form the branches of the tree. The number of asterisks in each row follows a pattern: 2 * i + 1. As i increases, the number of asterisks in each row also increases, creating the wider base of the tree.
//                System.out.print("*"); // Printing asterisks
//            }
//            System.out.println(); // Moving to the next line
//        }

//6. Write a simple program to convert minutes into years and days.

        int min = scanner.nextInt();

        int years = min / 525600;
        int remainMin = min % 525600;
        int days = remainMin / 1440;

        System.out.println(min + " min = " + years + " years and " + days + " days.");





    }
}
