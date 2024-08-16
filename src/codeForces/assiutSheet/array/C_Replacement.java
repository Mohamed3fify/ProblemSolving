package codeForces.assiutSheet.array;

import java.util.Scanner;

public class C_Replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int []arr = new int[numberOfElements];
        for (int i = 0 ; i< numberOfElements; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) arr[i] = 1 ;
            else if (arr[i] < 0) arr[i] = 2;
            System.out.print(arr[i] + " ");
        }

    }
}
