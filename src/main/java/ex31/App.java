/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int pulse, age, target = 0,  i;

        double percent = 0.0;


        System.out.print("Resting Pulse: ");

        pulse = scnr.nextInt();

        System.out.print("Age: ");

        age = scnr.nextInt();


        System.out.println("\nIntensity  | Rate");

        System.out.println("--------------------");

        for(i = 55; i < 96; i++) {

            target = (int) (((220 - age) - pulse) * (i / 100.00)) + pulse;

            System.out.println((i) + "%          |  " + target + "bpm");

        }

    }
}
