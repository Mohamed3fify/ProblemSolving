package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class F_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i =1; i<=12 ; i++){
            System.out.println(num + " " + "*" + " " + i +  " = " + num * i);
        }
    }
}
