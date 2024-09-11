package codeForces.assiutSheet.array;

import java.util.Arrays;
import java.util.Scanner;

public class V_FrequencyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int query = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        int[] frequencyArray = new int[query + 1];


        Arrays.fill(frequencyArray, 0);


        for (int i = 0 ; i < arr.length ; i++){

            int x = scanner.nextInt();
            arr[i] = x;
            frequencyArray[x]++;
        }

        for (int i = 1 ;i < frequencyArray.length; i++){

            System.out.println(frequencyArray[i]);
        }

    }
}
