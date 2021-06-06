package ex06.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Calendar;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String str1 = input.nextLine();
        int currAge = Integer.parseInt(str1);

        System.out.print("At what age would you like to retire? ");
        String str2 = input.nextLine();
        int retireAge = Integer.parseInt(str2);

        int yrLeft = retireAge - currAge;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currYear + yrLeft;

        String outputString1 = "You have " + yrLeft + " years left until you can retire.";
        String outputString2 = "It's " + currYear + " so you can retire in " + retireYear + ".";

        System.out.println(outputString1);
        System.out.println(outputString2);
    }
}
