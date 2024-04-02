package Assisted_Practice_L4;

import java.util.Scanner;

public class DeleteOccurence 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
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

        System.out.println("Enter key to delete : ");
        int keyToDelete = sc.nextInt();
        list.delete(keyToDelete);

        System.out.println("List after deleting first occurrence of " + keyToDelete + ":");
        list.display();
    }

}
