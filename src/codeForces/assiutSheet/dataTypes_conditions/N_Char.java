package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class N_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int acsllNum = ch;
        if (acsllNum>=65 && acsllNum<=90) { // A to a
          ch = (char) (acsllNum + 32);
            System.out.println(ch);
        }

        if (acsllNum>=97 && acsllNum<=122) { // a to A
            ch = (char) (acsllNum - 32);
            System.out.println(ch);
        }
    }
}
