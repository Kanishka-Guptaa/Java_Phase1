package Assisted_Practice_L3;


class Manager extends Employee 
{
    private String department;

    public Manager(String name, String id, double salary, String department) 
    {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public double calculateSalary() 
    {
    	double sal = super.calculateSalary();
        return sal + ((10*sal)/100);
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("\nDepartment : " + department);
    }
}
