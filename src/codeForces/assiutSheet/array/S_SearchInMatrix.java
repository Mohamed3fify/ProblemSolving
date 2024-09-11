package codeForces.assiutSheet.array;

import java.util.Scanner;

public class S_SearchInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns] ;
        int flag = 0;


        for (int i = 0; i< rows ; i++){
            for (int j =0; j< columns ;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int targetNumber = scanner.nextInt();

        for (int i = 0; i< rows ; i++){
            if (flag == 1 ) break;
            for (int j =0; j< columns ;j++){
                if (arr[i][j] == targetNumber) {
                    flag = 1;
                    break;
                }
                else flag = 0 ;
            }
        }
        if (flag == 1) System.out.println("will not take number");
        else System.out.println("will take number");
    }
}
