package codeForces.assiutSheet.function;

import java.util.Scanner;

public class E_Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        swap(num1 , num2);


    }
    public static void swap(int num1, int num2){
        int temp = num1 ;
        num1 = num2 ;
        num2 = temp ;
        System.out.println(num1 + " " + num2);

    }

}
