package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class Y_TheLastTowDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long num4 = scanner.nextLong();
        long multplyMod = (num1 % 100 ) * (num2 % 100 )  * (num3 % 100)  * (num4 % 100);
        long mulMod = multplyMod % 100 ;
        //System.out.println(mulMod);
        System.out.printf("%02d%n", mulMod);

    }
}
