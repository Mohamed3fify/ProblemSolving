package codeForces.assiutSheet.array;

import java.util.Scanner;

public class D_PositionsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        long[] arr = new long[numberOfElements];
        for (int i =0; i < arr.length; i++){
            arr[i] = scanner.nextLong();

        }
        for (int j =0; j <arr.length; j++){
            if (arr[j] <= 10){
                System.out.println("A"+"[" +j + "]" + " " + '=' + " " + arr[j] );
            }

        }
    }
}
