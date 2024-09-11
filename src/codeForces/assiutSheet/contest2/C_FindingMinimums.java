package codeForces.assiutSheet.contest2;

import java.util.Scanner;

public class C_FindingMinimums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numOfValues = scanner.nextLong();
        long k = scanner.nextLong();
        long []arr = new long[(int) numOfValues];
        int min = Integer.MAX_VALUE;

        for (int i =0; i< arr.length ;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i =0 ; i< arr.length; i+= (int) k){
            int  j = i ; int l =0;
            while (l < k){
                if (j >= arr.length) j-- ;
                if (arr[j] < min) min = (int) arr[j];
                l++ ; j++ ;

            }

            System.out.print(min + " ");
            min = Integer.MAX_VALUE;

        }

    }
}
