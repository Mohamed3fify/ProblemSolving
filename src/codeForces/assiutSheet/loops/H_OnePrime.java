package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class H_OnePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int i ;
        for (i = 2; i <=num -1 ; i++){

            if (num % i == 0) break;

        }
        if (num < 2) System.out.println("NO");
        if (i==num) System.out.println("YES");
        else System.out.println("NO");
    }
}
