//CSC 110
//Faaris Kathrada
//Assignment 4
//Code Credit to LilAnne Jackson

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;

public class Assignment4 {

	/* When executing please run as
	 java Assignment4.java scores.dat
	 or with other data sheet - it will run checks for each but uses a file tool
	 that pulls from a cmd defined sheet instead of hardcoding to pull
	 */
	 
	public static void main (String[] args) {
		Scanner grades = new Scanner(System.in);
		System.out.print("Passing Grade for Final ==>  ");
		double newInt = grades.nextDouble();
		System.out.println(newInt);
		System.out.println(" C O U R S E   G R A D E   C A L C U L A T O R");
		System.out.println("    Purpose: Calculates a student grade");
		Path filePath = Paths.get(args[0]);
		try {
			//Stream<String> lines = Files.lines(filePath);
			Scanner input = new Scanner(filePath);
			gradeProcessing(input);
		} catch(IOException e) {

		}

	}

	// gradeProcessing: inputs data and calculates a grade, sums each grade
	public static void gradeProcessing(Scanner inFile) {
		double passingGrade;

		//for (int i = 0; i < numberStudents; i++) {
		do {
			if (inFile.hasNextLine()) inFile.nextLine();
			//System.out.print("Passing Grade for Final ==>  ");
			passingGrade = 50;
			//inFile.nextDouble();
			String idNumber = inFile.next();
			System.out.println("Student: " + idNumber);
			double grade = wAverage("Assignment ", 10, 7, 3.0, inFile) ;
			System.out.println("Grade" + grade);			
			grade += wAverage("Lab ", 1, 10, 0.5, inFile);
			System.out.println("Grade" + grade);
			grade += wAverage("Midterm ", 100, 2, 16, inFile);
			System.out.println("Grade" + grade);			
			double finalExam = wAverage("Final Exam", 100, 1, 42.0, inFile);
			System.out.println("Grade" + finalExam);

			if (finalExam >= passingGrade / 42.0) grade += finalExam;
			else if ((grade + finalExam) > 49.5) grade = 49;
			else grade += finalExam;

			System.out.println("\n");
			System.out.println(" Grade: " + grade);
		} while (inFile.hasNextLine());
	}

	// wAverage - Calculates the average grade for a certain course activity
	public static double wAverage(String activity, int max, int number,
								double weight, Scanner inFile) {
		double sum = 0.0;
		double grade;

		System.out.println("Input " + activity + "(maximum " + max +") :");

		for (int i = 0; i < number; i++) {
			do {
				//System.out.print("  #" + (i+1) + "==>");
				grade = inFile.nextDouble();
				if (grade < 0 || grade > max)
				   System.out.println("  *** ERROR: Value out of range ***");
			} while (grade < 0 || grade > max);
			sum += grade / max;
		}
		return sum * weight;
	}
}