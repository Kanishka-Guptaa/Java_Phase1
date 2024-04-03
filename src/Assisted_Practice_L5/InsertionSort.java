package Assisted_Practice_L5;

import java.util.Scanner;

public class InsertionSort 
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
		for (int i = 1; i < n; ++i) 
		{
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		System.out.println("Sorted Array:");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
    }
}

