package codeForces.assiutSheet.array;

import java.util.Scanner;

public class M_ReplaceMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        int[] arr = new int[numberOfElements];
        for (int i =0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        replaceMinMax(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void replaceMinMax(int[] arr) {
        int min =Integer.MAX_VALUE ; int max = Integer.MIN_VALUE ;

        int minIndex=0;  int maxIndex =0 ;
        for (int i =0; i< arr.length; i++){
            if (arr[i] < min) {
                min = arr[i] ;
                minIndex = i;
            }
        }
        for (int i =0; i< arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

        }
        swap(arr , maxIndex , minIndex);
    }

    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;
    }

}
