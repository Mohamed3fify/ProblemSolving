package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class P_Shape1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRowAndColumns = scanner.nextInt();

        for (int row = numOfRowAndColumns ; row >= 1 ; row--){
            for (int column = 1; column <= row ; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
