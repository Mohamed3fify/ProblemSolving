package codeForces.assiutSheet.array;

import java.util.Scanner;

public class U_Is_B_SubsequenceOfA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfFirstArray = scanner.nextInt();
        int sizeOfSecondArray = scanner.nextInt();
        int[] arr1 = new int[sizeOfFirstArray];
        int[] arr2 = new int[sizeOfSecondArray];
        int[] subArray = new int[sizeOfSecondArray];
        int flag = 0 ;
        int l = 0 ; int m = 0 ;

        for (int i = 0 ; i < arr1.length; i++){
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < arr2.length; i++){
            arr2[i] = scanner.nextInt();
        }

        for (int i : arr1) {

            for (int j : arr2) {

                if (i == j && m < arr2.length) {

                    subArray[m] = i;
                    m++;
                    break;
                }

            }

        }

        while (l < arr2.length){
            if (subArray[l] == arr2[l]) flag = 1 ;
            else {
                flag = 0 ;
                break;
            }
            l++;
        }

        if (flag == 1) System.out.println("YES");
        else System.out.println("NO");




    }
}
