package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class D_FixedPassword {
    public static void main(String[] args) {
        int password = 1999;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input = scanner.nextInt();

            if (input == password){
                System.out.println("Correct");
                break;
            }else System.out.println("Wrong");

       }
    }
}
