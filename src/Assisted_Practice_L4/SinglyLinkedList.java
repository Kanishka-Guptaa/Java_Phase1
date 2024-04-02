package Assisted_Practice_L4;

public class SinglyLinkedList 
{
    Node head;

    SinglyLinkedList() 
    {
        head = null;
    }

    void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void delete(int key) 
    {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) 
        {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) 
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;
        prev.next = temp.next;
    }

    void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

