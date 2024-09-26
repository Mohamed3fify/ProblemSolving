package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class R_PalindromeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        int[] reversArray = new int[arr.length];
        int[] newArr;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        newArr = getReversArray(arr,reversArray, 0, arr.length - 1);

        compareArrays(arr , newArr);

    }

    private static void compareArrays(int[] arr, int[] newArr) {
        int flag = 0;
       for (int i = 0; i < arr.length; i++){
           if (arr[i] != newArr[i]){
               flag = 1 ;
               System.out.println("NO");
               break;
           }
       }
       if (flag == 0) System.out.println("YES");
    }

    private static int[] getReversArray(int[] arr, int[] reversArray, int reversArrIdx , int arrIdx) {

        reversArray[reversArrIdx] = arr[arrIdx];
        if (arrIdx == 0) return reversArray ;

        return getReversArray(arr ,reversArray ,reversArrIdx + 1 , arrIdx - 1);
    }

}
