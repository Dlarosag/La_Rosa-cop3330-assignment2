/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex27;

import java.util.Scanner;

public class App {

    public static int validateFirst(String word)
    {
        if(word.length() < 3){
            System.out.println("The first name must be at least 2 characters long.");
            return 0;
        }


        else if(word.charAt(0) == '\0') {
            System.out.println("The first name must be filled in");
            return 0;
        }
        else return 1;

    }

    public static int validateLast(String word)
    {
        if(word.length() < 3){
            System.out.println("The Last name must be at least 2 characters long.");
            return 0;
        }


        else if(word.charAt(0) == '\0') {
            System.out.println("The Last name must be filled in");
            return 0;
        }
        else return 1;

    }
    public static int validateZip(int code)
    {


        if(code < 10000) {
            System.out.println("The zipcode must be a 5 digit number.");
            return 0;
        }
        else return 1;

    }
    public static int validateID(String word)
    {


        if(word.length() < 7) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return 0;
        }
        else return 1;

    }

    public static void validateInput(String first, String last, int zip, String id)
    {
        int error = 0;

        if(validateFirst(first) == 0)
            error++;

        if(validateLast(last) == 0)
            error++;

        if(validateZip(zip) == 0)
            error++;
        if(validateID(id) == 0)
            error++;

        if(error == 0)
            System.out.print("There were no errors found.");


    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String first, last, id;
        int zip;

        System.out.print("Enter the first name: ");

        first = scnr.next();

        System.out.print("Enter the last name: ");

        last = scnr.next();

        System.out.print("Enter the ZIP code: ");

        zip = scnr.nextInt();

        System.out.print("Enter the employee ID: ");

        id = scnr.next();

        validateInput(first, last, zip, id);




    }
}
