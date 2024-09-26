package codeForces.assiutSheet.recursion;

import java.util.Scanner;
/**
 * this problem will give time limit exceed on test 6 but rewrite the same code
 * in C++ it will be accepted */

public class H_InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        printPyramid(numberOfRows , 1);
    }

    private static void printPyramid(int numberOfRows , int row) {
        if (row > numberOfRows) return;
        
        for (int i = 1 ; i < row; i++){
            System.out.print(" ");
        }

        for (int col = 2 * numberOfRows - 1 ; col >= 2 * row - 1 ; col--){
            System.out.print("*");
        }
        System.out.println();
        printPyramid(numberOfRows , row + 1);
    }
}
