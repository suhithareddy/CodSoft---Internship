// STUDENT GRADE CALCULATOR

package com.tap.project;
import java.util.Scanner;
public class TASK2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of subjects : ");
		int numSub = scan.nextInt();
		
		int totalMarks = 0;
		String grade;
		
		for(int i=1;i<=numSub;i++){
			System.out.println("Enter subject " + i+ " marks : ");
			int marks = scan.nextInt();
			
			 if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks. Marks should be between 0 and 100.");
	                return;
	            }
			 totalMarks+=marks;
		}
			 
		double avgPercentage = totalMarks/numSub;
		//System.out.println(avgPercentage);
		
		 if (avgPercentage >= 90) {
	            grade = "A+";
	        } else if (avgPercentage >= 80) {
	            grade = "A";
	        } else if (avgPercentage >= 70) {
	            grade = "B";
	        } else if (avgPercentage >= 60) {
	            grade = "C";
	        } else if (avgPercentage >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }
		 
		 System.out.println("Total Marks: " + totalMarks);
	     System.out.println("Average Percentage: " + avgPercentage + "%");
	     System.out.println("Grade: " + grade);

	}

}
