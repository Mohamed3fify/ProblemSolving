package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class D_PrintDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i = 1; i <= numberOfTestCases; i++) {

            long num = scanner.nextLong();
            if (num == 0) System.out.print(0 + " ");
            else {
                int numOfDigits = (int) (Math.log10(num)) + 1;

                printDigits(num, numOfDigits - 1);
            }

            System.out.println();
        }
    }

    private static void printDigits(long num, int numOfDigits) {


        System.out.print(getFirstDigit(num, numOfDigits) % 10 + " ");
        if (numOfDigits == 0) return;
        printDigits(num, numOfDigits - 1);

    }

    public static long getFirstDigit(long num, int numOfDigits) {

        return num / (int) Math.pow(10, numOfDigits);

    }

    public static int removeFirstDigit(long num) {
        int numOfDigits = (int) (Math.log10(num));
        if (num == 0) return 0;
        return (int) (num % Math.pow(10, numOfDigits));
    }

}
