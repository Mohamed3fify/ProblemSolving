package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class L_Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
            System.out.println(sumElements(arr, 0));

    }

    private static long sumElements(int[] arr, int i) {

        if (i == arr.length - 1) return arr[i];
        return sumElements(arr, i + 1) + arr[i];
    }
}
