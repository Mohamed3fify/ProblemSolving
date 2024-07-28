package codeForces.assiutSheet.contest1;

import java.util.Scanner;

public class B_MemoAndMomo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long memo = scanner.nextLong();
        long momo = scanner.nextLong();
        long divideNumber = scanner.nextLong();
        if (momo % divideNumber == 0 && memo % divideNumber == 0) System.out.println("Both");
        else if (memo % divideNumber == 0) System.out.println("Memo");
        else if (momo % divideNumber == 0) System.out.println("Momo");

        else System.out.println("No One");
    }
}
