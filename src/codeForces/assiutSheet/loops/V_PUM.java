package codeForces.assiutSheet.loops;

import java.util.Scanner;

public class V_PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 1 ;
        for (int i = 1; i<=num ; i++){
            for (int j = 1; j<= 3; j++){
                System.out.print(count + " ");
                count++ ;
            }
            count++;
            System.out.print("PUM" + "\n");
        }
    }
}
