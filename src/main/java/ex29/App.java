/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int years, r = 0, i = 0;

        while(r < 1)
        {
            System.out.print("What is the rate of return? ");


                try {

                    r = scnr.nextInt();

                } catch (java.util.InputMismatchException e) {
                    System.out.print("Sorry. That's not a valid input. \n");

                    r++;

                }

                if (r < 1)
                    System.out.print("Sorry. That's not a valid input. \n");

        }
        years = 72 / r;

        System.out.print("It will take " + years +" years to double your initial investment." );

    }
}
