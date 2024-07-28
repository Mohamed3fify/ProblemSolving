package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Scanner;

public class G_SumFrom1ToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        long result = num * (num + 1) / 2;
        System.out.println(result);

        // long result =0;
        /*for (int i=0 ; i<=N ; i++){
                result+=i;
        }*/
    }
}
