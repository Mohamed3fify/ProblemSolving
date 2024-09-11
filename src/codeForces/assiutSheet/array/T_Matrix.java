package codeForces.assiutSheet.array;

import java.util.Scanner;

public class T_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[][] arr = new int[sizeOfArray][sizeOfArray] ;
        int[] primaryDiagonalArray = new int[sizeOfArray];
        int[] secondaryDiagonalArray = new int[sizeOfArray];
        int secondaryArrayTarget = sizeOfArray - 1  ;

        int sumOfPrimaryDiagonalArray = 0 ;  int sumOfSecondaryDiagonalArray = 0 ;


        for (int row = 0; row < sizeOfArray; row++){

            for (int column = 0; column < sizeOfArray; column++){
                arr[row][column] = scanner.nextInt() ;

                if (row == column) {
                    primaryDiagonalArray[row] = arr[row][column] ;
                    sumOfPrimaryDiagonalArray+= primaryDiagonalArray[row] ;
                }

                if (column == secondaryArrayTarget) {
                    secondaryDiagonalArray[row] = arr[row][column] ;
                    sumOfSecondaryDiagonalArray+= secondaryDiagonalArray[row] ;
                }

            }
            secondaryArrayTarget--;
        }
        int absoluteDifference = Math.abs(sumOfPrimaryDiagonalArray - sumOfSecondaryDiagonalArray) ;

        System.out.println(absoluteDifference);





    }
}
