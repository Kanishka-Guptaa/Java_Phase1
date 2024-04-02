package Assisted_Practice_L4;

public class Stack 
{
	int n;
	String arr[];
	int top;
	
	Stack(int n)
	{
		this.n = n;
		this.arr = new String[n];
		this.top = -1;
	}
	
	boolean isEmpty()
	{
		return (top == -1);
	}
	
	boolean isFull()
	{
		return (n-1 == top);
	}
	
	public void push(String data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{
			top++;
			arr[top] = data;
		}
	}
	
	public String pop()
	{
		String value = "";
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			value = arr[top];
			top--;
		}
		return value;
	}
	
	public String peek()
	{
		String value = "";
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			value = arr[top];
		}
		return value;
	}
	
	 public void display() 
	 {
		 if(isEmpty()) 
		 {
			 System.out.println("Stack is empty.");
        }
        for (int i = top; i >= 0; i--) 
        {
        	System.out.print(arr[i] + " ");
	    }
        System.out.println();
     }
}
