package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\d+)([+\\-*/])(\\d+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            long num1 = Long.parseLong(matcher.group(1));
            char operation = matcher.group(2).charAt(0);
            long num2 = Long.parseLong(matcher.group(3));

            switch (operation) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        } else {
            System.out.println("Invalid input format.");
        }
    }
}
