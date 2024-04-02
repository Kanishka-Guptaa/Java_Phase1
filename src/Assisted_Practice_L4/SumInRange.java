package Assisted_Practice_L4;

import java.util.Scanner;

public class SumInRange 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of L (0 <= L <= n-1): ");
        int L = scanner.nextInt();
        System.out.print("Enter the value of R (0 <= R <= n-1): ");
        int R = scanner.nextInt();

        if (L < 0 || R >= n || L > R) 
        {
            System.out.println("Invalid range!");
        } 
        else 
        {
            int sum = 0;
            for (int i = L; i <= R; i++) 
            {
                sum += nums[i];
            }
            System.out.println("Sum of elements : " + sum);
        }
    }
}

