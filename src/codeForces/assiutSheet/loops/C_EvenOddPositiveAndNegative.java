package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class C_EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfValues = scanner.nextInt();

        int[] inputs = new int[countOfValues];
        int evenCount  = 0;
        int oddCount  = 0;
        int positiveCount  = 0;
        int negativeCount  = 0;

        for (int i = 0; i < countOfValues; i++) {
            inputs[i] = scanner.nextInt();
        }

        for (int input : inputs) {
            if (input % 2 == 0) evenCount++;
            if (input % 2 != 0) oddCount++;
            if (input  > 0) positiveCount++;
           else if (input < 0) negativeCount++;

        }
        System.out.println("Even:" + " " + evenCount);
        System.out.println("Odd:" + " " + oddCount);
        System.out.println("Positive:" + " " + positiveCount);
        System.out.println("Negative:" + " " + negativeCount);
        System.out.println(inputs.length);
    }
}
