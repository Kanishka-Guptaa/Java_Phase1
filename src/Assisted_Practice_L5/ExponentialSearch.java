package Assisted_Practice_L5;

import java.util.*;

public class ExponentialSearch 
{
    public static int binarySearch(int[] arr, int target, int left, int right) 
    {
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int exponentialSearch(int[] arr, int target) 
    {
        int n = arr.length;
        if (arr[0] == target)
            return 0;
        int i = 1;
        while (i < n && arr[i] <= target)
            i *= 2;
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

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
		System.out.println("Enter element to be searched : ");
		int k = sc.nextInt();
		Arrays.sort(arr);
        int result = exponentialSearch(arr, k);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found");
    }
}

