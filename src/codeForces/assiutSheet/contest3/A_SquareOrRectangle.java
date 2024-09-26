package codeForces.assiutSheet.contest3;

import java.util.Scanner;

public class A_SquareOrRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++){
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == height) System.out.println("Square");
            else System.out.println("Rectangle");
        }

    }
}
