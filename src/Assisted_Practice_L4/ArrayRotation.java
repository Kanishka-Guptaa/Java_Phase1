package Assisted_Practice_L4;

import java.util.Scanner;

public class ArrayRotation  
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int n;
    	System.out.println("Enter size of array : ");
    	n = sc.nextInt();
    	int arr[] = new int[n];
    	System.out.println("Enter elements of array : ");
    	for(int i = 0; i < n; i++)
    	{
    		arr[i] = sc.nextInt();
    	}
        int steps = 5; 

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        steps %= n; 

        int temp[] = new int[steps];
        for (int i = n - steps, j = 0; i < n; i++, j++) 
        {
            temp[j] = arr[i];
        }

        for (int i = n - 1; i >= steps; i--) 
        {
            arr[i] = arr[i - steps];
        }

        for (int i = 0; i < steps; i++) 
        {
            arr[i] = temp[i];
        }

        System.out.println("\nArray after rotating by " + steps + " steps to the right:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
