package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;
public class E_AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double pi = 3.141592653;
        double area = pi * (Math.pow(r , 2));
        System.out.printf("%.9f%n",area);
    }
 }

