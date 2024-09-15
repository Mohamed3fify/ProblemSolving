package codeForces.assiutSheet.function;

import java.util.Arrays;
import java.util.Scanner;

public class G_MaxAndMIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        printMinMax(arr);
    }

    private static void printMinMax(int[] arr) {
        
        int minIndex = 0; int maxIndex = arr.length - 1;
        System.out.println(arr[minIndex] + " " + arr[maxIndex]);
    }

}