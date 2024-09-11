package codeForces.assiutSheet.array;

import java.util.Arrays;
import java.util.Scanner;

public class L_MaxSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();


       for (int i =0; i<numberOfTestCases; i++){
           int numberOfElements = scanner.nextInt();
           int[] arr = new int[numberOfElements] ;


           for (int j =0; j<arr.length; j++){
               arr[j] = scanner.nextInt();
           }


           for (int j =0; j<arr.length; j++){
               int max = Integer.MIN_VALUE; int l;

               for (l = j+1 ; l<arr.length+1; l++){
                   int[]subArray = Arrays.copyOfRange(arr, j, l);
                  for (int k : subArray){
                      if (max < k) max = k ;

                  }
                   System.out.print(max + " ");
               }
           }
           System.out.println();


       }
    }

}
