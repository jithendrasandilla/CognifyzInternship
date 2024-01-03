package task1;

import java.util.Scanner;
class Converter{
	 public float Temperature=0;
	float converter(float temp){
		Temperature=((temp*9/5)+32);
			return Temperature ;}
	float converters(float temp1) {
		Temperature=((temp1-32)*5/9);
		return Temperature;
	}
}
public class Temperature {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Converter cv=new Converter();
		while(true) {
		System.out.println("Select the choice");
		System.out.println("\t1.Celcius to Fahrenheit\n\t2.Fahrenheit to Celcius\n\t3.exit");
		System.out.println("Enter the choice");
		int choice =s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the celsius Temperature");
			float temp=s.nextFloat();
			cv.converter(temp);
			System.out.println("The Fahrenheit Temperature is "+cv.Temperature);
			break;
			
		case 2:
			System.out.println("Enter the Fahrenheit Temperature");
			float temp1=s.nextFloat();
			cv.converters(temp1);
			System.out.println("The Celsius Temperature is "+cv.Temperature);
			break;
		case 3:
			System.out.println("exited!");
			System.exit(0);
			
			
			default:
				System.out.println("you entered an invalid choice");
				break;
				
			}
		}
	}
		
	}


