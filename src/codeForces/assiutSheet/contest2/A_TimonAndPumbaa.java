package codeForces.assiutSheet.contest2;

import java.util.Scanner;

public class A_TimonAndPumbaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        if (a - b >= 0) System.out.println(a - b);
        else System.out.println(0);
    }
}
