package edu.cis232.shapes;

public class Square implements Shape{
	
	double length;
	public Square(double length)
	{
		this.length = length;
	}
	
	
	public double getArea(){
		double area = 0;
		area = length*length;
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = 0;
		perimeter = 4*length;
		return perimeter;
	}
	
	public String toString(){
		String output = String.format("This Square has an Area of %.2f and a Perimeter of %.2f", getArea(), getPerimeter());
		return output;
	}
}
