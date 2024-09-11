package codeForces.assiutSheet.contest1;

import java.util.Arrays;
import java.util.Scanner;

public class F_AddingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        convertFromDecimalToBinary(num1 , num2);

    }
    public static void convertFromDecimalToBinary(int num1 , int num2){
        // 2^0 , 2^1 , 2^2 , 2^3 , 2^4 , 2^5 , 2^6 , 2^7
        char[] arr = new char[32] ;
        for (int i =0; i<=31 ;i++){
            if (Math.pow(2,i) == num1 || Math.pow(2,i) == num2) arr[i] = 1 ;
            else arr[i]  = 0 ;

        }
        System.out.print(Arrays.toString(arr));

    }


}
