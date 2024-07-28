package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class R_AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

         long years =  num / 365 ;
         System.out.println(years + " " + "years");

         long yearsToDays = (years * 365);
         long months = (num - yearsToDays) / 30  ;
         System.out.println(months + " " + "months");

         long days = num - ((years * 365) + (months * 30)) ;
         System.out.println(days + " " + "days");

    }
}
