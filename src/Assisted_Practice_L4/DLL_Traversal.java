package Assisted_Practice_L4;

import java.util.Scanner;

public class DLL_Traversal 
{
	public static void main(String[] args) 
	{
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list : ");
		int n = sc.nextInt();
		System.out.println("Enter elements of list : ");
		for(int i = 0; i < n; i++)
		{
			list.insert(sc.nextInt());
		}
      
        list.traverseForward();
        list.traverseBackward();
    }

}
