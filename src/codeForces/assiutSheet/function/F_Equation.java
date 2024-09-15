package codeForces.assiutSheet.function;

import java.util.Scanner;

public class F_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(equation(x,n));

    }

    private static long equation(int x, int n) {
        long sum = 0;
        for (int i = 2; i <= n; i+=2){
            long equation = (long) Math.pow(x , i);

            sum+= equation;
        }
        return sum;
    }
}
