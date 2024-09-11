package codeForces.assiutSheet.array;

import java.util.Scanner;

public class Y_RangeSumQuery {
    public static void main(String[] args) {
        // Sol number 2
     Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int query = scanner.nextInt();
        long[] arr = new long[sizeOfArray];
        long sum = 0;
        long[] prefixSumArray = new long[sizeOfArray + 1];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextLong();
            sum += arr[i] ;
            prefixSumArray[i + 1]+= sum ;
        }

       for (int i = 1; i <= query; i++){
           int lift = scanner.nextInt();
           int right = scanner.nextInt();
           long rangeSumQuery = prefixSumArray[right] - prefixSumArray[lift - 1];
           System.out.println(rangeSumQuery);
       }
        // Sol number 1
       /*
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int query = scanner.nextInt();
        long[] arr = new long[sizeOfArray];
        long sum = 0;
        long[] prefixSumArray = new long[sizeOfArray];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextLong();
            sum += arr[i] ;
            prefixSumArray[i]+= sum ;
        }


        for (int i = 1; i <= query; i++){

            int lift = scanner.nextInt();
            int right = scanner.nextInt();
            long rangeSum = prefixSumArray[right - 1] ;

            if (lift == 1) System.out.println(rangeSum);
            else System.out.println(rangeSum - (prefixSumArray[lift - 2]));

        }
        */


    }

}
