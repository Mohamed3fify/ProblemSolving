package codeForces.assiutSheet.string;

import java.util.Scanner;

public class J_CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] arr = input.toCharArray();
        int[] countLetters = new int[26];


        for (char c : arr) {
            int index = c - 'a';
            countLetters[index]++;
        }
        for (int i = 0 ;i < countLetters.length; i++){
            char ch = (char) (i + 'a');

            if (countLetters[i] == 0) continue;

            System.out.println(ch + " : " + countLetters[i]);
        }
    }
}
