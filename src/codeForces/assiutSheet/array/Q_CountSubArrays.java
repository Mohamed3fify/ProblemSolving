package codeForces.assiutSheet.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_CountSubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i =0; i<numberOfTestCases; i++){
            int numberOfElements = scanner.nextInt();
            int[] arr = new int[numberOfElements] ;

            for (int j =0; j< arr.length; j++){
                arr[j] = scanner.nextInt();

            }
            System.out.println(getSubArrayCount(arr));

        }
    }
    public static int getSubArrayCount(int[] arr){
        int count = 0;
        for (int j =0; j<arr.length; j++){


            for (int l = j+1 ; l<arr.length+1; l++){

                int[]subArray = Arrays.copyOfRange(arr, j, l);

                int previous = Integer.MIN_VALUE ; int flag = 0 ; boolean flag2 = true ;
                for (int current : subArray){

                    if (previous > current){
                        flag2 = false ;
                        break;
                    }
                    else flag = 1 ;


                    previous = current ;

                }
                if (flag == 1 && flag2) count++;


            }
        }
        return count ;
    }
}
