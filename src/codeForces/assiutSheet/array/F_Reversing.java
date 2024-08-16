package codeForces.assiutSheet.array;

import java.util.Scanner;

public class F_Reversing {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i =0; i< array.length; i++){
            array[i] = scanner.nextInt();

        }
        for (int j = array.length  ; j > 0 ; j--){
            System.out.print(array[j - 1] + " ");
        }
    }
}
