package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class D_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long num4 = scanner.nextLong();
        long Difference  = (num1 * num2) - (num3 * num4);

        System.out.println("Difference = " + Difference);

    }
}
