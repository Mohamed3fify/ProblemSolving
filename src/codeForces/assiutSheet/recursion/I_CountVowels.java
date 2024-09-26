package codeForces.assiutSheet.recursion;

import java.util.Scanner;

public class I_CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(countVowels(input , 0 , 0));
    }

    private static int countVowels(String input , int count , int length) {
        char[] chars = input.toCharArray();
        if (input.length() == length) return count;
        if (
            chars[length] == 'a' || chars[length] == 'i' || chars[length] == 'o'  || chars[length] == 'e' || chars[length] == 'u'
        ||
           chars[length] == 'A' || chars[length] == 'I' || chars[length] == 'O'  || chars[length] == 'E' || chars[length] == 'U'
        ){

            count+=1; length+=1;
        }
        else return countVowels(input , count , length + 1) ;
        return countVowels(input , count , length) ;
    }
}
