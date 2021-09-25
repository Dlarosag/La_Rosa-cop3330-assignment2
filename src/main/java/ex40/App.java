/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex40;

import java.util.*;

public class App {

    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);

        String search, data;

        int i, found = 0;

        Map<String, String> map = new HashMap<String, String>();



        map.put("Michaela Michaelson", "District Manager   ");
        map.put("Jake Jacobson", "Programmer         ");
        map.put("Jacquelyn Jackson", "DBA                ");
        map.put("Sally Webber", "Web Developer      ");
        map.put("Name", "Position           ");
        map.put("--------------------", "-------------------------");
        map.put("John Johnson", "Manager            ");
        map.put("Tou Xiong", "Software Engineer  ");


        System.out.print("Enter a search string: ");

        search = scnr.next();

        System.out.println("Results: ");

        System.out.println("Name                 " + "|" + "Position                 " + "|" + " Separation Date" +
                "\n---------------------" + "|" + map.get("--------------------") + "|" + "----------------"
           );



        data = map.toString();

        String elements[] = data.split(" ");





             for(i = 0; i < elements.length; i++)
             {
                 if(elements[i].contains(search) && i % 2 == 0) {

                     String position[] = elements[i + 1].split("=");

                     if(elements[i].contains("="))
                         found++;

                     else
                     System.out.println(elements[i].replace("{", "") + " " + position[0] + "           | " + map.get(elements[i].replace("{", "") + " " + position[0]));

                 i++;
                 i++;

                 }
                 if(elements[i].contains(search) && i % 2 != 0){




                    System.out.println(elements[i].replace("=", "") + " " + elements[i+1].replace("=", "    |     "));


                     i++;

             }}
    }
}
