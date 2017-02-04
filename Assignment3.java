//V00863301
//Faaris Kathrada
//CSC110

import java.util.Scanner;

public class Assignment3 {
	public static void main (String[] args) {
		Midterm();
		Assignments();
	}

	public static void Midterm() {
		Scanner console=new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			String prompt="Enter the grade for Midterm "+i+": ";
			int count=getCount(prompt, console);
			System.out.println("The grade you entered is: "+count+"%");
		}
	}

	public static void Assignments() {
		Scanner user_input = new Scanner(System.in);
		for (int j = 1; j <= 7; j++) {
			String input="Enter the grade for Assignment "+j+": ";
			int count2=getCount2(input, user_input);
			System.out.println("The grade you entered is: "+count2+"%");
		}
	}

	public static void Labs() {

	}

	public static int getCount(String prompt, Scanner keyboard) {
		System.out.print(prompt);
		int n=keyboard.nextInt();
		
		if( n <0) {
			System.out.println("You have entered an invalid grade. Please enter a valid grade.");
		} else if (n > 100) {
			System.out.println("Stop banging your students and enter an actual grade of 100 or less.");
		} else if (n>=90) {
			System.out.println("A+");
		} else if (n>=85) {
			System.out.println("A");
		} else if (n>=80) {
			System.out.println("A-");
		} else if (n>=77) {
			System.out.println("B+");
		} else if (n>=73) {
			System.out.println("B");
		} else if (n>=70) {
			System.out.println("B-");
		} else if (n>=65) {
			System.out.println("C+");
		} else if (n>=60) {
			System.out.println("C");
		} else if (n>=50) {
			System.out.println("D");
		} else if (n>=0) {
			System.out.println("F");
		}	
		
		return n;
	}

	public static int getCount2(String input, Scanner keyboard) {
		System.out.print(input);
		int n=keyboard.nextInt();

		if( n <0) {
			System.out.println("You have entered an invalid grade. Please enter a valid grade.");
		} else if (n > 100) {
			System.out.println("Stop banging your students and enter an actual grade of 100 or less.");
		} else if (n>=90) {
			System.out.println("A+");
		} else if (n>=85) {
			System.out.println("A");
		} else if (n>=80) {
			System.out.println("A-");
		} else if (n>=77) {
			System.out.println("B+");
		} else if (n>=73) {
			System.out.println("B");
		} else if (n>=70) {
			System.out.println("B-");
		} else if (n>=65) {
			System.out.println("C+");
		} else if (n>=60) {
			System.out.println("C");
		} else if (n>=50) {
			System.out.println("D");
		} else if (n>=0) {
			System.out.println("F");
		}	

		return n;
	}
	
}