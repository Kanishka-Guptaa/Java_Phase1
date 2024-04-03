package Assisted_Practice_L5;

import java.util.Scanner;

public class MergeSort 
{
	public static void merge(int arr[], int lb, int mid, int ub)
	{
		int n1 = mid - lb + 1;
		int n2 = ub - mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0; i < n1; i++) 
		{
			left[i] = arr[lb + i];
		}
		for(int j = 0; j < n2; j++) 
		{
			right[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = lb;
		while(i < n1 && j < n2)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			arr[k] = right[j];
			j++;
			k++;
		}		
	}
	
	static void mergeSort(int arr[], int lb, int ub)
	{
		int mid = (lb + ub)/2;
		if(lb < ub)
		{
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid + 1, ub);
			merge(arr, lb, mid, ub);
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
		mergeSort(arr,0,n-1);
		System.out.println("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " "); 
		}
	}
}
