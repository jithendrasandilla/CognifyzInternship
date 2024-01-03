package task1;

import java.util.Scanner;
public class GradeCalculator {
    
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of Grades : ");
        int noOfGrades = s.nextInt();

        double grades[] = new double[noOfGrades];       //Creating array to store all grades in it

        for(int i=0;i<noOfGrades;i++) {
         System.out.print("Enter grade "+(i+1)+" : ");
         grades[i] = s.nextInt();                      //Inserting data into array         
        }
        
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
         
        double avg = sum/noOfGrades;
        System.out.println("The Average grade is "+avg);
  s.close();
     }
}
