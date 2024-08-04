package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class Y_EasyFibonacci {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] fib = new int[num] ;
        if (num >= 1){
            fib[0] = 0;
            if (num >= 2){
                fib[1] = 1;
                for (int i = 2; i< num ; i++){
                    fib[i] = fib[i -1] + fib[i - 2];
                }
            }
            for (int i = 0; i < num ; i++){
                System.out.print(fib[i] + " ");
            }

        }

    }

}
