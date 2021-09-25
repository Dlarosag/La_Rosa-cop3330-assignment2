/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex24;

import java.util.Scanner;

public class App {

    public static boolean isAnagram(String word1, String word2)
    {
        int i, j, point = 0;

        for(i = 0; i < word1.length(); i++ ) {

            for(j = 0; j < word1.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {
                    point++;
                    break;
                }
            }
        }
        if(point == word1.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String word1, word2;
        int i = 0;
        boolean apply;

        System.out.println("Enter two strings and I will tell you if they are anagrams: ");

        do {

            System.out.print("Enter the first string: ");

            word1 = scnr.next();

            System.out.print("Enter the second string: ");

            word2 = scnr.next();

            if (word1.length() != word2.length())
                System.out.println("Please insert words of the same length");
            else
                i++;
            } while(i < 1);

            apply = isAnagram(word1, word2);

            if(apply == true)
                System.out.print("It is an Anagram!");
            else
                System.out.print("It is not an Anagram!");




    }
}