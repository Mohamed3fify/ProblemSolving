package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class P_FirstDigit {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        long num = scanner.nextLong();
        long firstDigit = (int)(Math.log10(num));

        // Find first digit
        firstDigit = (int)(num / (int)(Math.pow(10, firstDigit)));
        if (firstDigit % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");

    }
}
