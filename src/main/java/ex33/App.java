/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        String list[] = {"Yes", "No", "Maybe", "Ask again later" };

        System.out.println("What's your question? ");

        System.out.print(">");

        scnr.next();

        System.out.print("\n" + list[rand.nextInt(4)]);
    }
}
