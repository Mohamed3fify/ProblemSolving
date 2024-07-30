package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class N_NumbersHistogram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        int casesNumber = scanner.nextInt();
        for (int i =1; i<=casesNumber; i++){
            int numbers = scanner.nextInt();

             for (int row = 1 ; row <= numbers ; row++){
                 System.out.print(symbol);
             }

            System.out.println();
        }
    }
}
