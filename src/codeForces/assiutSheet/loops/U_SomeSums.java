package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class U_SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int a  = scanner.nextInt();
        int b  = scanner.nextInt();
        long digitSum = 0;
        long numberSum = 0;
        for (long i = a ; i<=n; i++){
            for (int j = a; j<=b; j++){
                long numberDigits = i ;

                while (numberDigits > 0){
                    digitSum+=(numberDigits % 10) ;
                    numberDigits/=10;
                }

                if (digitSum >=j && digitSum <=b){
                    numberSum+=i ;
                    digitSum = 0;
                   break;
                }
                digitSum = 0;
            }

        }
        System.out.println(numberSum);
    }
}
