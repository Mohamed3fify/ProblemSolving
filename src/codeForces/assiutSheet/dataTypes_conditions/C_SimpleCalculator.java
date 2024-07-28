package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class C_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long num1  = scanner.nextLong();
       long num2  = scanner.nextLong();
       long sum = num1 + num2;
       long mul = num1 * num2;
       long sub = num1 - num2;
        System.out.println(num1 + " " + "+" + " " + num2 + " " + "=" + " "  + sum);
        System.out.println(num1 + " " + "*" + " " + num2 + " " + "=" + " "  + mul);
        System.out.println(num1 + " " + "-" + " " + num2 + " " + "=" + " "  + sub);

    }
}

