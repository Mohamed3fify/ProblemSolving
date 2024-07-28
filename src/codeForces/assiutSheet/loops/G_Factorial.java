package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class G_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        long f = 1;
        long x;

        for (int i = 0; i < numCount; i++) {
            int num = scanner.nextInt();
            for ( x = f; x <= num; x++) { // factorial 5 , 5 * 4 * 3 * 2 * 1 = 120
                f = f * x;

            }
            System.out.println(f);
            f = 1;
        }
    }
}
