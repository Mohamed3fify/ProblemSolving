package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class W_MathematicalExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        char sign = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        char equel = scanner.next().charAt(0);
        int result = scanner.nextInt();

        if (sign == '+' && result == (num1+num2)) System.out.println("Yes");
        else if (sign == '+' && result != (num1+num2)) System.out.println(num1+num2);

        if (sign == '-' && result == (num1-num2)) System.out.println("Yes");
        else if (sign == '-' && result != (num1+num2)) System.out.println(num1-num2);

        if (sign == '*' && result == (num1*num2)) System.out.println("Yes");
        else if (sign == '*' && result != (num1+num2)) System.out.println(num1*num2);



    }
}
