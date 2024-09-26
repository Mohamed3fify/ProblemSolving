package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class B_PrintFrom_1_ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); int count = 0;
        printFromOneToN(num , count);
    }

    private static void printFromOneToN(int num , int count) {
        count++;
        if (count > num) return;
        System.out.println(count);
        printFromOneToN(num , count);

    }
}
