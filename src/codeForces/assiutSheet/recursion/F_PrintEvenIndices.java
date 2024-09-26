package codeForces.assiutSheet.recursion;

import java.util.Scanner;
public class F_PrintEvenIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        printEvenIndices(arr, arr.length - 1);

    }

    private static void printEvenIndices(int[] arr, int index) {

        if (index % 2 == 0) System.out.print(arr[index] + " ");
        if (index == 0) return;
        printEvenIndices(arr , index - 1);

    }
}
