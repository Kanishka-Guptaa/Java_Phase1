package Assisted_Practice_L5;

import java.util.Scanner;

public class QuickSort 
{
	public static int  partition(int arr[], int start, int end)
	{
		int pivot = arr[start];
		int i = start + 1;
		int j = end;
		while(i <= j)
		{
			if(arr[i] <= pivot)
			{
				i++;
			}
			else if(arr[j] > pivot)
			{
				j--;
			}
			else
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[start];
		arr[start] = arr[j];
		arr[j] = temp;
		return j;
	}
	
	public static void quickSort(int arr[], int lb, int ub)
	{
		int loc;
		if(lb < ub)
		{
			loc = partition(arr,lb,ub);
			quickSort(arr,lb,loc-1);
			quickSort(arr,loc+1,ub);
		}
	}
	
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
		quickSort(arr,0,n-1);
		System.out.println("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " "); 
		}
	}

}
