package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class W_Shape3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int row = 1; row<= num ; row++){
            for (int i =num; i> row; i--){
                System.out.print(" ");

            }
            for (int column = 1; column<= (row * 2 -1 ); column++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = num; row>= 1 ; row--){
            for (int i =num; i> row; i--){
                System.out.print(" ");

            }
            for (int column = (row * 2 -1 ) ; column>= 1; column--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
