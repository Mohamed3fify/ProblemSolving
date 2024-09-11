package codeForces.assiutSheet.array;

import java.util.Scanner;

public class X_8_Neighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        scanner.nextLine();

        char[][] arr = new char[101][101];


        for (int i = 1; i <= row; i++) {
            String input = scanner.nextLine();
            for (int j = 1; j <= column; j++) {
                arr[i][j] = input.charAt(j - 1);
            }
        }

        int targetRow = scanner.nextInt()   ;
        int targetColumn = scanner.nextInt()   ;


        if (arr[targetRow][targetColumn - 1] != '.' && arr[targetRow][targetColumn + 1] != '.'
                && arr[targetRow - 1][targetColumn] != '.' && arr[targetRow + 1][targetColumn] != '.'
                && arr[targetRow + 1][targetColumn + 1] != '.' && arr[targetRow - 1][targetColumn - 1] != '.'
                && arr[targetRow + 1][targetColumn - 1] != '.' && arr[targetRow - 1][targetColumn + 1] != '.'
        ) System.out.println("yes");
        else System.out.println("no");


    }
}
