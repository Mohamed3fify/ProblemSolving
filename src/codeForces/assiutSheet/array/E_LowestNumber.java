package codeForces.assiutSheet.array;

import java.util.Scanner;

public class E_LowestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        int min = Integer.MAX_VALUE;
        int position = 0;
        for (int i =0; i< array.length; i++){
            array[i] = scanner.nextInt();
            if (array[i] < min) {
                min = array[i];
                position = i+1 ;
            }

        }
        System.out.print(min + " " + position);
    }
}
