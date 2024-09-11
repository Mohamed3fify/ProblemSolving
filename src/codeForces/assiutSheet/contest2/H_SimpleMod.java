package codeForces.assiutSheet.contest2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class H_SimpleMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long y = 0 ; int flag = 0;

        Random random = new Random();
        int a =  ThreadLocalRandom.current().nextInt();  int b =  ThreadLocalRandom.current().nextInt();
        if ( (Math.pow(a ,2) + Math.pow(b, 2)) % n == 0) System.out.print(a + " " + b + "\n");

        /*for (long x =1; x<=n; x++){
            if ((Math.pow(x,2) + Math.pow(y,2)) % n == 0 ) {
                System.out.print(x + " " + y + "\n");
                flag = 1 ;
                break;
            }

            y++;
        }
        if (flag == 0) System.out.println("No solutions");*/
    }
}
