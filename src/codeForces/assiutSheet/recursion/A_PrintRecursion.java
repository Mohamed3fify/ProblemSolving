package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class A_PrintRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = takeInput(scanner);
        int count = 0;
        print(number , count);
    }

    private static int takeInput(Scanner scanner) {
        return  scanner.nextInt();
    }
    private static void print(int number , int count) {
        count++;
        if (count > number) return;
        System.out.println("I love Recursion");
        print(number , count);

    }
}
