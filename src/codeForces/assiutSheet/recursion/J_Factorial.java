package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class J_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count  = 0; long fac = 1 ;
        //System.out.println(getFactorial(number ,count , fac));
        System.out.println(getFactorial(number));
    }

    private static long getFactorial(int number , int count , long fac) {
       count++;
       fac*=count;
       if (count == number) return fac ;
       return getFactorial(number ,count , fac);

    }
    private static long getFactorial(int number) {
        if (number <= 1) return 1;
        return getFactorial(number - 1) * number ;

    }
}
