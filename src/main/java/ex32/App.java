/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

public class App {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int diff, guess = -1, num = 0, attp = 0;

        String y;

        boolean retry = true;

        System.out.println("Let's play Guess the Number! ");

        while(retry) {

            attp = 0;

            System.out.println("Enter the difficulty level (1, 2, or 3): ");

            diff = scnr.nextInt();

            if (diff == 1)
                num = rand.nextInt(9) + 1;

            if (diff == 2)
                num = rand.nextInt(99) + 1;

            if (diff == 3)
                num = rand.nextInt(999) + 1;

            System.out.print("I have my number. What's your guess? ");

            while(guess != num) {

                guess = scnr.nextInt();

                attp ++;

                if (guess > num)
                    System.out.print("Too high. Guess again: ");

                if (guess < num)
                    System.out.print("Too low. Guess again: ");

                if (guess == num)
                    System.out.print("You got it in " + attp + " guesses!");


            }

            System.out.println("Do you wish to play again (Y/N)? ");

            y = scnr.next();

            if(y.equalsIgnoreCase("Y"))
                retry = true;
            else
                retry = false;

        }

    }
}
