package edu.cis232.shapes;

public class Rectangle implements Shape 
{
	double length;
	double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public double getArea()
	{
		double area;
		area = length * width;
		return area;
	}
	public double getPerimeter()
	{
		double perimeter;
		perimeter = (length *2)+(width*2);
		return perimeter;
	}

}
