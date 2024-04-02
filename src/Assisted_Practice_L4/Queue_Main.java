package Assisted_Practice_L4;

public class Queue_Main 
{
	public static void main(String args[])
	{
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.print("Elements in queue : " );
		q.display();
		
		q.dequeue();
		System.out.print("After removing element : " );
		q.display();
	}
}
