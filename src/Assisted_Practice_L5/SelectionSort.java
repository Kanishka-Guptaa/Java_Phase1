package Assisted_Practice_L5;

import java.util.Scanner;

public class SelectionSort 
{
	public static void main(String[] args) 
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
		System.out.println("Original Array:");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n-1; i++) 
		{
			int minIndex = i;
            for (int j = i+1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
		System.out.println("Sorted Array:");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
    }
}
