package Assisted_Practice;

class Shape 
{
    private String color;

    public Shape() 
    {
        color = "Lavender";
    }
    
    public Shape(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
}

public class Constructor 
{
	public static void main(String[] args) 
	{
        Shape defaultShape = new Shape();
        System.out.println("Default color: " + defaultShape.getColor()); 

        Shape customShape = new Shape("Pink");
        System.out.println("Custom color: " + customShape.getColor()); 
    }

}
