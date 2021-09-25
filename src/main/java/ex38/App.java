/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex38;

import java.util.Scanner;

public class App {

    public static int[] filterEvenNumbers(int list[])
    {
        int[] num = new int[list.length];

        int i, j = 0;

        for(i = 0; i < list.length; i++)
        {
            if(list[i] % 2 == 0)
            {
                num[j] = list[i];
                j++;
            }

        }
        return num;
    }

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int i;

        String list;

        System.out.print("Enter a list of numbers, separated by spaces: ");

        list = scnr.nextLine();

        int[] num = new int[list.length()];

        for(i = 0; i < list.length(); i++)
        {
            num[i] = Character.getNumericValue(list.charAt(i));
        }

        System.out.print("The even numbers are ");

        int[] even = new int[num.length];

        even =filterEvenNumbers(num);

        for(i = 0; i < num.length; i++)
        {
            if(even[i] != 0)
            System.out.print(even[i] + " ");
        }

    }

}
