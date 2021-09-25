/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex34;

import java.util.Scanner;

public class App {


    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int i;

        String remove;

        String newL[]= {"", "", "","", ""} , list[] = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.println("There are 5 employees:");

        for(i = 0; i< 5; i++)
            System.out.println(list[i]);

        System.out.println("Enter an employee name to remove: ");

        remove = scnr.nextLine();

        for(i = 0; i< 5; i++) {

            if (!list[i].equals(remove))
                newL[i] = list[i];
        }

        for(i = 0; i< 5; i++)
            System.out.println(newL[i]);

    }
}
