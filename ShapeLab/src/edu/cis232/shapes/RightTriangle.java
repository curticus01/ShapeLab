package edu.cis232.shapes;

public class RightTriangle implements Shape
{
	double base;
	double height;
	
	public RightTriangle(double base, double height)
	{
		this.base= base;
		this.height = height;
	}
	
	public double getArea()
	{
		double area;
		area = (base*height)/2;
		return area;
	}
	public double getPerimeter()
	{
		double paremeter;
		paremeter = (height + base)+Math.sqrt((height*height) + (base*base));
		return paremeter;
	}

}
