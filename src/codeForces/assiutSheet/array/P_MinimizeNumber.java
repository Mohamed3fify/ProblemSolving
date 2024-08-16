package codeForces.assiutSheet.array;

import java.util.Scanner;

public class P_MinimizeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        for (int i =0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        checkMaximumEvenOperations(arr);
    }

    private static void checkMaximumEvenOperations(int[] arr) {

        int count = 0; int flag = 0; int k = 0;
        while (arr[k] % 2 ==0){

            for (long i = 0; i< arr.length; i++){

                if (arr[(int) i] % 2 != 0) {
                    flag=0;
                    break;
                }
                else {
                    arr[(int) i]/=2;
                    flag = 1;


                }
            }
            if (flag == 1) count++;

        }


         System.out.println(count);


    }
}
