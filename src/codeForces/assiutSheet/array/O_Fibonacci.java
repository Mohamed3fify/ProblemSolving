package codeForces.assiutSheet.array;

import java.util.Scanner;

public class O_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long[] fib = new long[(int) num];
        if (num >= 1){
           fib[0] = 0;
           if (num >=2){
               fib[1] = 1;
               for (long i=2; i< num; i++){
                   fib[(int) i] = fib[(int) (i -1)] + fib[(int) (i-2)];
               }
           }

       }
        System.out.println(fib[(int) (num -1)]);

    }

    public static int fibonacci(int num) {
        if (num == 1) return 1;
        else if (num == 0) return  0 ;
        else return fibonacci(num-1) + fibonacci(num -2);

    }

}
