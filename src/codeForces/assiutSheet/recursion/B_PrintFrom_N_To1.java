package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class B_PrintFrom_N_To1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printFromNToOne(num);
    }

    private static void printFromNToOne(int num) {
        if (num < 1) return;
        if (num == 1) System.out.print(num);
        else System.out.print(num + " ");
        printFromNToOne(num - 1);

    }
}
