package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class E_BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i = 1; i <= numberOfTestCases; i++){
            long num = scanner.nextLong();
            System.out.println(getBinaryNumberByString(num));

        }
    }

    public static String getBinaryNumberByString(long num){
        if (num == 1) return "1";
        if (num == 0) return "0";
        String digit = String.valueOf(num % 2);

        return getBinaryNumberByString(num / 2) + digit;

    }
    public static long getBinaryNumber(long num){
        if (num <= 1) return 1; long digit = num % 2 ;

        return getBinaryNumber(num / 2) * 10 + digit;

    }
}
