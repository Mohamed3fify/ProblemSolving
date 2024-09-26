package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class O_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }
    public static int fibonacci(int num){
        if (num == 1) return 0;
        if (num == 2) return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

}
