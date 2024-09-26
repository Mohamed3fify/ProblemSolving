package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class K_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        int index = 0;  int max =  Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMaxNumber(arr ,index ,max));
    }

    private static int findMaxNumber(int[] arr , int i , int max) {

        if (arr[i] > max) max = arr[i] ;
        if (i == arr.length - 1) return max;
        return findMaxNumber(arr , i + 1 , max);
    }
}
