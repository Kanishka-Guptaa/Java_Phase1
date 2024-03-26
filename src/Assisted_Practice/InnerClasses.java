package Assisted_Practice;

class School 
{
	private String schoolName;
	public School(String name) 
	{
		this.schoolName = name;
    }
	class Student 
	{
		private String studentName;
		public Student(String name) 
		{
			this.studentName = name;
		}
		public void display() 
		{
			System.out.println("School: " + schoolName + "\nStudent: " + studentName);
		}
	}
	
	public void enrollStudent(String studentName) 
	{
		Student student = new Student(studentName);
		student.display();
	}
}

public class InnerClasses 
{
	public static void main(String[] args) 
	{
	     School s1 = new School("Daniel High School");
	     s1.enrollStudent("Alice");
	 }
}
