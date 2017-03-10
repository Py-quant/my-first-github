import java.io.*;
import java.util.*;

public class Lab8    {
	public static void main(String [] args)throws IOException	{
			System.out.println("Test 2D Arrays ...");

int[][] matrix = {
    {1, 2, 3, 4, 5, 6},
    {7, 8, 9, 10, 11, 12},
    {13, 14, 15, 16, 17, 18}
};

printMatrix(matrix);
}
	public static void printMatrix(int[][] m){
    	try{
        	int rows = m.length;
        	int columns = m[0].length;
        	String str = "|\t";

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                str += m[i][j] + "\t";
            	}

            	System.out.println(str + "|");
            	str = "|\t";
        	}

    	}catch(Exception e){System.out.println("Matrix is empty!!");}
	}


	}



/*

			//Define a 2-dimensional array of integers (dimension 3 x 6)
			int[][] matrix = new int[3][6];
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (i * matrix[0].length) + j + 1;
    }
    System.out.println();
}	System.out.println(" ");


for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(matrix[i][j]);
    }	
}

			//Now, initialize that array with the numbers 1 to 18
			int[][] array2d = new int[3][6];
			for (int i = 0; i < array2d.length; i++) {
    			for (int j = 0; j < array2d[0].length; j++) {
        			array2d[i][j] = (i * array2d[0].length) + j + 1;
    			}		
			}
			for (int i = 0; i < array2d.length; i++) {
    			for (int j = 0; j < array2d[0].length; j++) {
        			System.out.println(array2d[i][j]);
				}
			}

			//Create a method called halfIt, which accepts that array as
			// a parameter and return a *new* 2-dimentional array, in which
			// each value is half of the value in the original array.
			int[][] nameOfNewArray = halfIt();

			// Create a method to print 2-dimensional arrays
			//printArray(originalArray);
			//printArray(newArray);

			//Call the method letterMath below (remember to capture the return value)


			//Create and call a method called printLetters that
			// prints the array of letters created by letterMath
		}

		public static int[][] halfIt() {
			return new int[0][0];
		} 
		public static void printLetters() {
			
		}

//  Method Name:  letterMath  ()
	//	Purpose:  Creates a jagged array of characters and
	//            inserts letters into the array.
	//    <<Before running this code, try to guess what letters are in the array!! >>
	//  Input: none (!!)
	//  Output: a 2-dimensional array of characters.
	public static char[][] letterMath()	{
		char [][] itsJagged = new char[4][];
		char starter = 'a';
		for(int i = 0; i< itsJagged.length; i++)	{
			itsJagged[i] = new char[(i+1)*(i+1)];
			for (int j = 0; j < itsJagged[i].length; j++) {
				int temp = (int) (starter) + i + j ;
				itsJagged[i][j] = (char) temp;
			}
		}
		return itsJagged;
	}

}
	
	
*/