package codeForces.assiutSheet.array;

import java.util.Scanner;

public class K_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        String string = scanner.next();
        char[] arr = string.toCharArray();

        long sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            char ci = arr[i];
            String st = Character.toString(ci);
            sum += Integer.parseInt(st);

        }
        System.out.println(sum);
    }
}
