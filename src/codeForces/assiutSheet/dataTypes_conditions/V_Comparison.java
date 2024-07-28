package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class V_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        char sign = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        if (num1 > num2 && sign == '>') System.out.println("Right");
        else if (num1 < num2 && sign == '<') System.out.println("Right");
        else if (num1 > num2 && sign == '<') System.out.println("Wrong");
        else if (num1 < num2 && sign == '>') System.out.println("Wrong");
        else if (num1 == num2 && sign == '=') System.out.println("Right");
        else  System.out.println("Wrong");
    }
}
/*
*
*  boolean result = switch (sign) {
            case '>' -> num1 > num2;
            case '<' -> num1 < num2;
            case '=' -> num1 == num2;
            default -> false;
        };

        System.out.println(result ? "Right" : "Wrong");
        
 */
