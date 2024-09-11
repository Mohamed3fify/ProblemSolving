package codeForces.assiutSheet.contest2;

import java.util.Scanner;

public class D_RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

       for (int i=1; i<= numberOfTestCases; i++){

           long n = scanner.nextLong(); long m = scanner.nextLong();
           long min = Math.min(n ,m) ; long max = Math.max(n , m) ;

           long sumFromMinToMax = max * (max + 1) / 2 - (min - 1) * min / 2 ;

           System.out.println(sumFromMinToMax);
       }
    }

}
