package codeForces.assiutSheet.contest1;

import java.util.Scanner;

public class I_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 10 || num > 99) System.out.println("NO");
        else if ((num % 10) % (num / 10) == 0 || (num / 10) % (num % 10)  == 0 ) System.out.println("YES");
        else System.out.println("NO");

    }
}
