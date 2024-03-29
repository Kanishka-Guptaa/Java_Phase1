package Assisted_Practice_L3;

import java.util.Scanner;

public class Exceptionkeywords 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        try 
        {
        	System.out.print("Enter the amount : ");
            double amt = scanner.nextDouble();
            BankAccount account = new BankAccount(amt);

            System.out.print("Enter the amount to withdraw: ");
            double withdraw = scanner.nextDouble();
            account.withdraw(withdraw);
            System.out.println("Withdrawal successful. \nRemaining balance: " + account.getBalance());
        } 
        catch(InsufficientFundsException e) 
        {
        	System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) 
        {
        	System.out.println("An error occurred: " + e.getMessage());
        }
        finally 
        {
        	System.out.println("In finally block.");
        }
	}
}

