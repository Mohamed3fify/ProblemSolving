package codeForces.assiutSheet.function;

import java.util.Scanner;

public class H_N_Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i = 1; i <= numberOfTestCases; i++){
            int number = scanner.nextInt();
            char ch = scanner.next().charAt(0);
            int count = 1 ;
            printNumberTimes(number , ch , count);
            System.out.println();
        }

    }

    private static void printNumberTimes(int number, char ch , int count) {
        if (count > number) return;
        System.out.print(ch + " ");
        count++;
        printNumberTimes(number ,ch ,count);
    }
}
