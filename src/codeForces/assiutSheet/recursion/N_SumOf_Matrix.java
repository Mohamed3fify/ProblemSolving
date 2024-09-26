package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class N_SumOf_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix2[i][j] = scanner.nextInt();
                System.out.print(getSumOfMatrix(matrix1 , matrix2 , i , j) + " ");
            }
            System.out.println();
        }



    }

    private static long getSumOfMatrix(int[][] matrix1, int[][] matrix2, int row, int column) {
        if (column == column) return  matrix1[row][column] + matrix2[row][column] ;

        return  getSumOfMatrix(matrix1 , matrix2 , row, column ) + matrix1[row][column] + matrix2[row][column];
    }
}
