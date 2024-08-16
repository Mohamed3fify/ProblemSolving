package codeForces.assiutSheet.array;

import java.util.Scanner;

public class J_LuckyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];

        for (int i =0; i< array.length ; i++){
            array[i] = scanner.nextInt();
        }
        sort(array);
        checkMinElementFrequency(array);


    }

    public static void checkMinElementFrequency(int[] arr){

        int count = 1;
            int i =0; int j = i+1 ;

            while (arr[i] == arr[j]){
                if (arr[i] < arr[j])break;
                count++;
                i++; j++;
            }
            if (count%2 == 1) System.out.println("Lucky");
            else System.out.println("Unlucky");

    }

    public  static void sort(int[] arr){
        for (int i =0; i< arr.length; i++){
            for (int j =i+1 ; j<arr.length ; j++){
                if (arr[i] > arr[j]) swap(arr , i , j);
            }

        }
    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;
    }
}
