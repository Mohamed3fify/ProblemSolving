package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class H_TowNumbers {
    // Floor - Ciel - Round
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        System.out.println("floor" + " " +num1 + " / " +num2 + " = " +Math.floorDiv(num1,num2));
        System.out.println("ceil" + " " +num1 + " / " +num2 + " = " +Math.ceilDiv(num1,num2));
        System.out.println("round" + " " +num1 + " / " +num2 + " = " +Math.round((double) num1 /num2));


    }
}
