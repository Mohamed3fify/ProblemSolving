package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class F_DigitsSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();

        // to get the last digit of the number 
        long lastDigit1 = number1 % 10;
        long lastDigit2 = number2 % 10;

        System.out.println(lastDigit1 + lastDigit2);
    }
}
