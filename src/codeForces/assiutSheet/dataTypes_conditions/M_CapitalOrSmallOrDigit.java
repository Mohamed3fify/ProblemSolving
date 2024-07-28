package codeForces.assiutSheet.dataTypes_conditions;


import java.util.Scanner;

public class M_CapitalOrSmallOrDigit {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int acsllNum = ch;
        if (acsllNum>=48 && acsllNum<=57) System.out.println("IS DIGIT");
        if (acsllNum>=65 && acsllNum<=90) System.out.println("ALPHA\n" + "IS CAPITAL");
        if (acsllNum>=97 && acsllNum<=122) System.out.println("ALPHA\n" + "IS SMALL");


    }
}
