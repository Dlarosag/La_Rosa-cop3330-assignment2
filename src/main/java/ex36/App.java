/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex36;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static double average(int list[], int length)
    {
        double total = 0;
        int i;

        for(i=0; i < length; i++)
            total += list[i];

        total = total / length;

        return total;
    }

    public static double std(int list[], int length)
    {
        int i;

        double average, std = 0;

        average = average(list, length);

        for(i=0; i < length; i++)
            std += Math.pow(i - average, 2);

        return Math.sqrt(std / length);
    }

    public static int max(int list[], int length)
    {
        int i, max =0;

        for(i=0; i < length; i++)
            if(max < list[i])
                max = list[i];


        return max;

    }

    public static int min(int list[], int length)
    {
        int i, min = list[0];

        for(i=0; i < length; i++)
            if(min > list[i])
                min = list[i];

        return min;
    }


    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int list[] = {0, 0, 0, 0, 0 , 0, 0, 0}, i = 0, count = 0;

        double average = 0.0;

        while(true)
        {
            System.out.print("Enter a number: ");

            try {

                list[i] = scnr.nextInt();
                count ++;

            }catch(java.util.InputMismatchException e)
            {
                break;
            }


            i++;
        }

        System.out.print("Numbers: ");

        for(i = 0; i < list.length; i++) {
            if(list[i] != 0)
            System.out.print(list[i] + " ");

        }

        System.out.println("\nThe average is " + average(list, count));

        System.out.println("The min is " + min(list, count));

        System.out.println("The max is " + max(list, count));

        System.out.print("The standard deviation is ");

        System.out.printf("%.2f", std(list,count));


        ///Finish std function and place inputs






    }
}
