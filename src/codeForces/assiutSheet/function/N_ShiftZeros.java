package codeForces.assiutSheet.function;

import java.util.Scanner;

public class N_ShiftZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        shiftZerosToRight(arr);
        print(arr) ;

    }

    private static void shiftZerosToRight(int[] arr) {
        int size = arr.length - 1 ; int numberOfZeroes = countZeroes(arr);

        for (int x = 1; x <= numberOfZeroes; x++){

            for (int i = 0; i < size; i++){
                int j = i + 1;

                if (arr[i] == 0 && arr[j] != 0){
                    swap(arr , i , j);
                }

            }
        }

    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;
    }
    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static int countZeroes(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (j == 0) count++;
        }
        return count;
    }
}
