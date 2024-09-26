package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class S_ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        long count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            count++;
        }
        double avg = (double) getSum(arr, 0) / count;

        System.out.printf("%.6f%n", avg);
    }

    private static long getSum(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return getSum(arr , i + 1) + arr[i];
    }
}
