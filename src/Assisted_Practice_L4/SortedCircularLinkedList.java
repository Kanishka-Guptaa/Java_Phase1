package Assisted_Practice_L4;

public class SortedCircularLinkedList 
{
	Node head;

    SortedCircularLinkedList() 
    {
        head = null;
    }

    void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            newNode.next = newNode;
            head = newNode;
        } 
        else if (data <= head.data) 
        {
            Node last = getLastNode();
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        } 
        else 
        {
            Node current = head;
            while (current.next != head && current.next.data < data) 
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    Node getLastNode() 
    {
        Node temp = head;
        while (temp.next != head) 
        {
            temp = temp.next;
        }
        return temp;
    }

    void display() 
    {
        if (head == null) 
        {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node temp = head;
        do 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

}
