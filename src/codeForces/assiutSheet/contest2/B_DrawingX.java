package codeForces.assiutSheet.contest2;

import java.util.Scanner;

public class B_DrawingX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int row = 0; row< num ;row++){

            for (int column = 1; column<=num; column++){
                if (row + 1 == (num / 2 + 1) && column == (num / 2 + 1) ) System.out.print("X");
                else if (column == row+1) System.out.print("\\");
                else if (column == (num - row)) System.out.print("/");
                else System.out.print('*');
            }
            System.out.println();
        }
    }
}
