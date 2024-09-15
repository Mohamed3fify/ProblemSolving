package codeForces.assiutSheet.function;

import java.util.Scanner;

public class D_PrimeFunction {
    /**
  To determine if a number n is prime,
   you don't need to check all numbers from 2 to n-1. Instead,
    you only need to check divisibility by numbers up to the square root of n.

     Let's check if 29 is a prime number.
     Find the square root: √29 ≈ 5.385.
     Check divisibility: We only need to test divisibility by  numbers less than or equal to 5, which are 2, 3, and 5.
     we can skip 4 (all even numbers except (2) )
     29 is not divisible by 2.
     29 is not divisible by 3.
     29 is not divisible by 5.
     so 29 is prime
     **/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for (int i = 1; i <= numberOfTestCases; i++){
            long number = scanner.nextLong();
            if (isPrime(number)) System.out.println("YES");
            else System.out.println("NO");
        }

    }

    private static boolean isPrime(long number){

      if (number == 1) return false ;
      int sqr = (int) Math.sqrt(number);

      for (int i = 2; i <= sqr; i++){
          if (i > 2 && i % 2 == 0) continue;
          if (number % i == 0) return false;

      }
      return true;
    }


}
