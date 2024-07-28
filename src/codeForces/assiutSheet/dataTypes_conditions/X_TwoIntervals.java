package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class X_TwoIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long num4 = scanner.nextLong();

        if (num3 > num1 && num3 <num2 && num4 > num1 && num4 < num2 || (num1 == num3 && num2> num4)) System.out.println(num3 + " " + num4);
        else if (num1 > num3 && num1 < num4  && num2 > num3 && num2 < num4) System.out.println(num1 + " " + num2);
        else if (num2 >= num3 && num1 <= num3) System.out.println(num3 + " " + num2);
        else if (num1 == num4 || num2 == num4 || (num4 > num1 && num4<num2)) System.out.println(num1 + " " + num4);

        else System.out.println(-1);


    }
}
