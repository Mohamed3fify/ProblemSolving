package codeForces.assiutSheet.function;

import java.util.Scanner;

public class L_NewArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arrA = new int[sizeOfArray];
        int[] arrB = new int[sizeOfArray];
        int[] arrC = new int[sizeOfArray * 2] ;

        for (int i = 0; i < sizeOfArray; i++){
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < sizeOfArray; i++){
            arrB[i] = scanner.nextInt();
        }

        createThirdArray(arrA , arrB , arrC);
        print(arrC);
    }

    private static void createThirdArray(int[] arrA, int[] arrB , int[] arrC) {
        for (int i = 0; i < arrC.length; i++){

            if (arrB.length > i){
                arrC[i] = arrB[i] ;
            }
            else arrC[i] = arrA[i - arrA.length];

        }

    }
    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
