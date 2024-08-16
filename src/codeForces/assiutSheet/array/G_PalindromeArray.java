package codeForces.assiutSheet.array;

import java.util.Arrays;
import java.util.Scanner;

public class G_PalindromeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberOfElements = scanner.nextLong();
        long[] array = new long[(int) numberOfElements];
        long[] reversingArray = new long[(int) numberOfElements];

        int n = 0 ;

        for (int i = 0; i < array.length ; i++){
            array[i] = scanner.nextLong();
        }
        for (int j = array.length; j > 0 ; j--){
            reversingArray[j - 1] =  array[n] ;
            n++;
        }

        if (Arrays.equals(array , reversingArray)) System.out.println("YES");
        else System.out.println("NO");
    }
}
