package codeForces.assiutSheet.array;

import java.util.Scanner;

public class A_Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberOfElements = scanner.nextLong();
        long []arr = new long[(int) numberOfElements];
        long sum = 0;

        for (int i =0 ; i< numberOfElements ; i++){
            arr[i] = scanner.nextLong();
            sum+=arr[i];
        }
        if (sum < 0) sum = Math.abs(sum) ;
        System.out.println(sum);
    }
}
