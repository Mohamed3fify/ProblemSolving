package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class T_Shape2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input  = scanner.nextInt();
        for (int row = 1; row <= input ; row++){

           for (int j = input; j > row ; j--){
               System.out.print(" ");

           }

            for (int column = 1; column<=(2 *row - 1); column++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
