package Assisted_Practice_L3;

import java.util.Scanner;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
        	System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            double result = (double) numerator / denominator;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) 
        {
        	System.out.println("Error: Division by zero is not allowed.");
        } 
        catch(Exception e) 
        {
        	System.out.println("An error occurred: " + e.getMessage());
        } 
    }
}

