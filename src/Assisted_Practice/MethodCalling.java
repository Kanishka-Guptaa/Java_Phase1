package Assisted_Practice;

public class MethodCalling 
{

    // Method with no parameters and no return value
    public static void greet() 
    {
        System.out.println("Method with no parameter and no return value.");
    }

    // Method with parameters and return value
    public static int mul(int a, int b) 
    {
        return a * b;
    }

    // Method with a parameter but no return value
    public static void printMessage(String message) 
    {
        System.out.println(message);
    }

    public static void main(String[] args) 
    {
        // Calling a method with no parameters and no return value
        greet();

        // Calling a method with parameters and return value
        int sum = mul(15, 3);
        System.out.println("Multiplication : " + sum);

        // Calling a method with a parameter but no return value
        printMessage("Method with a parameter but no return value.");

        // Another way of calling a method with parameters and return value
        int x = 10, y = 7;
        int result = mul(x, y);
        System.out.println("Result : " + result);

        // Yet another way of calling a method with parameters and return value
        System.out.println("Result : " + mul(20, 30));
    }
}

