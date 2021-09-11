package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        int fm;
        int hours;
        double bac;
        double totalAlcohol;
        double weight;
        double ratio = 0;
        String input = "abc";

        Scanner sc = new Scanner(System.in);

        while(!(input.equals("1") || input.equals("2")))
        {
            if(!(input.equals("1") || input.equals("2") || input.equals("abc")))
            {
                System.out.println("You must enter a 1 or 2.");
            }
            System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
            input = sc.nextLine();
        }

        fm = Integer.parseInt(input);

        if(fm == 1)
        {
            ratio = 0.73;
        }
        else if(fm == 2)
        {
            ratio = 0.66;
        }

        input = "no";

        while(!input.matches("[0123456789.]+"))
        {
            if(!input.matches("[0123456789.]+"))
            {
                System.out.println("You must enter a number.");
            }

            System.out.print("How many ounces of alcohol did you have? ");
            input = sc.nextLine();
        }

        totalAlcohol = Double.parseDouble(input);
        input = "no";

        while(!input.matches("[0123456789.]+"))
        {
            if(!input.matches("[0123456789.]+"))
            {
                System.out.println("You must enter a number.");
            }

            System.out.print("What is your weight in pounds? ");
            input = sc.nextLine();
        }

        weight = Double.parseDouble(input);
        input = "no";

        while(!input.matches("[0123456789.]+"))
        {
            if(!input.matches("[0123456789.]+"))
            {
                System.out.println("You must enter a number.");
            }

            System.out.print("How many hours has it been since your last drink? ");
            input = sc.nextLine();
        }

        hours = Integer.parseInt(input);
        bac = ((totalAlcohol * 5.14)/(weight * ratio)) - 0.015 * hours;
        System.out.println("Your BAC is " + bac);
        if(bac >= 0.8)
        {
            System.out.println("It is not legal for you to drive");
        }
        else
        {
            System.out.println("It is legal for you to drive");
        }

        sc.close();
    }
}
