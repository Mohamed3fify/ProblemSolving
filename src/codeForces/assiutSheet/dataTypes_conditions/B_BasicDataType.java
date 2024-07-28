package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class B_BasicDataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        long l = scanner.nextLong();
        char c = scanner.next().charAt(0);
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();

        System.out.println(i + "\n" + l + "\n" + c + "\n" + f + "\n" + d);

        /*
        another solution

        String input = scanner.nextLine();
        String[] values = input.split(" ");

        int i = Integer.parseInt(values[0]);
        long l = Long.parseLong(values[1]);
        char c = values[2].charAt(0);
        float f = Float.parseFloat(values[3]);
        double d = Double.parseDouble(values[4]);

        System.out.println(i + "\n" + l + "\n" + c + "\n" + f + "\n" +d);

       */

    }
}