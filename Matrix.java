import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;
import java.nio.file.*;

//Assignment 5
//CSC 110
//Faaris Kathrada

public class Matrix {
	public static void main (String[] args) {
		//Path filePath = Paths.get("Matrix.txt");
		Path filePath = Paths.get(args[0]);
		Scanner input = null;
		try {
			input = new Scanner(filePath);
		} catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		int [][] a = getMatrix(input);
		System.out.println("A: ");
		printMatrix(a);
		int [][] b = getMatrix(input);
		System.out.println("B: ");
		printMatrix(b);
		int c = input.nextInt();
		input.nextLine();
		System.out.println("C: \n" + c + "\n");
		int [][] d = getMatrix(input);
		System.out.println("D: ");
		printMatrix(d);
		int [][] aPlusb = add(a,b);
		printMatrix(aPlusb);
		int [][] aMinusb = subtract(a,b);
		printMatrix(aMinusb);
		int [][] scalarC = scalarMultiply(c,a);
		printMatrix(scalarC);
		int [][] aDotd = dot(a,d);
		printMatrix(aDotd);


	}
	public static int[][] getMatrix(Scanner inFile) {
		String line = inFile.nextLine();
		String [] numbers = line.split(" ");
		int i = 0, j = 0;
		int [][] a = new int[numbers.length/2][2];
		for(int k = 0; k < numbers.length; k++) {
			a[i][j++] = Integer.parseInt(numbers[k]);
			if (j > 1) {
				i++;
				j = 0;
			}
		}
		return a;
	}
	public static int [][] add(int[][] one, int[][] theOther) {
		

		return new int[0][0];
	}	
	public static int [][] subtract(int[][] one, int[][] theOther) {
		return new int[0][0];
	}
	public static int [][] scalarMultiply(int scalar, int[][] matrix) {
		return new int[0][0];
	}
	public static int [][] dot(int[][] one, int[][] theOther) {
		return new int[0][0];
	}
	public static void printMatrix(int[][] matrix) {
		for (int k = 0; k < 2; k++) {
				for (int l = 0; l <  matrix.length; l++) {
					System.out.print(matrix[l][k] + " ");
				}
				System.out.println();
			}

				System.out.println();
	}

}