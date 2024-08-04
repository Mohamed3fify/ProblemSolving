package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class R_SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long num1;
        long num2;
        do {
            num1 = scanner.nextLong();
            num2 = scanner.nextLong();
            long min = Math.min(num1, num2);
            long max = Math.max(num1, num2);
            long sum = 0;

            for (long i = min; i <= max; i++) {
                if (num1 > 0 && num2 > 0) System.out.print(i + " ");
            }

            while (min <= max) {
                sum += min;
                min++;
            }

            if (num1 > 0 && num2 > 0) {
                System.out.print("sum" + " " + "=" + sum);
                System.out.println();
            }

        } while (num1 > 0 && num2 > 0);


    }

}
