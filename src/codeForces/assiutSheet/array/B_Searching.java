package codeForces.assiutSheet.array;

import java.util.Scanner;

public class B_Searching {
    /**Mohamed Afify
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberOfElements = scanner.nextLong();
        int []arr = new int[(int) numberOfElements];
        for (int i = 0; i<numberOfElements; i++){
            arr[i] = scanner.nextInt();

        }
        int targetNumber = scanner.nextInt();
        int flag = 0;

        for (int j = 0; j< arr.length ; j++){
            if (arr[j] == targetNumber){
                System.out.println(j);
                flag = 1;
                break;
            }

        }
        if (flag == 0) System.out.println(-1);


    }
}
