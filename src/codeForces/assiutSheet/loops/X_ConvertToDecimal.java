package codeForces.assiutSheet.loops;

import java.util.*;

public class X_ConvertToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = scanner.nextInt();
        for (int i = 1 ; i<=numOfTestCases; i++){
            long decimalNum = scanner.nextLong();
            long numberDiv = decimalNum ;

            ArrayList<Integer> binaryNumList = new ArrayList<> (List.of());
            while (numberDiv > 0){
                long numberMod = numberDiv % 2 ;

                if (numberMod == 1) {
                    binaryNumList.add((int) numberMod) ;
                }
                numberDiv/=2 ;
            }
            double convertingDecimalNumber = 0;
            for (int j = 0; j < binaryNumList.size(); j++){
                double converter = binaryNumList.get(j) * Math.pow(2, j);
                convertingDecimalNumber+=converter ;

            }
            System.out.println(((long) convertingDecimalNumber));
        }
        
    }
}
