package codeForces.assiutSheet.array;

import java.util.Scanner;

public class N_CheckCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String input = scanner.next();
        char[] arr = input.toCharArray();
        checkCode(arr , a ,b);
    }

    private static void checkCode(char[] arr , int a , int b) {


        int flag1 = 0 ; int flag2 = 0 ;
        for (int i =0; i< arr.length; i++){
            if (arr[i] == '-' && i == a) {
                flag1 = 1 ;
                break;
            }

        }
        for (int i = 0; i<arr.length; i++){
            char ch = arr[i];
            if (i == a) continue;
            if(Character.isDigit(ch)) flag2 = 1 ;
            else {
                flag2 = 0;
                break;
            }


        }

        if (flag1 == 1 && flag2 == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
