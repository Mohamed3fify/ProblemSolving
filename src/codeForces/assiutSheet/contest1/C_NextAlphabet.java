package codeForces.assiutSheet.contest1;

import java.util.Scanner;

public class C_NextAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int acsllNum = ch;

        if (acsllNum>=97 && acsllNum<=122) { // a to A
            if (acsllNum == 122) acsllNum = acsllNum - 26;

            ch = (char) (acsllNum + 1);
            System.out.println(ch);

        }
    }
}
