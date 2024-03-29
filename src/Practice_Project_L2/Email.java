package Practice_Project_L2;

import java.util.Scanner;

public class Email 
{
    public static void main(String[] args) 
    {
        String[] emailArray = {"john@example.com", "alice@example.com", "bob@example.com", "smith@example.com"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();
        boolean found = searchEmail(emailArray, searchEmail);
        if (found) 
        {
            System.out.println("Email ID found in the array.");
        } 
        else 
        {
            System.out.println("Email ID not found in the array.");
        }
    }

    public static boolean searchEmail(String[] emails, String searchEmail) 
    {
        for (String email : emails) 
        {
            if (email.equals(searchEmail)) 
            {
                return true;
            }
        }
        return false;
    }
}

