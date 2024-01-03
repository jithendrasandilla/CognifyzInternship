package task1;


import java.util.*;

public class PasswordGenerator {
    
    public static String generatePassword(int length, boolean useDigits, boolean useLowercase, boolean useUppercase, boolean useSpecialChars) {
      String chars= "";

      if(useDigits) {
          chars += "0123456789";
      }
      if(useLowercase) {
        chars += "abcdefghijklmnopqrstuvwxyz";
      }
      if(useUppercase) {
        chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      }
      if(useSpecialChars) {
        chars += "!@#$%^&*()-/*+;:[]{}<>?";
      }

      if(chars.isEmpty()) {
        return "Please choose atlease one type of character!";
      }
     
      Random random = new Random();
      StringBuilder password = new StringBuilder();
       
       for(int i=0;i<length;i++) {
         int randomIndex = random.nextInt(chars.length());
         password.append(chars.charAt(randomIndex));
       }
        return password.toString();
    }
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the desired length of Password: ");
        int length = s.nextInt();
        System.out.println("if you want desired character in password then type yes otherwise 10type no");

        System.out.print("\nInclude numbers?(yes/no) : ");
        boolean useDigits = s.next().equalsIgnoreCase("yes");

        System.out.print("\nInclude lowercase letters?(yes/no) : ");
        boolean useLowercase = s.next().equals("yes");

        System.out.print("\nInclude Uppercase letters?(yes/no) : ");
        boolean useUppercase = s.next().equals("yes");
        
        System.out.print("\nInclude Special Characters?(yes/no) : ");
        boolean useSpecialChars = s.next().equals("yes");

        String password = generatePassword(length, useDigits, useLowercase, useUppercase, useSpecialChars); 
        s.close();

        System.out.println("\nGenerated password is =>    "+ password);
    }
}
