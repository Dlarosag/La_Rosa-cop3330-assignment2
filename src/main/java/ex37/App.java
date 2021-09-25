/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex37;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        char special[] = { '+', '-', '&', '|', '!', '(', ')', '{', '}', '[', ']', '^',
                 '*', '?', ':'};

        char deciNum[] = {'0','1','2','3','4','5','6','7','8','9'};

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        int length = 0, sp = 0, num = 0, lett = 0, i, j;

        String password;

        System.out.print("What's the minimum length? ");

        length = scnr.nextInt();

        System.out.print("How many special characters? ");

        sp = scnr.nextInt();

        System.out.print("How many numbers? ");

        num = scnr.nextInt();

        char[] list = new char[length];

        for(i = 0; i < length; i++)
        {
            j = rand.nextInt(3);

            if(sp > 0 && j == 0)
            {
                list[i] = special[rand.nextInt(14)];
                sp--;
                lett++;
            }

            else if(num > 0 && j == 1)
            {
                list[i] = deciNum[rand.nextInt(10)];
                num--;
                lett++;
            }
            if(j == 2 && lett > 0)
            {
                list[i] = alphabet[rand.nextInt(25)];
                lett--;

            }
        }
        System.out.print("Your password is ");

        for(i = 0; i < length; i++)
            System.out.print(list[i]);

    }
}
