/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int i, sum = 0;

        for(i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");

            sum += scnr.nextInt();;

        }
        System.out.print("The total is " + sum);
    }
}
