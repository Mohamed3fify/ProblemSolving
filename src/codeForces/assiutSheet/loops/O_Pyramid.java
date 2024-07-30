package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class O_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues = scanner.nextInt();
        for (int row = 1; row<= numberOfValues ; row++){

            for (int column=1; column<=row ; column++){
                 System.out.print("*");
            }
            System.out.println();

        }
    }
}
