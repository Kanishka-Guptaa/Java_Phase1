package Assisted_Practice_L2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Regex Verifier!");
        System.out.println("Enter the regular expression to verify alphabetic characters:");
        String regex = "^[a-zA-Z]+$";

        Pattern pattern = Pattern.compile(regex);

        while(true) 
        {
            System.out.println("Enter a string to match (Enter 'exit' to quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) 
            {
                System.out.println("Exiting...");
                break;
            }

            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) 
            {
                System.out.println("Input string contains only alphabetic characters.");
            } 
            else 
            {
                System.out.println("Input string does not contain only alphabetic characters.");
            }
        }
    }
}
