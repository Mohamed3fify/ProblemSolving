package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class S_SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        sumOfConsecutiveOddNumbers();

    }

    private static void sumOfConsecutiveOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = scanner.nextInt() ;
        for (int i =1 ; i<= numOfTestCases ; i++){
            long num1 = scanner.nextLong(); long num2 = scanner.nextLong();
            long min = Math.min(num1 , num2); long max = Math.max(num1 , num2);
            long sum = 0;
            while (min < max){
                min++;
                if (min == max) break;
                if (min % 2 != 0) sum +=min ;


            }
            System.out.println(sum);


        }
    }
}
