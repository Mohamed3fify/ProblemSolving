package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class I_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNumber = scanner.nextLong();
        StringBuilder inputStringNum = new StringBuilder(String.valueOf(inputNumber));

        while (inputNumber  % 10 == 0){
            inputNumber /= 10 ;
        }

        long digits = inputNumber ;
        long palindromeNumber ;
        StringBuilder palindromeStringNum = new StringBuilder();



        while (digits > 0) {

            palindromeNumber = digits % 10 ;
            System.out.print(palindromeNumber);

            palindromeStringNum.append(palindromeNumber) ;
            digits/=10 ;

        }

        System.out.println();

        if (palindromeStringNum.compareTo(inputStringNum) == 0) System.out.println("YES");
        else System.out.println("NO");


    }
}
