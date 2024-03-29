package Assisted_Practice_L3;

public class BankAccount 
{
	private double balance;

    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException 
    {
        if (amount > balance) 
        {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        balance -= amount;
    }

    public double getBalance() 
    {
        return balance;
    }

}
