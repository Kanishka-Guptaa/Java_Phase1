package Assisted_Practice_L4;

import java.util.Scanner;

public class Insert_CLL 
{
	public static void main(String[] args) 
	{
		SortedCircularLinkedList list = new SortedCircularLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list : ");
		int n = sc.nextInt();
		System.out.println("Enter elements of list : ");
		for(int i = 0; i < n; i++)
		{
			list.insert(sc.nextInt());
		}
 
        System.out.println("Original list:");
        list.display();

        System.out.println("Enter new element : ");
        int ele = sc.nextInt();
        list.insert(ele);

        System.out.println("List after adding new element :");
        list.display();
    }

}
