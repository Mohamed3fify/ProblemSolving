package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class J_Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        if (num1 % num2 == 0 || num2%num1 == 0) System.out.println("Multiples");
        else System.out.println("No Multiples");
    }
}
