package Assisted_Practice_L4;

public class DoublyLinkedList 
{
	Node head;

    DoublyLinkedList() 
    {
        head = null;
    }

    void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void traverseForward() 
    {
        if (head == null) 
        {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        System.out.println("Forward Traversal:");
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void traverseBackward() 
    {
        if (head == null) 
        {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        System.out.println("Backward Traversal:");
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
