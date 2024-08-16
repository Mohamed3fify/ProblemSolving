package codeForces.assiutSheet.array;

import java.util.Scanner;

public class I_SmallestPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for (int j = 1 ; j<= numberOfTestCases ;j++){

            int numberOfElements = scanner.nextInt();
            int[] arr = new int[numberOfElements];

            for (int i = 0 ;i< arr.length ; i++){
                arr[i] = scanner.nextInt();
            }

            checkSmallestPair(arr);
        }

    }


    public static void checkSmallestPair(int[] arr){
        int sumOfPairs;
        int smallestPair = Integer.MAX_VALUE;
        for (int i=0; i<arr.length ; i++){
            for (int j = i+1; j< arr.length; j++){
                sumOfPairs = arr[i] + arr[j] + j - i;
                if (smallestPair >  sumOfPairs) smallestPair = sumOfPairs ;
            }
        }
        System.out.println(smallestPair);

    }
}
