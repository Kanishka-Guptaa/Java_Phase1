package Assisted_Practice;

import java.util.Scanner;

public class Array 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        
        System.out.println("Enter index : ");
        int index = sc.nextInt();
        System.out.println("Element at index " + index + " : " + arr[index]);
        
        System.out.println("Array length: " + arr.length);
	}

}
