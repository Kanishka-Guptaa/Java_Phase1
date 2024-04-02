package Assisted_Practice_L4;

import java.util.*;

public class FourthSmallest 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();
	    System.out.println("Enter the elements:");
	    List<Integer> nums = new ArrayList<>();
	    for (int i = 0; i < n; i++) 
	    {
	        nums.add(sc.nextInt());
	    }
	    Collections.sort(nums);
	    int fourthSmallest = nums.get(3);
	    System.out.println("Fourth Smallest Element: " + fourthSmallest);
	}
	
}


