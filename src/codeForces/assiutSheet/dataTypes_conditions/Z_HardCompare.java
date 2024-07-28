package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class Z_HardCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();

        double pow1 = num2 * Math.log(num1); // == num1 power num2
        double pow2 = num4 * Math.log(num3);  // == num3 power num4

        if (pow1> pow2) System.out.println("YES");
        else System.out.println("NO");
    }
}
