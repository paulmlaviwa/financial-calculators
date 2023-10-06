package com.pluralsight;
import java.util.Scanner;

public class mortgage_calculator {


    public static void main() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your Loan Amount (P): ");
        double principal = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.printf("Loan Amount is $%.2f \n", principal);

        System.out.print("Enter your interest rate (in percentage): ");
        double annualInterestRate = myScanner.nextDouble();
        System.out.printf("Interest is %.2f%% \n", annualInterestRate);

        System.out.print("Enter your loan length in months (L): ");
        double loanTerm = myScanner.nextDouble();
        System.out.printf("The length of your loan is %.2f months \n", loanTerm);

        double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, loanTerm);
        System.out.printf("Your monthly payment is $%.2f \n", monthlyPayment);

        double totalInterest = (monthlyPayment * loanTerm) - principal;
        System.out.printf("Total interest paid over the life of the loan is $%.2f \n", totalInterest);
    }
    public static double calculateMonthlyPayment(double principal, double annualInterestRate, double loanTerm){
        double monthlyPayment = 0;
        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        return monthlyPayment;
    }


}