package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class K_Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        for (int i = 1; i<=num ; i++){
            if (num % i == 0) System.out.println(i);
        }
    }
}
