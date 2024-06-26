package Assisted_Practice_L3;

public class Rectangle implements Geometric, Drawable 
{
	private double width;
    private double height;

    public Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() 
    {
        return width * height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing a rectangle");
    }
}
