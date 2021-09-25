/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex35;

import java.util.Scanner;
import java.util.Random;

public class App {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int i, p;

        String list[] = {"", "", "", "", "", ""};

        for(i = 0; i < 6; i++){

            System.out.print("Enter a name: ");

            list[i] = scnr.next();
        }

        p = rand.nextInt(6);

        if(!list[p].equals(""))
            System.out.print("The winner is. . . " + list[p]);
    }
}
