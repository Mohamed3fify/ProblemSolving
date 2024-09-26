package codeForces.assiutSheet.recursion;

import java.util.Scanner;
/**
 * this problem will give time limit exceed on test 6 but rewrite the same code
 * in C++ it will be accepted */
public class G_Pyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        printRow(numberOfRows, 1);
    }

    private static void printRow(int numberOfRows, int row) {

        if (row > numberOfRows) return;
        for (int i = 1; i <= numberOfRows - row; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= 2 * row - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        printRow(numberOfRows, row + 1);

    }

}

 /*
  answer by for loop
 for (int row = 1; row <= numberOfRows; row++){

            for (int i = numberOfRows; i > row; i--){
                System.out.print(" ");
            }

            for (int column = 1; column <= (2 * row - 1); column++){
                System.out.print("*");
            }
            System.out.println();
        }

         private static void printColumn(int row , int col) {
        System.out.print("*");
        if (col == (2 * row - 1)) return;
        printColumn(row , col + 1);

    }

    public static void printSpaces(int row , int i){
        if(i == row) return;
        System.out.print(" ");
        printSpaces(row , i - 1);

    }

        */
