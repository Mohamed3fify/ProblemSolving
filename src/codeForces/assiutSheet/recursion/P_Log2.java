package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class P_Log2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long result = getLog2(number,0);
        System.out.println(result);

    }

    // 2^0 2^1 2^2 2^3 2^4 2^5 2^6 ...etc --> 1 2 4 8 16 32 64 ...etc
    private static long getLog2(long number , long count) {
        if (number == 0) return count - 1;

        return getLog2(number / 2 ,count + 1);

    }
}
