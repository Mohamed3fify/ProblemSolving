package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class T_SortingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long getMax = Math.max(num1 , Math.max(num2 , num3));
        long getMin = Math.min(num1 , Math.min(num2 , num3));
        long getMid = (num1 + num2 + num3) - (getMax + getMin);

        System.out.println(getMin + "\n" + getMid + "\n" + getMax);
        System.out.println();
        System.out.println(num1 + "\n" + num2 + "\n" + num3);


    }
}
