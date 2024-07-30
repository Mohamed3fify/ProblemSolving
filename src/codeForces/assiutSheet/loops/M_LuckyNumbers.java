package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class M_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = Math.max(num1 , num2) ;
        int min = Math.min(num1 , num2) ;
        int flag = 1;
        boolean notLucky = true ;


        while (min <= max) {

            int digits = min;

            while (digits > 0){

                if (digits % 10 != 4 && digits % 10 != 7) {
                    flag  =  0 ;
                    break;
                } else flag = 1 ;

                digits = digits / 10 ;
            }
            if (flag == 1) {
                System.out.print(min + " ");
                notLucky = false ;
            }
            min++;


        }
        if (notLucky) System.out.print(-1 + " ");
    }
}
