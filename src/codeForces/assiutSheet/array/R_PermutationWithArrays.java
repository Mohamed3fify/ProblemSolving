package codeForces.assiutSheet.array;

import java.util.ArrayList;
import java.util.Scanner;

public class R_PermutationWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr1 = new int[numberOfElements];
        int[] arr2 = new int[numberOfElements];

        int flag = 0 ;  int targetIndex = -1 ;
        ArrayList<Integer> list = new ArrayList<>(numberOfElements);

        for (int i =0; i<numberOfElements; i++){
            arr1[i] = scanner.nextInt();
        }

        for (int i =0; i<numberOfElements; i++){
            arr2[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < numberOfElements; i++){

            list.add(targetIndex) ;

            for (int j = 0; j < numberOfElements; j++){

                if (list.contains(j)) continue;

                if (arr1[i] == arr2[j]){
                     targetIndex = j ;

                    flag = 1 ;
                    break;
                }else flag = 0 ;

            }


            if (flag == 0) break;
        }
        if (flag == 1) System.out.println("yes");
        else System.out.println("no");
    }


}
