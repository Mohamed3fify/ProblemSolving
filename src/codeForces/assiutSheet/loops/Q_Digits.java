package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class Q_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCasesNumber = scanner.nextInt();
        for (int i = 1 ; i<= testCasesNumber; i++){

            long inputNumber = scanner.nextLong();

            if (inputNumber == 0){
                System.out.print(inputNumber  + " ");

            }
            while (inputNumber > 0) {


                System.out.print(inputNumber % 10 + " ");
                inputNumber/=10 ;
            }
            System.out.println();

        }
    }
}
