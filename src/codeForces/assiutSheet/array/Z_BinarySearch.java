package codeForces.assiutSheet.array;

import java.util.Arrays;
import java.util.Scanner;

public class Z_BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int query = scanner.nextInt();
        long[] arr = new long[numberOfElements];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextLong();
        }

        Arrays.sort(arr);

        for (int i = 0; i < query; i++){
            long target = scanner.nextLong();

            binarySearch(arr , target);

        }
    }


    public static void binarySearch(long[] arr , long target){
        int flag = 0 ;
        int low = 0 ; int high = arr.length - 1;

         while (low < high + 1){


            int mid = (low + high ) / 2 ;

            if (arr[mid] == target) {
               System.out.println("found");
                flag = 1 ;
                break;
            }
            else if (arr[mid] < target){
                low =  mid + 1 ;

            }
            else if (arr[mid] > target) {
                high = mid - 1 ;
            }


         }

         if (flag == 0) System.out.println("not found");

    }

}
