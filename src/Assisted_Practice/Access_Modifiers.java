package Assisted_Practice;

public class Access_Modifiers
{
	public int publicVariable = 10;
	protected int protectedVariable = 20;
	int defaultVariable = 30; 
	private int privateVariable = 40;
	
	public void publicMethod() 
	{
		System.out.println("This is a public method");
	}
	protected void protectedMethod() 
	{
		System.out.println("This is a protected method");
	}
	void defaultMethod() 
	{
		System.out.println("This is a default method");
	}
	private void privateMethod() 
	{
		System.out.println("This is a private method");
	}
}

