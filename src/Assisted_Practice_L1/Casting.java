package Assisted_Practice_L1;

public class Casting 
{
	public static void main(String args[])
	{
		int a = 101;
		System.out.println("Integer value: " + a);
		System.out.println("\nImplicit type conversion from int to float");
		float f = a;
		System.out.println("\nFloat value: " + f);
		
		System.out.println("\nExplicit type conversion from int to char");
		char ch = (char) a;
		System.out.println("\nCharacter value: " + ch);
	}
}
	