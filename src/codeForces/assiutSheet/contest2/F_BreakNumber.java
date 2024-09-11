package codeForces.assiutSheet.contest2;


import java.util.Scanner;

public class F_BreakNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFreq = scanner.nextInt();
        long[] arr = new long[numberOfFreq];
        int count = 0; int maxCounter = 0;
        
        for (int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextLong();
        }

        for (long i : arr){
            while (i % 2 == 0){
                count++;
                i/=2;
            }

            if (maxCounter < count) maxCounter = count ;
            count = 0;

        }
        System.out.println(maxCounter);
    }
}
