package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class J_PrimeFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int i ;
        int j ;
        
        for ( j =2 ; j <= num ; j++){
            for (i = 2; i<= j-1; i++){

                if (j%i == 0) break;
            }
            if (i == j) System.out.print(j+" ");
        }

    }
}
