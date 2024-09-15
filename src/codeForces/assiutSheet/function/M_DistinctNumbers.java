package codeForces.assiutSheet.function;

import java.util.ArrayList;
import java.util.Scanner;

public class M_DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(countInputNumbersFromUser(arr , list , scanner));


    }

   public static int countInputNumbersFromUser(int[] arr , ArrayList<Integer> list , Scanner scanner){
       int count  = 0;
       for (int i = 0; i < arr.length; i++) {
           int x = scanner.nextInt();
           arr[i] = x;
           if (list.contains(x)) continue;
           list.add(x);
           count++;

       }
       return count ;
   }

}
