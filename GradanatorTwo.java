// Nicolas Neven
// 10/24/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #4
//
// This program prompts a student for grades on exams/homework and computes the relative course grade

import java.util.*;

public class GradanatorTwo {
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      intro();
      double test1 = tests(console, "Midterm");
      double test2 = tests(console, "Final");
      double homework = homework(console); 
      conclusion(test1, test2, homework);
   }
   
   // Prints the introduction to the Gradanator program
   public static void intro() {
   
      System.out.println("This program reads exam/homework scores");
      System.out.println("and reports your overall course grade.");
      System.out.println();
   }
   
   // Takes in paramaters and calculates your weighted grade on the midterm and final
   public static double tests(Scanner console, String testType) {
   
      System.out.println(testType + ":");
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Scores earned? ");
      int score = console.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? ");
      int shift = console.nextInt();
      int shiftValue = 0;
      
      if (shift == 1) {
         System.out.print("Shift amount? ");
         shiftValue = console.nextInt();
      }
      
      score = Math.min(score + shiftValue, 100);
      System.out.println("Total points = " + score + " / 100");
      double weightedScore = (double)score / (100/(double)weight);
      System.out.printf("Weighted score = %.1f / " + weight, weightedScore);
      System.out.println();
      System.out.println();
      
      return weightedScore;
   }
   
   // Takes in paramaters and calculates your weighted grade on the homework
   public static double homework(Scanner console) {
   
      System.out.println("Homework:");
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Number of assignments? ");
      int assignments = console.nextInt();
      System.out.print("How many points total per assignment? ");
      int pointsTotal = assignments * console.nextInt();
      int score = 0;
      int max = 0;
      
      for (int i = 1; i <= assignments; i++) {
      
         System.out.print("Assignment " + i + " score and max? ");
         score += console.nextInt();
      }
      double weightedScore = (double)score / (pointsTotal/(double)weight);
      System.out.println("Total points = " + (score) + " / " + (pointsTotal));
      System.out.printf("Weighted score = %.1f / " + weight, weightedScore);
      System.out.println();
      System.out.println();
      
      return weightedScore;
   }
   
   // Prints your overall percentage, GPA, and custome message based on your grades and scores
   public static void conclusion(double test1, double test2, double homework) {
   
      double grade;
      grade = test1 + test2 + homework;
      System.out.printf("Overall percentage = %.1f", grade);
   }
}