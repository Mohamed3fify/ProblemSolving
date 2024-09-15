package codeForces.assiutSheet.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class O_FiveInOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        int maxNumber; int minNumber; int countPrimes = 0;
        int countPalindromes = 0; int highCounter = 0;
        int maximumDivisorNumber = 0;


        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if (isPrime(arr , i)) countPrimes++;
            if (arr[i] == getPalindrome(arr ,i)) countPalindromes++;

        }

        Arrays.sort(arr);
        maxNumber = arr[arr.length - 1];
        minNumber = arr[0];

        for (int i = 0; i < arr.length; i++){

            if (isPrime(arr , i)) continue;
            if (countDivisors(arr , i) >= highCounter) {
                highCounter = countDivisors(arr ,i);
                maximumDivisorNumber =  arr[i];

            }
        }

        if (highCounter == 0) maximumDivisorNumber = maxNumber ;

        System.out.println("The maximum number : " + maxNumber +
                "\n" + "The minimum number : " + minNumber +
                "\n" + "The number of prime numbers : " + countPrimes +
                "\n" + "The number of palindrome numbers : " + countPalindromes +
                "\n" + "The number that has the maximum number of divisors : " + maximumDivisorNumber
        );


    }
    public static boolean isPrime(int[] arr , int index){
        if (arr[index] == 1) return false ;
        for (int i = 2 ; i < arr[index] - 1; i++){
            if (arr[index] % i == 0) return false;

        }
        return true ;
    }

    public static int getPalindrome (int[] arr , int index){
        int number = arr[index]; int palindromeNumber = 0 ;
        ArrayList<Integer> digitsOfNumber = new ArrayList<>();
        while (number > 0){

            digitsOfNumber.add(number % 10);
            number/=10;
        }

        for (int digit : digitsOfNumber){
            palindromeNumber = palindromeNumber * 10 + digit ;
        }

        return palindromeNumber ;
    }

    public static int countDivisors(int[] arr , int index){
        int count = 0; int number = arr[index];
        for (int i = 1 ; i <= number; i++){
            if (number % i == 0) count++;
        }
        return count;
    }
}
