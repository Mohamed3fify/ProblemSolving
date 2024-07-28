package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class K_MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long min;
        long max;

        min = num1;
        if (min > num2) min = num2;
        if (min > num3) min = num3;
        max = num3;
        if (max < num2) max = num2;
        if (max < num1) max = num1;

        System.out.println(min + " " + max);




    }
}
