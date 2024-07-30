package codeForces.assiutSheet.dataTypes_conditions;

import java.util.Objects;
import java.util.Scanner;

public class L_TheBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String firstPersonName = scanner.next();
      String firstPersonFatherName = scanner.next();

      String secondPersonName = scanner.next();
      String secondPersonFatherName = scanner.next();

      if(Objects.equals(firstPersonFatherName, secondPersonFatherName)) {
          System.out.println("ARE Brothers");
      }else System.out.println("NOT");

      if (firstPersonFatherName.equals(secondPersonFatherName)) System.out.println("Are Brothers");




    }
}
