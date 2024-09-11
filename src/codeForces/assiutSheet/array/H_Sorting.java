package codeForces.assiutSheet.array;

import java.util.Scanner;

public class H_Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        for (int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();

        }
        bubbleSort(arr);
        print(arr);
    }

    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;

    }

    public static void bubbleSort(int[] arr){
        for (int i=0; i< arr.length -1 ; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    swap(arr, i , j);
                }
            }
        }

    }

    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
