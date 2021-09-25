/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex26;

import ex25.PaymentCalculator;

import java.util.Scanner;



public class App {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        PaymentCalculator month = new PaymentCalculator();

        double balance, payment, apr;

        int  time;

        System.out.print("What is your balance? ");

        balance = (double) scnr.nextInt() ;

        System.out.print("What is the APR on the card (as a percent)? ");

        apr = (scnr.nextInt() / 100.0) /365.0;

        System.out.print("What is the monthly payment you can make? ");

        payment = (double) scnr.nextInt();

        time = month.calculateMonthsUntilPaidOff(balance, apr, payment);

        System.out.print("It will take you " + time + " months to pay off this card.");

    }
}