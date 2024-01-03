package task1;

import java.util.Scanner;
class Checker{
	 boolean check(String name) {
		name=name.replaceAll("\\s", "");
		return name.equals(new StringBuilder(name).reverse().toString());
	}
}
public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the String");
		    String name=s.nextLine();
		    Checker ck=new Checker();
		    ck.check(name);
		    if(ck.check(name)) {
			    System.out.println("the given string is palindrome");
		     }
		    else {
			    System.out.println("the given string is not a palindrome");
		     }
		
	   }

    }
}
