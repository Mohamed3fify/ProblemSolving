package codeForces.assiutSheet.function;

import java.util.Scanner;

public class B_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        print(num);
    }
    public static void print(int num){
        for (int i = 1 ; i <= num; i++){
            if (i == num) System.out.print(i);
            else System.out.print(i+" ");
        }
    }
}
