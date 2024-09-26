package codeForces.assiutSheet.recursion;

import java.math.BigInteger;
import java.util.Scanner;
/**Combination  5C2 = factorial of 5  / (factorial of 2 * (factorial of 5 - 2))
 * /////////////////////////////////////
 *  nCr = factorial of n  / (factorial of r * (factorial of n - r))
 * */
public class T_Combination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        BigInteger facN = getFactorial(n);
        BigInteger facR = getFactorial(r);
        BigInteger facN_R = getFactorial(n-r);
        BigInteger combination ;
        if (n == r) combination = BigInteger.valueOf(1);
        else combination = facN.divide(facR.multiply(facN_R));
        System.out.println(combination);

    }

    private static BigInteger getFactorial(int num) {
        if (num <= 1) return BigInteger.valueOf(1);

        return getFactorial(num - 1).multiply(BigInteger.valueOf(num)) ;

    }

}

/*
* private static long getFactorial(int num) {
        if (num <= 1) return 1;

        return getFactorial(num - 1) * num ;

    }*/
