package codeForces.assiutSheet.function;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Another sol of C_WonderfulNumber wihtout using String but give error in test case 8*/
public class CopyOfWonderfullNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (isWonderful(num)) System.out.println("YES");
        else System.out.println("NO");

    }
    private static boolean isWonderful(long number) {
        long binary = getBinaryNumber(number);
        long palindromeBinary = getPalindromeBinaryNumber(binary);

        return binary == palindromeBinary && isOdd(number) ;

    }
    public static boolean isOdd(long number){
        return number % 2 == 1;
    }
    public static Long getBinaryNumber(long num){
        /* 1 2 4 8 16 32 64 128 ...
         2^0 2^1 2^2 2^3 2^4 2^5 2^6 */

        ArrayList<Long> binaryDigitList = new ArrayList<>();
        long binaryNumber = 0;

        while (num > 0){
            long digit =  num % 2 ;
            binaryDigitList.add(digit);
            num/=2;
        }

        for (long digit : binaryDigitList){
            binaryNumber = binaryNumber * 10 + digit;
        }

        return binaryNumber;
    }
    public static Long getPalindromeBinaryNumber(long binaryNum){

        ArrayList<Long> listOfDigits = new ArrayList<>();
        long palindromeBinaryNumber = 0;

        while (binaryNum > 0){
            long mod = binaryNum % 10;
            listOfDigits.add(mod);
            binaryNum/=10;
        }

        for (long digit : listOfDigits){
            palindromeBinaryNumber = palindromeBinaryNumber * 10 + digit ;
        }

        return palindromeBinaryNumber;
    }

    /*
       public static Long getPalindromeNumber(long number){

        ArrayList<Long> listOfDigits = new ArrayList<>();
        long palindromeNum = 0;

        while (number > 0){
            long numberMod = number % 10;
            number/=10;
            listOfDigits.add(numberMod); // 5 2 7 9

        }

        for (long digit : listOfDigits){ // 0 * 10 + 5 = 5 // 5 * 10 = 50 + 2 = 52 // 52 * 10 = 520 + 7 = 527 // 527 * 10 = 5270 + 9 = 5279
            palindromeNum = palindromeNum * 10 + digit ;
        }

        return palindromeNum;
    }
    * */
}

