package codeForces.assiutSheet.function;

import java.util.Scanner;

public class J_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        double[] arr = new double[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextDouble();
        }
        System.out.printf("%.6f%n" ,calculateAverage(arr));

    }

    private static double calculateAverage(double[] arr) {
        double numberOfElements = arr.length;

        return calculateSum(arr) / numberOfElements ;

    }

    private static double calculateSum(double[] arr) {
        double sum = 0;
        for (double i : arr){
            sum+=i;
        }
        return sum ;
    }

}
