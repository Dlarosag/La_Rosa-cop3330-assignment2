/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David La Rosa
 */
package ex39;

import java.util.*;


public class App {

    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();



        map.put("Michaela Michaelson  ", "District Manager   ");
        map.put("Jake Jacobson        ", "Programmer         ");
        map.put("Jacquelyn Jackson    ", "DBA                ");
        map.put("Sally Webber         ", "Web Developer      ");
        map.put("Name                 ", "Position           ");
        map.put("--------------------", "-------------------");
        map.put("John Johnson         ", "Manager            ");
        map.put("Tou Xiong            ", "Software Engineer  ");


               System.out.println("Name                 " + "|" + map.get("Name                 ") + "|" + " Separation Date" +
                                 "\n---------------------" + "|" + map.get("--------------------") + "|" + "----------------" +
                               "\nJacquelyn Jackson    " + "|" + map.get("Jacquelyn Jackson    ") + "|" + "" +
                               "\nJake Jacobson        " + "|" + map.get("Jake Jacobson        ") + "|" + "" +
                               "\nJohn Johnson         " + "|" + map.get("John Johnson         ") + "|" + "2016-12-31" +
                       "\nMichaela Michaelson  " + "|" + map.get("Michaela Michaelson  ") + "|" + "2015-12-19" +
                       "\nSally Webber         " + "|" + map.get("Sally Webber         ")+ "|" + "2015-12-18" +
                       "\nTou Xiong            " + "|" + map.get("Tou Xiong            ")  + "|" + "2016-10-05"
                            );
    }
}
