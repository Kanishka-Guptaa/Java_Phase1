package Assisted_Practice;

public class Access_ModifiersDemo 
{
	public static void main(String[] args) 
	{
        Access_Modifiers am = new Access_Modifiers();

        System.out.println("Public variable: " + am.publicVariable);
        am.publicMethod();

        System.out.println("Protected variable: " + am.protectedVariable);
        am.protectedMethod();

        System.out.println("Default variable: " + am.defaultVariable);
        am.defaultMethod();
        
        //Private members are not accessible outside the class
        //System.out.println("Private variable: " + am.privateVariable);
        //am.privateMethod();
    }
}
