package Assisted_Practice_L4;


import java.util.Scanner;

public class MatrixMultiplication 
{
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
        	System.out.print("Enter the number of rows in the first matrix: ");
            int rows1 = scanner.nextInt();
            System.out.print("Enter the number of columns in the first matrix: ");
            int cols1 = scanner.nextInt();

            int[][] mat1 = new int[rows1][cols1];
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows1; i++) 
            {
                for (int j = 0; j < cols1; j++) 
                {
                    mat1[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Enter the number of rows in the second matrix: ");
            int rows2 = scanner.nextInt();
            System.out.print("Enter the number of columns in the second matrix: ");
            int cols2 = scanner.nextInt();
            
            if (cols1 != rows2) 
            {
                throw new IllegalArgumentException("Number of columns in the first matrix should be equal to the number of rows in the second matrix");
            }

            int[][] mat2 = new int[rows2][cols2];
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows2; i++) 
            {
                for (int j = 0; j < cols2; j++) 
                {
                    mat2[i][j] = scanner.nextInt();
                }
            }
            int[][] result = new int[rows1][cols2];

            for (int i = 0; i < rows1; i++) 
            {
                for (int j = 0; j < cols2; j++) 
                {
                    for (int k = 0; k < cols1; k++) 
                    {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Resultant matrix after multiplication:");
            for (int i = 0; i < result.length; i++) 
            {
                for (int j = 0; j < result[0].length; j++) 
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
