package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class I_WelcomeWithCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a>=b) System.out.println("Yes");
        else System.out.println("No");

    }
}
