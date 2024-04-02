package Assisted_Practice_L4;

public class StackMain 
{
	public static void main(String args[])
	{
		Stack s = new Stack(4);
		s.push("hello");
		s.push("world");
		s.push("java");
		s.push("programming");
		
		System.out.print("After pushing 4 elements : ");
		s.display();
		
		s.pop();
		System.out.print("After pop : ");
		s.display();
	}
}
