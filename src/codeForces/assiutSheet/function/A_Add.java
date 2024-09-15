package codeForces.assiutSheet.function;

import java.util.Scanner;

public class A_Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(add(num1 ,num2)) ;

    }
    public static int add(int num1 , int num2){
        return num1 + num2 ;
    }
}
