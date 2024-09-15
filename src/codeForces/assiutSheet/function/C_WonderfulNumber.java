package codeForces.assiutSheet.function;

import java.util.ArrayList;
import java.util.Scanner;

public class C_WonderfulNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (isWonderful(num)) System.out.println("YES");
        else System.out.println("NO");

    }

    private static boolean isWonderful(long number) {

        return isPalindromeBinary(number) && isOdd(number) ;

    }
    public static boolean isOdd(long number){
        return number % 2 == 1;
    }
    public static boolean isPalindromeBinary(long num){
        String binary = Long.toBinaryString(num);
        return isPalindrome(binary);
    }
    public static boolean isPalindrome(String str){
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    
}
