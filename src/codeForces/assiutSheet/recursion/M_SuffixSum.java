package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class M_SuffixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        int firstIndex = arr.length - m;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(getSuffixSum(arr , firstIndex));
    }

    private static long getSuffixSum(int[] arr, int firstIndex) {

        if (firstIndex == arr.length - 1) return arr[firstIndex];
        return getSuffixSum(arr , firstIndex + 1) + arr[firstIndex];
    }
}
