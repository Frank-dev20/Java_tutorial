package loanApp;

import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Please enter a loan amount ");
        double loanAmount = input.nextDouble();

        System.out.println("Please enter annual interest rate ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Please enter number of years ");
        int numberOfYears = input.nextInt();

        Loan loan1 = new Loan( loanAmount, annualInterestRate,numberOfYears);

        System.out.printf("The loan was created on %s\n"+ "The monthly payment is %.2f\nthe total payment is %.2f\n", loan1.getLoanDate().toString(),loan1.getMonthlyPayment(), loan1.getTotalPayment());
    }
}
