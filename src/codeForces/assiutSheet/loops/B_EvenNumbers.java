package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class B_EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        for (long i=1; i<=input ; i++){
            if (i % 2 ==0) System.out.println(i);
        }
        if (input<2)System.out.println(-1);

    }

}
