package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class Q_3NPlus1_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(calculate3NPlus1(num, 1));
    }

    private static int calculate3NPlus1(int num , int count) {
        if (num == 1) return count ;
        else if (num % 2 != 0 && num > 1){
            num = 3 * num + 1 ; count+=1;

        }

        return calculate3NPlus1(num / 2 , count + 1);

    }


}
