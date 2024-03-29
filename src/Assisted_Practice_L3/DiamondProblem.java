package Assisted_Practice_L3;

public class DiamondProblem 
{
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        
        System.out.println("Rectangle area : " + rectangle.area());
        System.out.println("Circle area : " + circle.area());

        rectangle.draw();
        circle.draw();
	 }
}
