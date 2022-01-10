package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();

        //monthly interest rate what ever is inputted divided by 10 divided by 12
        // NUMBER OF PAYMENTS (N) = period * 12
        // p = principal, r = Monthly interestRate, n = number of payments
        // m = P * ( r(r+1)^n)  / (( 1+r)^n) -1 )
        // monthly interest rate is calculated by dividing interest rate by 100 (to convert it into a decimal) then its divided by 12 (number of momths in a year).
        double monthlyInterestRate = (annualInterestRate /  Percent) / monthsInYear;
        // number of payments is calculated by multiplying period(years loan is taken out ) by 12 (months in a year)
        double numberOfPayments = period * monthsInYear;
        double mortgage = principal * ((monthlyInterestRate * Math.pow((1+monthlyInterestRate),numberOfPayments))/ ( Math.pow((1+monthlyInterestRate), numberOfPayments) -1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);










    }
}
