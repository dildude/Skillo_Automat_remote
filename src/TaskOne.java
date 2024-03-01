import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a num between 1-7");

        byte userInput = scanner.nextByte();

        if (userInput >= 1 && userInput <= 7){

            switch (userInput){
                case 1:
                    System.out.println("The 1st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("The 2nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("The 3rd day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("The 4th day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("The 5th day of the week is Friday");
                    break;
                case 6:
                    System.out.println("The 6th day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("The 7th day of the week is Sunday");
                    break;
            }

        }else {
            System.out.println("You haven't select a correct input");
        }


    }
}
