package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class Z_ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextInt();
        long s = scanner.nextInt();
        long trueCases = 0;

        for (long x = 0; x<=k ; x++){

            for (long y = 0; y<=k ; y++){
                   long z = s - x - y ;

                   if (z >=0 && z <= k) trueCases++ ;
            }
        }
        System.out.println(trueCases);

    }
}
