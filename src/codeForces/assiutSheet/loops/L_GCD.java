package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class L_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long maxNum = num1 ;
        if (maxNum < num2) maxNum = num2 ;
        int maxDivisor = 0;

        for (int i = 1; i<=maxNum ; i++){
            if (num1 % i == 0 && num2 % i == 0 ) {

               if (maxDivisor < i) { maxDivisor =  i; }
            }
        }

        System.out.println(maxDivisor);
    }
}
