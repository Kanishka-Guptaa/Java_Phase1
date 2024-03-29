package Assisted_Practice_L3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        try 
        {
            System.out.print("Enter an integer: ");
            int num = a.nextInt();
            System.out.println("You entered: " + num);
        } 
        catch (InputMismatchException e) 
        {
        	System.out.println("Error: Input must be an integer.");
        } 
    }
}
