package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class E_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOFValues = scanner.nextInt();
        long max = Long.MIN_VALUE ;
        int  input  ;
        int  count  =0;

       while (count < countOFValues){
           input  = scanner.nextInt();
           if (input > max) max = input ;
           count++ ;
       }
        System.out.println(max);

    }
}
