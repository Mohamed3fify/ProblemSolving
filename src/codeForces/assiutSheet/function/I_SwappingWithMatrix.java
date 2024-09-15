package codeForces.assiutSheet.function;

import java.util.Scanner;

public class I_SwappingWithMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] arr = new int[sizeOfArray + 1][sizeOfArray + 1];

        for (int row = 1; row <= sizeOfArray ; row++){
            for (int column = 1; column <= sizeOfArray; column++){
                arr[row][column] = scanner.nextInt();
            }
        }

        for (int rowIndex = 1 ; rowIndex <= sizeOfArray; rowIndex++){
            swapMatrixColumn(arr , x , y , rowIndex);
        }

        for (int columnIndex = 1 ; columnIndex <= sizeOfArray; columnIndex++){

            swapMatrixRow(arr , x , y , columnIndex);
        }

        print(arr , sizeOfArray);
    }

    private static void swapMatrixRow(int[][] arr , int x , int y , int columnIndex) {

        int temp = arr[x][columnIndex];
        arr[x][columnIndex] = arr[y][columnIndex] ;
        arr[y][columnIndex] = temp ;
    }

    public static void swapMatrixColumn(int[][] arr , int x , int y , int rowIndex){
        int temp = arr[rowIndex][x];
        arr[rowIndex][x] = arr[rowIndex][y];
        arr[rowIndex][y] = temp ;

    }

    public static void print(int[][] arr , int sizeOfArray){

        for (int row = 1; row <= sizeOfArray ; row++){
            for (int column = 1; column <= sizeOfArray; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}
