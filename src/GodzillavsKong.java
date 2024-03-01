import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        double budget = scaner.nextDouble();
        double numOfStatists = scaner.nextDouble();
        double oneCostumePrise = scaner.nextDouble();

        double filmDecor = budget * 0.1; // 10% of the budget
        double allCostumePrise = numOfStatists * oneCostumePrise; // whole prise of the costumes


        if (numOfStatists > 150){
            allCostumePrise = allCostumePrise *0.9;
        }

        double theCost = filmDecor + allCostumePrise;


        if (theCost <= budget){

            double moneyLeft = budget - theCost ;

            System.out.println("Action!");
            System.out.println("Wingard starts filming with "+ String.format("%.2f",moneyLeft) +" leva left.");

        }else {

            double moneyLeft = theCost - budget;

            System.out.println("Not enough money!");
            System.out.println("Wingard needs " + String.format("%.2f",moneyLeft) +" leva more.");

        }



    }
}
