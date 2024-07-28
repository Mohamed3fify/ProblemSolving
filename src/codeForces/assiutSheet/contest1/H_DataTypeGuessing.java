package codeForces.assiutSheet.contest1;

import java.util.Scanner;

public class H_DataTypeGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double k = scanner.nextDouble();
        double a = scanner.nextDouble();

        double result = n * (k / a) ;
        System.out.println(result);
        if (result % 1 != 0) System.out.println("double");
        else {
            if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) System.out.println("int");

            else System.out.println("long long");
        }

    }
}