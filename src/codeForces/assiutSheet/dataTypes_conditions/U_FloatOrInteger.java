package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class U_FloatOrInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double modNum = (num  % 10)   ;
        if (num % 1 == 0) System.out.println("int" + " " + ((int) num));
        else if (num % 1 != 0) System.out.println("float" + " " + ((int) num) + " " +  ( modNum - ((int) modNum)));
    }
}
