package Practice_Project_L1;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        int choice;
        double result;
        
        do
        {
        	System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
        	System.out.println("\nSelect the operation which you want to perform:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.println("Enter your choice (1-4): ");
            choice = sc.nextInt();
            result = 0;
            switch (choice) 
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) 
                    {
                        result = num1 / num2;
                    } 
                    else 
                    {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Result: " + result);    
            
            System.out.println("Do you want to perform more operation?\nIf yes, press Y... otherwise press N");
            ch = sc.next().charAt(0);          	
        }while(ch == 'Y' || ch == 'y');     
    }
}
