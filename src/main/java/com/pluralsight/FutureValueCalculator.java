package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {

    public static void main() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your initial deposit: $");
        double initialDeposit = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = myScanner.nextDouble() / 100; // Convert percentage to decimal
        myScanner.nextLine();

        System.out.print("Enter the number of years: ");
        int numberOfYears = myScanner.nextInt();

        double futureValue = calculateFutureValue(initialDeposit, annualInterestRate, numberOfYears);
        double totalInterestEarned = futureValue - initialDeposit;

        System.out.printf("If you deposit $%.2f in a CD that earns %.2f%% interest and matures in %d years, your CD's ending balance will be $%.2f%n", initialDeposit, annualInterestRate * 100, numberOfYears, futureValue);
        System.out.printf("You would have earned $%.2f in interest%n", totalInterestEarned);
    }

    public static double calculateFutureValue(double initialDeposit, double annualInterestRate, int numberOfYears) {
        double future_value;
        future_value = initialDeposit * Math.pow(1 + (annualInterestRate / 365), numberOfYears * 365);
        return future_value;
    }
}
