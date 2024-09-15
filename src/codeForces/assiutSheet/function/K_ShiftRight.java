package codeForces.assiutSheet.function;

import java.util.Scanner;

public class K_ShiftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        int numberOfShifting = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        shiftRight(arr , numberOfShifting);
        print(arr);
    }

    private static void shiftRight(int[] arr , int numberOfShifting) {

        for (int j = 1; j <= numberOfShifting ; j++){

            for (int i = arr.length - 1 ; i > 0; i--){
                int y = i -1 ;
                swap(arr , i , y);
            }
        }

    }
    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;

    }
}
