package codeForces.assiutSheet.contest1;

import java.util.Scanner;

public class A_WinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discountPercentage = scanner.nextDouble();
        double priceAfterDiscount = scanner.nextDouble();

        double actualPrice = (priceAfterDiscount) / ( 1 - (discountPercentage / 100));

        System.out.println(actualPrice);

    }
}
