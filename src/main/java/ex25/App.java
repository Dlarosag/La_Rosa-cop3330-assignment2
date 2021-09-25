/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex25;

import java.util.Scanner;



public class App {

    public static int passwordValidaror(String word)
    {
        char numbers[]= {'0', '1', '2', '3', '4', '5', '6', '7', '8' ,'9' };

        int num = 0, ch = 0, sp = 0, i, j;

        //loop to read string characters

        for(i = 0; i < word.length(); i++)
        {
            for(j = 0; j < 10; j++) {

                if (word.charAt(i) == numbers[j])
                    num++;
            }

                 if ((int)word.charAt(i) < 48 || (((int)word.charAt(i) > 57 ) && (int)word.charAt(i) < 65)|| (((int)word.charAt(i) > 90 ) && (int)word.charAt(i) < 97)|| (int)word.charAt(i) < 122)
                    sp++;

                else ch++;



        }

        //determines the password strength

        if(word.length() < 8)
        {
            if(num == word.length())
                return 0;

            else
                return 1;
        }
        if(sp > 0 && num > 0 && ch > 0)
            return 2;

        else
            return 3;

    }

    public static void main(String[] args)
    {
        String password;

        int strenght;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Insert your new password: ");

        password = scnr.next();

        strenght = passwordValidaror(password);

        if(strenght ==1)
            System.out.print("The password '" + password + "' is a weak password");

        if(strenght == 0)
            System.out.print("The password '" + password + "' is a very weak password");

        if(strenght == 2)
            System.out.print("The password '" + password + "' is a strong password");

        if(strenght == 3)
            System.out.print("The password '" + password + "' is a very strong password");







        
    }
}
