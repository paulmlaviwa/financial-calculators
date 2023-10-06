package com.pluralsight;
import java.util.Scanner;
public class financial_calculators {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Which calculator do you want to use? ");
        System.out.println("1 - Mortgage. 2 - Future Value: ");
        int calculatorSelected = myScanner.nextInt();

        if (calculatorSelected == 1){
            mortgage_calculator myCalculator = new mortgage_calculator();
            myCalculator.main();
        }
        else if (calculatorSelected == 2){
            future_value_calculator myCalculator = new future_value_calculator();
            myCalculator.main();
        }
        else {
            System.out.println("Please select a valid number!");
        }
    }
}
