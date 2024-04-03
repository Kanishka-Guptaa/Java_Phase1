package Assisted_Practice_L5;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched : ");
		int k = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == k)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element Found ");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}
