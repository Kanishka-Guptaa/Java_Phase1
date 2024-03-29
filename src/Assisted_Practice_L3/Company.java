package Assisted_Practice_L3;

public class Company 
{
	public static void main(String[] args) 
	{
        Manager m1 = new Manager("John Doe", "M001", 60000, "Finance");
        Manager m2 = new Manager("Alice Smith", "M002", 50000, "HR");

        System.out.println("Manager 1 Details:");
        m1.displayDetails();
        System.out.println("Calculated Salary : " + m1.calculateSalary());
        System.out.println();

        System.out.println("Manager 2 Details:");
        m2.displayDetails();
        System.out.println("Calculated Salary : " + m2.calculateSalary());
    }

}
