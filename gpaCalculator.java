//Russell Deady
//Program I wrote to calculate grade point average
//1/9/22

import java.util.Scanner;

public class gpaCalculator {
   
   //function to convert the inputted letter grade into the correct amount of points
   static double convertLetterGrade(String grade) {
      if (grade.equals("A") || grade.equals("a")){
         return 4.0;
      }
      else if (grade.equals("A-") || grade.equals("a-")){
         return 3.7;
      }
      else if (grade.equals("B+") || grade.equals("b+")){
         return 3.3;
      }
      else if (grade.equals("B") || grade.equals("b")){
         return 3.0;
      }
      else if (grade.equals("B-") || grade.equals("b-")){
         return 2.7;
      }
      else if (grade.equals("C+") || grade.equals("c+")){
         return 2.3;
      }
      else if (grade.equals("C") || grade.equals("c")){
         return 2.0;
      }
      else if (grade.equals("C-") || grade.equals("c-")){
         return 1.7;
      }
      else if (grade.equals("D+") || grade.equals("d+")){
         return 1.3;
      }
      else if (grade.equals("D") || grade.equals("d")){
         return 1.0;
      }
      else if (grade.equals("D-") || grade.equals("d-")){
         return 0.7;
      }
      else if (grade.equals("F") || grade.equals("f")){
         return 0.0;
      }
      else {
         return 0.0;
      }
      
   }
   
   public static void main(String[] args){
   
      //creating scanner object
      Scanner scan = new Scanner(System.in);
      
      //declaring variables
      int earnedCreditHours = 0;
      int attemptedCreditHours = 0;
      int tempCreditHours = 0;
      int amountOfClasses = 0;
      int input = 1;
      
      double tempPointsEarned = 0;
      double totalPointsEarned = 0;
      double points = 0;
      double GPA = 0;
      
      String grade = "";
      
      //Greeting the user
      System.out.println("Welcome to the GPA calculator!");
      System.out.println("You can enter your letter grades and the accompanying credit hours to find out your gpa."); 
   
      while (input != 0){
         System.out.println("Enter the amount of credit hours the class was: ");
         tempCreditHours = scan.nextInt();
         attemptedCreditHours = attemptedCreditHours + tempCreditHours;
         
         
         System.out.println("Enter the letter grade that you received: ");
         grade = scan.next();
      
         if (grade.equals("F") == false && grade.equals("f") == false){
            earnedCreditHours = earnedCreditHours + tempCreditHours;
         }
         
         
         points = convertLetterGrade(grade);
         
         tempPointsEarned = points * tempCreditHours;
         totalPointsEarned = totalPointsEarned + tempPointsEarned;
      
         amountOfClasses = amountOfClasses + 1;
         
         System.out.println("Enter 0 if you are done or any other number to continue: ");
         input = scan.nextInt();
      }
      
      //calculating the GPA
      GPA = totalPointsEarned / attemptedCreditHours;
      
      //outputting the final results 
      System.out.printf("You took " + attemptedCreditHours + " credits and your GPA is %.2f", GPA);
      
   }
}
