package codeForces.assiutSheet.array;

import java.util.Scanner;

public class W_MirrorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        long[][] arr = new long[row][column];

        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column; j++){
                arr[i][j] = scanner.nextLong();
            }
        }

        for (int i = 0  ; i < row ; i++){

            for (int j = column - 1  ; j >= 0; j--){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
